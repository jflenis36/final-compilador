grammar RemiLang;

/* ========================= PARSER ========================= */

programa
    : sentencia* EOF
    ;

sentencia
    : imprimir (PUNTO_Y_COMA)?
    | asignacion (PUNTO_Y_COMA)?
    | declaracion (PUNTO_Y_COMA)?
    | condicional
    | bucle_mientras
    ;

imprimir
    : IMPRIMIR expr
    ;

declaracion
    : (ENTERO_TIPO | CADENA_TIPO | BOOLEANO_TIPO | ARREGLO_TIPO) IDENTIFICADOR (ASIGNAR expr)?
    ;

asignacion
    : IDENTIFICADOR ASIGNAR expr
    | IDENTIFICADOR SUMAR_ASIGNAR expr
    | IDENTIFICADOR RESTAR_ASIGNAR expr
    | IDENTIFICADOR MULTIPLICAR_ASIGNAR expr
    | IDENTIFICADOR DIVIDIR_ASIGNAR expr
    | IDENTIFICADOR MODULO_ASIGNAR expr
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

/* --------- Expresiones con precedencia (|| a primaria) ---------- */
expr            : expr_o ;
expr_o          : expr_y ( O expr_y )* ;
expr_y          : expr_igualdad ( Y expr_igualdad )* ;
expr_igualdad   : expr_comparacion ( (IGUAL_QUE | DIFERENTE_QUE) expr_comparacion )* ;
expr_comparacion: expr_suma ( (MAYOR_QUE | MENOR_QUE | MAYOR_O_IGUAL_QUE | MENOR_O_IGUAL_QUE) expr_suma )* ;
expr_suma       : expr_mult ( (SUMAR | RESTAR) expr_mult )* ;
expr_mult       : expr_unaria ( (MULTIPLICAR | DIVIDIR | MODULO) expr_unaria )* ;
expr_unaria     : (NO | RESTAR | SUMAR) expr_unaria
                | expr_primaria
                ;

expr_primaria
    : ENTERO
    | CADENA_LITERAL
    | BOOLEANO_VERDADERO
    | BOOLEANO_FALSO
    | arreglo
    | IDENTIFICADOR
    | acceso_arreglo
    | PARENTESIS_IZQUIERDO expr PARENTESIS_DERECHO
    ;

arreglo
    : CORCHETE_IZQUIERDO (expr (COMA expr)*)? CORCHETE_DERECHO
    ;

acceso_arreglo
    : IDENTIFICADOR CORCHETE_IZQUIERDO expr CORCHETE_DERECHO
    ;

/* ========================= LEXER ========================== */

ENTERO_TIPO       : 'ENTERO' ;
CADENA_TIPO       : 'CADENA' ;
BOOLEANO_TIPO     : 'BOOLEANO' ;
ARREGLO_TIPO      : 'ARREGLO' ;

SI                : 'SI' ;
SINO              : 'SINO' ;
FIN               : 'FIN' ;
MIENTRAS          : 'MIENTRAS' ;
IMPRIMIR          : 'IMPRIMIR' ;

BOOLEANO_VERDADERO: 'VERDADERO' | 'TRUE' ;
BOOLEANO_FALSO    : 'FALSO'     | 'FALSE' ;
ENTERO            : DIGITO+ ;
CADENA_LITERAL    : '"' ( ESCAPE | ~["\\\r\n] )* '"' ;

IDENTIFICADOR     : LETRA (LETRA | DIGITO)* ;

SUMAR             : '+' ;
RESTAR            : '-' ;
MULTIPLICAR       : '*' ;
DIVIDIR           : '/' ;
MODULO            : '%' ;

MAYOR_O_IGUAL_QUE : '>=' ;
MENOR_O_IGUAL_QUE : '<=' ;
IGUAL_QUE         : '==' ;
DIFERENTE_QUE     : '!=' ;
MAYOR_QUE         : '>' ;
MENOR_QUE         : '<' ;

Y                 : '&&' ;
O                 : '||' ;
NO                : '!' ;

ASIGNAR           : '=' ;
SUMAR_ASIGNAR     : '+=' ;
RESTAR_ASIGNAR    : '-=' ;
MULTIPLICAR_ASIGNAR: '*=' ;
DIVIDIR_ASIGNAR   : '/=' ;
MODULO_ASIGNAR    : '%=' ;

PARENTESIS_IZQUIERDO : '(' ;
PARENTESIS_DERECHO   : ')' ;
LLAVE_IZQUIERDA      : '{' ;
LLAVE_DERECHA        : '}' ;
CORCHETE_IZQUIERDO   : '[' ;
CORCHETE_DERECHO     : ']' ;
COMA                 : ',' ;
PUNTO_Y_COMA         : ';' ;

COMENTARIO_LINEA     : '#' ~[\r\n]*  -> channel(HIDDEN) ;
COMENTARIO_BLOQUE    : '/*' .*? '*/' -> channel(HIDDEN) ;

WS                : [ \t\r\n\f]+ -> skip ;

fragment DIGITO   : [0-9] ;
fragment LETRA    : [a-zA-Z_] ;
fragment ESCAPE   : '\\' ( ['"\\] | 'n' | 'r' | 't' ) ;
