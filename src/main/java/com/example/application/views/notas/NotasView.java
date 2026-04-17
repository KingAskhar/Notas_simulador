package com.example.application.views.notas;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.NotaMixta;
import com.example.application.NotaPractica;
import com.example.application.NotasPredefinidas;
import com.example.application.NotasTeorica;

import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Notas")
@Route("")
@Menu(order = 0, icon = LineAwesomeIconUrl.FILE)
public class NotasView extends VerticalLayout {

    public NotasView() {

        H2 titulo = new H2("Simulador de Notas");

        ComboBox<Aritmetica> combo = new ComboBox<>("Tipo de materia");
        combo.setItems(NotasPredefinidas.obtener());
        combo.setItemLabelGenerator(Aritmetica::etiqueta);

        NumberField parcialField = new NumberField("Nota parcial");
        NumberField tallerField = new NumberField("Nota taller");
        NumberField proyectoField = new NumberField("Nota proyecto");

        Button calcular = new Button("Calcular");
        Span resultado = new Span();

        calcular.addClickListener(e -> {
            if (combo.getValue() == null) {
                resultado.setText("Por favor selecciona un tipo de materia.");
                return;
            }
            if (parcialField.getValue() == null || tallerField.getValue() == null || proyectoField.getValue() == null) {
                resultado.setText("Por favor ingresa todas las notas.");
                return;
            }
            Aritmetica seleccion = combo.getValue();
            double parcial = parcialField.getValue();
            double taller = tallerField.getValue();
            double proyecto = proyectoField.getValue();
            Aritmetica calculo;

            if (seleccion instanceof NotasTeorica) {
                calculo = new NotasTeorica(parcial, taller, proyecto);
            } else if (seleccion instanceof NotaPractica) {
                calculo = new NotaPractica(parcial, taller, proyecto);
            } else {
                calculo = new NotaMixta(parcial, taller, proyecto);
            }

            double notaFinal = calculo.calcular(0);
            resultado.setText("Nota final: " + String.format("%.2f", notaFinal));
        });

        add(titulo, combo, parcialField, tallerField, proyectoField, calcular, resultado);
    }
}
