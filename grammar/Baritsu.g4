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

block : (NEWLINE | COMMENT)* '{' list_of_statements '}' (NEWLINE | COMMENT)*
      ;

list_of_statements : (TERMINATOR)* (statement)+;

statement : variable_declaration (TERMINATOR)+
          | variable_assignment (TERMINATOR)+
          | print_statement (TERMINATOR)+
          | loop_statement (TERMINATOR)* 
          | branch_statement (TERMINATOR)* 
          | primitive (TERMINATOR)+
          ;

variable_declaration: DEF ID ('=' expr)? ;

variable_assignment: ID '=' expr ;

print_statement : PRINT expr #printStat
                | PUTS expr #putsStat
                ;

loop_statement : WHILE expr block # whileStat
               ;
branch_statement : IF expr block (ELSEIF expr)?  block ELSE?  block # ifStat;

expr : ID '(' argList? ')' # functionCallExpr
     | expr '[' expr ']'  # arrayExpr
     | '-' expr # negateExpr
     | '!' expr # notExpr
     | expr '*' expr # multiplyExpr
     | expr '/' expr # divideExpr
     | expr ('+') expr # addExpr
     | expr ('-') expr # subExpr
     | expr '==' expr # eqExpr
     | expr '<' expr # lessThanExpr
     | expr '>' expr # greaterThanExpr
     | expr '<=' expr # lessThanEqExpr
     | expr '>=' expr # greaterThanEqExpr
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
WHILE: 'while';
IF: 'if';
ELSE: 'else';
ELSEIF: 'else if';
STRING : '"' ALPHANUMERICARRAY '"'
{setText(getText().substring(1, getText().length()-1));};
BOOLEAN: 'true' | 'false';
PRINT : 'print';
PUTS : 'puts';
FOR: 'for';
DEF : 'def' ;
ID : LETTER (LETTER | [0-9])* ;
DO : 'do';
END : 'end';
SEMICOLON: ';';
NEWLINE: '\n';
fragment
ALPHANUMERICARRAY: (LETTER | INT | WS)+ ;
LETTER: [a-zA-Z];
INT: [0-9]+;
COMMENT: (MULTILINECOMMENT | SINGLELINECOMMENT )  -> channel(HIDDEN);
MULTILINECOMMENT: '/*' .*? '*/';
SINGLELINECOMMENT: '//' .*? NEWLINE;
WS: [ \t\r]+ -> skip;



