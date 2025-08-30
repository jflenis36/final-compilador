// Tipo.java
package com.remilang;

public enum Tipo {
    ENTERO,
    CADENA,
    BOOLEANO,
    ARREGLO_ENTERO,
    ARREGLO_CADENA,
    ARREGLO_BOOLEANO,
    ARREGLO_DESCONOCIDO,
    DESCONOCIDO,
    ERROR;

    public static Tipo arregloDe(Tipo base) {
        switch (base) {
            case ENTERO:   return ARREGLO_ENTERO;
            case CADENA:   return ARREGLO_CADENA;
            case BOOLEANO: return ARREGLO_BOOLEANO;
            default:       return ARREGLO_DESCONOCIDO;
        }
    }

    // ⬇️ NUEVO: devuelve el tipo elemento de un tipo arreglo
    public static Tipo elementoDe(Tipo arreglo) {
        switch (arreglo) {
            case ARREGLO_ENTERO:    return ENTERO;
            case ARREGLO_CADENA:    return CADENA;
            case ARREGLO_BOOLEANO:  return BOOLEANO;
            case ARREGLO_DESCONOCIDO:
                return DESCONOCIDO;
            default:
                return ERROR; // si no es arreglo
        }
    }

    public boolean esArreglo() {
        return this == ARREGLO_ENTERO
            || this == ARREGLO_CADENA
            || this == ARREGLO_BOOLEANO
            || this == ARREGLO_DESCONOCIDO;
    }
}
