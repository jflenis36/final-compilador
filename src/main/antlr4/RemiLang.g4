grammar RemiLang;

// ============================================================================
// PARSER (estructura en español)
// ============================================================================
programa
    : sentencia* EOF
    ;

sentencia
    : imprimir (PUNTO_Y_COMA)?
    | declaracion (PUNTO_Y_COMA)?
    | asignacion (PUNTO_Y_COMA)?
    | condicional
    | bucle_mientras
    ;

imprimir
    : IMPRIMIR expr
    ;

// Declaraciones: ENTERO x = 5; CADENA s = "hola"; BOOLEANO b = VERDADERO; ARREGLO a = [1,2,3];
declaracion
    : (ENTERO_TIPO | CADENA_TIPO | BOOLEANO_TIPO | ARREGLO_TIPO) IDENTIFICADOR (ASIGNAR expr)?
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

// --------- Expresiones con precedencia ----------
expr
    : expr_o
    ;

expr_o
    : expr_y (O expr_y)*
    ;

expr_y
    : expr_igualdad (Y expr_igualdad)*
    ;

expr_igualdad
    : expr_comparacion ((IGUAL_QUE | DIFERENTE_DE) expr_comparacion)*
    ;

expr_comparacion
    : expr_suma ((MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE) expr_suma)*
    ;

expr_suma
    : expr_mult ((SUMAR | RESTAR) expr_mult)*
    ;

expr_mult
    : expr_unaria ((MULTIPLICAR | DIVIDIR | MODULARIZAR) expr_unaria)*
    ;

expr_unaria
    : (NO | SUMAR | RESTAR) expr_unaria
    | expr_primaria
    ;

expr_primaria
    : ENTERO
    | CADENA_LITERAL
    | BOOLEANO_VERDADERO
    | BOOLEANO_FALSO
    | IDENTIFICADOR
    | PARENTESIS_IZQUIERDO expr PARENTESIS_DERECHO
    | arreglo
    | acceso_arreglo
    ;

arreglo
    : CORCHETE_IZQUIERDO (expr (COMA expr)*)? CORCHETE_DERECHO
    ;

acceso_arreglo
    : IDENTIFICADOR CORCHETE_IZQUIERDO expr CORCHETE_DERECHO
    ;

// ============================================================================
// LEXER (tokens)
// ============================================================================

// Palabras clave (tipos)
ENTERO_TIPO      : 'ENTERO' ;
CADENA_TIPO      : 'CADENA' ;
BOOLEANO_TIPO    : 'BOOLEANO' ;
ARREGLO_TIPO     : 'ARREGLO' ;

// Control de flujo
SI               : 'SI' ;
SINO             : 'SINO' ;
FIN              : 'FIN' ;
MIENTRAS         : 'MIENTRAS' ;

// E/S
IMPRIMIR         : 'IMPRIMIR' ;

// Literales
BOOLEANO_VERDADERO : 'VERDADERO' | 'TRUE' ;
BOOLEANO_FALSO     : 'FALSO'     | 'FALSE' ;
ENTERO             : [0-9]+ ;
CADENA_LITERAL     : '"' ( ESC | ~["\\\r\n] )* '"' ;

// Identificador
IDENTIFICADOR    : [a-zA-Z_][a-zA-Z_0-9]* ;

// Operadores aritméticos
SUMAR            : '+' ;
RESTAR           : '-' ;
MULTIPLICAR      : '*' ;
DIVIDIR          : '/' ;
MODULARIZAR      : '%' ;

// Operadores relacionales / igualdad
MAYOR_O_IGUAL_QUE : '>=' ;
MENOR_O_IGUAL_QUE : '<=' ;
IGUAL_QUE         : '==' ;
DIFERENTE_DE      : '!=' ;
MAYOR_QUE         : '>' ;
MENOR_QUE         : '<' ;

// Operadores lógicos
Y                : '&&' ;
O                : '||' ;
NO               : '!' ;

// Asignación
ASIGNAR          : '=' ;

// Símbolos / puntuación
PARENTESIS_IZQUIERDO : '(' ;
PARENTESIS_DERECHO   : ')' ;
LLAVE_IZQUIERDA      : '{' ;
LLAVE_DERECHA        : '}' ;
CORCHETE_IZQUIERDO   : '[' ;
CORCHETE_DERECHO     : ']' ;
COMA                 : ',' ;
PUNTO_Y_COMA         : ';' ;

// Comentarios
COMENTARIO_LINEA   : '#' ~[\r\n]* -> skip ;
COMENTARIO_BLOQUE  : '/*' .*? '*/' -> skip ;

// Espacios
ESPACIOS          : [ \t\r\n\f]+ -> skip ;

// Fragmento de escape para cadenas
fragment ESC      : '\\' ( ['"\\] | 'n' | 'r' | 't' ) ;
