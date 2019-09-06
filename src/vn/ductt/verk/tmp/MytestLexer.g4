
lexer grammar MytestLexer;

fragment F_newline : '\r'? '\n' ;

Directive_define : '`define' -> pushMode(DEFINE_MODE) ;
Verilog_directive : '`' Simple_identifier ;
Simple_identifier: [a-zA-Z_] ( [a-zA-Z_0-9] )* ;
Forward_slash_forward_slash : '//'  -> channel(3);

mode DEFINE_MODE;
Define_left_angle: '<' ;
Define_right_angle: '>' ;
Define_open_parent: '(' ;
Define_close_parent: ')' ;
Define_open_bracket: [{[] ;
Define_close_bracket: [}\]] ;
Define_comma: ',' ;
Define_equal: '=' ;




Define_delimit: '``' ; // this just to separate Token
Define_escaped_char: '`' ~[ \t\r\n] ;

Define_identifier: Simple_identifier ;
Define_white_space: [ \t]+ ;
Define_escaped_newline: '\\' F_newline;

Define_any_char: ~[\r\n] ;
Define_new_line: F_newline -> popMode ;
Define_comment_continue : '//' .*? Define_escaped_newline ;
Define_comment_end : '//' .*? F_newline -> popMode ;
