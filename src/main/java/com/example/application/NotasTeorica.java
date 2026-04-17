package com.example.application;

import com.example.application.views.notas.Aritmetica;
import com.example.application.views.notas.Notas;

public class NotasTeorica extends Notas implements Aritmetica {
    private double pesoParcial = 0.40;
    private double pesoTaller = 0.40;
    private double pesoProyecto = 0.20;

    public NotasTeorica(double parcial, double taller, double proyecto) {
        super(parcial, taller, proyecto);
    }

    @Override
    public double calcular(double valor) {
        return (getParcial() * pesoParcial) +
                (getTaller() * pesoTaller) +
                (getProyecto() * pesoProyecto);
    }

    @Override
    public String nombre() {
        return "Materia teorica";
    }

    @Override
    public String asignatura() {
        return "JS";
    }
}
