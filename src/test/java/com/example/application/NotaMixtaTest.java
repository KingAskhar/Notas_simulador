package com.example.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotaMixtaTest {

    @Test
    void calcularShouldUseMixedWeights() {
        NotaMixta notas = new NotaMixta(5.0, 4.0, 3.0);

        assertEquals(3.99, notas.calcular(-1.0), 0.0001);
    }

    @Test
    void etiquetaShouldUseDefaultInterfacePrefix() {
        NotaMixta notas = new NotaMixta(1.0, 1.0, 1.0);

        assertEquals("Cálculo de Materia mixta", notas.etiqueta());
    }

    @Test
    void metadataShouldMatchMixedSubject() {
        NotaMixta notas = new NotaMixta(1.0, 1.0, 1.0);

        assertEquals("Materia mixta", notas.nombre());
        assertEquals("SQL", notas.asignatura());
    }
}