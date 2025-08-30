package com.remilang;

import java.util.*;

public class TablaSimbolos {
    private final Map<String, Simbolo> tabla = new HashMap<>();
    private final TablaSimbolos padre;

    public TablaSimbolos(TablaSimbolos padre) { this.padre = padre; }

    public boolean declarar(String nombre, Tipo tipo) {
        if (tabla.containsKey(nombre)) return false;
        tabla.put(nombre, new Simbolo(nombre, tipo));
        return true;
    }

    public Simbolo resolver(String nombre) {
        Simbolo s = tabla.get(nombre);
        if (s != null) return s;
        return (padre != null) ? padre.resolver(nombre) : null;
    }
}