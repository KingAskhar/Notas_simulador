package com.example.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotasTeoricaTest {

    @Test
    void calcularShouldUseTheoreticalWeights() {
        NotasTeorica notas = new NotasTeorica(4.0, 3.0, 2.0);

        assertEquals(3.2, notas.calcular(0.0), 0.0001);
    }

    @Test
    void etiquetaShouldUseDefaultInterfacePrefix() {
        NotasTeorica notas = new NotasTeorica(1.0, 1.0, 1.0);

        assertEquals("Cálculo de Materia teorica", notas.etiqueta());
    }

    @Test
    void metadataShouldMatchTheorySubject() {
        NotasTeorica notas = new NotasTeorica(1.0, 1.0, 1.0);

        assertEquals("Materia teorica", notas.nombre());
        assertEquals("JS", notas.asignatura());
    }
}