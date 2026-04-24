package com.example.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotaPracticaTest {

    @Test
    void calcularShouldUsePracticalWeights() {
        NotaPractica notas = new NotaPractica(5.0, 4.0, 3.0);

        assertEquals(3.9, notas.calcular(10.0), 0.0001);
    }

    @Test
    void etiquetaShouldUseDefaultInterfacePrefix() {
        NotaPractica notas = new NotaPractica(1.0, 1.0, 1.0);

        assertEquals("Cálculo de Materia practica", notas.etiqueta());
    }

    @Test
    void metadataShouldMatchPracticalSubject() {
        NotaPractica notas = new NotaPractica(1.0, 1.0, 1.0);

        assertEquals("Materia practica", notas.nombre());
        assertEquals("JAVA", notas.asignatura());
    }
}