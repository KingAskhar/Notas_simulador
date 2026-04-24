package com.example.application;

import com.example.application.views.notas.Aritmetica;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class NotasPredefinidasTest {

    @Test
    void obtenerShouldReturnAllConfiguredStrategiesInOrder() {
        List<Aritmetica> estrategias = NotasPredefinidas.obtener();

        assertEquals(3, estrategias.size());
        assertInstanceOf(NotasTeorica.class, estrategias.get(0));
        assertInstanceOf(NotaPractica.class, estrategias.get(1));
        assertInstanceOf(NotaMixta.class, estrategias.get(2));
    }

    @Test
    void obtenerShouldReturnStrategiesWithDefaultValues() {
        List<Aritmetica> estrategias = NotasPredefinidas.obtener();

        assertEquals(1.0, ((NotasTeorica) estrategias.get(0)).getParcial());
        assertEquals(1.0, ((NotaPractica) estrategias.get(1)).getTaller());
        assertEquals(1.0, ((NotaMixta) estrategias.get(2)).getProyecto());
    }
}