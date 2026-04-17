package com.example.application.views.notas;

public interface Aritmetica {
    String nombre();

    String asignatura();

    double calcular(double valor);

    default String etiqueta() {
        return "Cálculo de " + nombre();
    }
}