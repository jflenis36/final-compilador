package com.remilang;

public enum Tipo {
    ENTERO, CADENA, BOOLEANO,
    ARREGLO_ENTERO, ARREGLO_CADENA, ARREGLO_BOOLEANO, ARREGLO_DESCONOCIDO,
    DESCONOCIDO, ERROR;

    public boolean esArreglo() {
        return this == ARREGLO_ENTERO || this == ARREGLO_CADENA || this == ARREGLO_BOOLEANO || this == ARREGLO_DESCONOCIDO;
    }

    public static Tipo arregloDe(Tipo elem) {
        switch (elem) {
            case ENTERO: return ARREGLO_ENTERO;
            case CADENA: return ARREGLO_CADENA;
            case BOOLEANO: return ARREGLO_BOOLEANO;
            default: return ARREGLO_DESCONOCIDO;
        }
    }

    public static Tipo elementoDe(Tipo arr) {
        switch (arr) {
            case ARREGLO_ENTERO: return ENTERO;
            case ARREGLO_CADENA: return CADENA;
            case ARREGLO_BOOLEANO: return BOOLEANO;
            default: return DESCONOCIDO;
        }
    }
}
