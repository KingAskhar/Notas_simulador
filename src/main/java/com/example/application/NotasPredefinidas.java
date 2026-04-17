package com.example.application;

import java.util.ArrayList;
import java.util.List;
import com.example.application.views.notas.Aritmetica;

public class NotasPredefinidas {
    public static List<Aritmetica> obtener() {
        List<Aritmetica> lista = new ArrayList<>();
        lista.add(new NotasTeorica(1.0, 1.0, 1.0));
        lista.add(new NotaPractica(1.0, 1.0, 1.0));
        lista.add(new NotaMixta(1.0, 1.0, 1.0));
        return lista;
    }
}