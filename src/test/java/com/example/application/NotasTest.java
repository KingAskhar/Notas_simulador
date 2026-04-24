package com.example.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotasTest {

    @Test
    void constructorShouldStoreValidValues() {
        NotasTeorica notas = new NotasTeorica(2.5, 3.0, 4.0);

        assertEquals(2.5, notas.getParcial());
        assertEquals(3.0, notas.getTaller());
        assertEquals(4.0, notas.getProyecto());
    }

    @Test
    void setParcialShouldRejectValueBelowRange() {
        NotasTeorica notas = new NotasTeorica(2.0, 2.0, 2.0);

        assertThrows(IllegalArgumentException.class, () -> notas.setParcial(0.99));
    }

    @Test
    void setTallerShouldRejectValueAboveRange() {
        NotasTeorica notas = new NotasTeorica(2.0, 2.0, 2.0);

        assertThrows(IllegalArgumentException.class, () -> notas.setTaller(5.1));
    }

    @Test
    void setProyectoShouldRejectValueOutsideRange() {
        NotasTeorica notas = new NotasTeorica(2.0, 2.0, 2.0);

        assertThrows(IllegalArgumentException.class, () -> notas.setProyecto(0.5));
    }
}