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


function_definition : DEF ID block ;

block : DO list_of_statements END
      | '{' list_of_statements '}'
      ;

list_of_statements : statement TERMINATOR
                   | list_of_statements statement TERMINATOR
                   ;

statement : variable_declaration
          | print_statement
          | primitive
          ;

variable_declaration: DEF ID ('=' expr)? ;

print_statement: PRINT expr ;

expr : ID '(' argList? ')' # functionCallExpr
     | expr '[' expr ']'  # arrayExpr
     | '-' expr # negateExpr
     | '!' expr # notExpr
     | expr '*' expr # multiplyExpr
     | expr '/' expr # divideExpr
     | expr ('+') expr # addExpr
     | expr ('-') expr # subExpr
     | expr '==' expr # compareExpr
     | ID # idExpr
     | primitive # primitiveExpr
     | '(' expr ')' # parenExpr
     ;

argList : expr (',' expr)* ;

TERMINATOR : (SEMICOLON | NEWLINE | SINGLELINECOMMENT)+ ;

primitive : STRING # string
          | INT # int
          | BOOLEAN # bool
          | NULL # null
          ;

NULL : 'null';
STRING : '"' ALPHANUMERICARRAY '"'
{setText(getText().substring(1, getText().length()-1));};
BOOLEAN: 'true' | 'false';
PRINT : 'print';
DEF : 'def' ;
ID : LETTER (LETTER | [0-9])* ;
DO : 'do';
END : 'end';
SEMICOLON: ';';
NEWLINE: '\n';
fragment
ALPHANUMERICARRAY: (LETTER | INT)+ ;
LETTER: [a-zA-Z];
INT: [0-9]+;
COMMENT: (MULTILINECOMMENT | SINGLELINECOMMENT )  -> channel(HIDDEN);
MULTILINECOMMENT: '/*' .*? '*/';
SINGLELINECOMMENT: '//' .*? NEWLINE;
WS: [ \t\r]+ -> skip;



