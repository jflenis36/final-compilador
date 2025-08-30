package com.remilang;

public class Simbolo {
    public final String nombre;
    public Tipo tipo;

    public Simbolo(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override public String toString() { return nombre + ":" + tipo; }
}