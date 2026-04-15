package com.example.application;

import com.example.application.views.notas.Aritmetica;
import com.example.application.views.notas.Notas;

public class NotaMixta extends Notas implements Aritmetica{

    private double pesoParcial = 0.33;
    private double pesoTaller = 0.33;
    private double pesoProyecto = 0.34;

    public NotaMixta (double parcial, double taller, double proyecto){
        super(parcial, taller, proyecto);
    }
    @Override
    public double calcular(double valor) {
        return (getParcial() * pesoParcial) + (getTaller()*pesoTaller)+(getProyecto()*pesoProyecto);
    }
    @Override
    public String nombre() {
        return "Materia SQL";
    }
    @Override
    public String asignatura() {
        return "SQL";
    }
}
