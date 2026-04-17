package com.example.application;

import com.example.application.views.notas.Aritmetica;
import com.example.application.views.notas.Notas;

public class NotaPractica extends Notas implements Aritmetica {
    private double pesoParcial = 0.20;
    private double pesoTaller = 0.50;
    private double pesoProyecto = 0.30;

    public NotaPractica(double parcial, double taller, double proyecto) {
        super(parcial, taller, proyecto);
    }

    @Override
    public double calcular(double valor) {
        return (getParcial() * pesoParcial) + (getTaller() * pesoTaller) + (getProyecto() * pesoProyecto);
    }

    @Override
    public String nombre() {
        return "Materia practica";
    }

    @Override
    public String asignatura() {
        return "JAVA";
    }
}