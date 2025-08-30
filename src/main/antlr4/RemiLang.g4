grammar RemiLang;


/* ============================================================================
   PARSER mínimo (solo para probar y listar tokens). Foco real: LÉXICO.
   ========================================================================== */
programa
    : sentencia* EOF
    ;

sentencia
    : imprimir (PUNTO_Y_COMA)?
    | asignacion (PUNTO_Y_COMA)?
    | condicional
    | bucle_mientras
    ;

imprimir
    : IMPRIMIR expresion_cadena
    ;

asignacion
    : IDENTIFICADOR ASIGNAR expr
    ;

condicional
    : SI expr bloque (SINO bloque)? FIN
    ;

bucle_mientras
    : MIENTRAS expr bloque FIN
    ;

bloque
    : sentencia*
    ;

/* ------------------ Expresiones (suficiente para listar tokens) ----------- */
expr
    : literal
    | IDENTIFICADOR
    | PARENTESIS_IZQUIERDO expr PARENTESIS_DERECHO
    | expr (SUMAR | RESTAR | MULTIPLICAR | DIVIDIR | MODULO) expr
    | expr (MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE | IGUAL_QUE | DIFERENTE_QUE) expr
    | expr (Y | O) expr
    | NO expr
    ;

expresion_cadena
    : CADENA_LITERAL
    ;

literal
    : ENTERO
    | BOOLEANO_VERDADERO
    | BOOLEANO_FALSO
    | CADENA_LITERAL
    | arreglo
    ;

arreglo
    : CORCHETE_IZQUIERDO (expr (COMA expr)*)? CORCHETE_DERECHO
    ;

/* ============================================================================
   LEXER (Fase 1: tokens completos, en español y sin abreviaturas)
   ========================================================================== */

// --- Palabras clave / tipos (de la guía) ---
ENTERO_TIPO       : 'ENTERO' ;
CADENA_TIPO       : 'CADENA' ;
BOOLEANO_TIPO     : 'BOOLEANO' ;
ARREGLO_TIPO      : 'ARREGLO' ;

// --- Control de flujo (if/else/while) ---
SI                : 'SI' ;
SINO              : 'SINO' ;
FIN               : 'FIN' ;
MIENTRAS          : 'MIENTRAS' ;

// --- Entrada/salida ---
IMPRIMIR          : 'IMPRIMIR' ;

// --- Literales ---
BOOLEANO_VERDADERO: 'VERDADERO' | 'TRUE' ;
BOOLEANO_FALSO    : 'FALSO'     | 'FALSE' ;
ENTERO            : DIGITO+ ;
CADENA_LITERAL    : '"' ( ESCAPE | ~["\\\r\n] )* '"' ;

// --- Identificadores ---
IDENTIFICADOR     : LETRA (LETRA | DIGITO)* ;

// --- Operadores aritméticos ---
SUMAR             : '+' ;
RESTAR            : '-' ;
MULTIPLICAR       : '*' ;
DIVIDIR           : '/' ;
MODULO            : '%' ;

// --- Operadores relacionales / igualdad ---
MAYOR_O_IGUAL_QUE : '>=' ;
MENOR_O_IGUAL_QUE : '<=' ;
IGUAL_QUE         : '==' ;
DIFERENTE_QUE     : '!=' ;
MAYOR_QUE         : '>' ;
MENOR_QUE         : '<' ;

// --- Operadores lógicos ---
Y                 : '&&' ;
O                 : '||' ;
NO                : '!' ;

// --- Asignación (y compuestos si luego amplías) ---
ASIGNAR           : '=' ;
SUMAR_ASIGNAR     : '+=' ;
RESTAR_ASIGNAR    : '-=' ;
MULTIPLICAR_ASIGNAR: '*=' ;
DIVIDIR_ASIGNAR   : '/=' ;
MODULO_ASIGNAR    : '%=' ;

// --- Símbolos / puntuación ---
PARENTESIS_IZQUIERDO : '(' ;
PARENTESIS_DERECHO   : ')' ;
LLAVE_IZQUIERDA      : '{' ;
LLAVE_DERECHA        : '}' ;
CORCHETE_IZQUIERDO   : '[' ;
CORCHETE_DERECHO     : ']' ;
COMA                 : ',' ;
PUNTO_Y_COMA         : ';' ;

// --- Comentarios (como tokens visibles) ---
COMENTARIO_LINEA     : '#' ~[\r\n]*         -> channel(HIDDEN);
COMENTARIO_BLOQUE    : '/*' .*? '*/'        -> channel(HIDDEN);

// --- Espacios en blanco (sí se descartan) ---
WS                : [ \t\r\n\f]+ -> skip ;

// --- Fragmentos auxiliares ---
fragment DIGITO   : [0-9] ;
fragment LETRA    : [a-zA-Z_] ;
fragment ESCAPE   : '\\' ( ['"\\] | 'n' | 'r' | 't' ) ;
