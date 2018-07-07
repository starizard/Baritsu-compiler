grammar Baritsu;

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

variable_declaration: DEF ID ('=' statement)? ;

print_statement: PRINT ID;

TERMINATOR :(';' | '\n')+ ;

primitive : STRING
          | INT
          | BOOLEAN
          ;

STRING : '"' (LETTER | INT)+ '"';
BOOLEAN: 'true' | 'false';
PRINT : 'print';
DEF : 'def' ;
ID : LETTER (LETTER | [0-9])* ;
DO : 'do';
END : 'end';
fragment
LETTER: [a-zA-Z];
INT: [0-9]+;
WS: [ \t\r]+ -> skip;



