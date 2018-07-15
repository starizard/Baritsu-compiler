grammar Baritsu;

@header {
  package com.shawnrebello.baritsu.antlr;
}

program : list_of_expressions;



list_of_expressions : function_definition TERMINATOR
                    | list_of_statements
                    | list_of_expressions list_of_expressions
                    | TERMINATOR
                    ;


function_definition : DEF ID block  # functionDef ;

block : DO list_of_statements END
      | '{' list_of_statements '}'
      ;

list_of_statements : statement TERMINATOR
                   | list_of_statements statement TERMINATOR
                   ;

statement : variable_declaration # varDef
          | print_statement # printDef
          | primitive  # primitiveStat
          ;

variable_declaration: DEF ID ('=' statement)? ;

print_statement: PRINT ID;

TERMINATOR : (SEMICOLON | NEWLINE | SINGLELINECOMMENT)+ ;

primitive : STRING # string
          | INT # int
          | BOOLEAN # bool
          | NULL # null
          ;

NULL : 'null';
STRING : '"' (LETTER | INT)+ '"';
BOOLEAN: 'true' | 'false';
PRINT : 'print';
DEF : 'def' ;
ID : LETTER (LETTER | [0-9])* ;
DO : 'do';
END : 'end';
SEMICOLON: ';';
NEWLINE: '\n';
fragment
LETTER: [a-zA-Z];
INT: [0-9]+;
COMMENT: (MULTILINECOMMENT | SINGLELINECOMMENT )  -> channel(HIDDEN);
MULTILINECOMMENT: '/*' .*? '*/';
SINGLELINECOMMENT: '//' .*? NEWLINE;
WS: [ \t\r]+ -> skip;



