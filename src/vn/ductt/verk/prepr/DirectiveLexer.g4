/*
  Directive support for Verilog Lexer
  ALL directive should be single Token, to allow token rewrite
*/

lexer grammar DirectiveLexer;

fragment F_WS : [ \t\r\n]+ ;
fragment F_NL : '\r'? '\n' ;

// Single apperance, can be put anywhere in code
fragment F_SIMPLE_COMPILER_DIR
    : 'celldefine'
    | 'endcelldefine'
    | 'resetall'
    // these are used in lib cell
    | 'delay_mode_path'
    | 'suppress_faults'
    | 'enable_portfaults'
    ;
Simple_compiler_directive
    : '`' F_SIMPLE_COMPILER_DIR
    ;

Default_nettype_compiler_directive
    : '`default_nettype' F_WS+ ('wire' | 'tri' | 'tri0' | 'wand' | 'triand' | 'wor' | 'trior' | 'trireg' | 'none')
    ;

// define macro
fragment F_MCHAR : '\\' '\r'? '\n' | ~('\r' | '\n'); // any chacrater, except newline without escaped
Text_macro_definition
    : '`define' F_WS+ Simple_identifier F_MCHAR* F_NL
    ;

// macro call
fragment F_macro_arguments
    : '(' ( ~(')') | F_macro_arguments )* ')'
    ;

Text_macro_usage
    : '`' Simple_identifier ( F_WS* F_macro_arguments )?
    ;


Undefine_compiler_directive
    : '`undef' F_WS+ Simple_identifier
    ;

// conditional directive
Conditional_compilation_directive
    : ('`ifdef'|'`ifndef') F_WS+ Simple_identifier F_WS+ (Conditional_compilation_directive|(.*?))
      ('`elsif' F_WS+ Simple_identifier F_WS+ (Conditional_compilation_directive|(.*?)))*
      ('`else' F_WS+ (Conditional_compilation_directive|(.*?)))?
      '`endif'
    ;

Include_compiler_directive
    : '`include' F_WS+ String
    ;

Line_compiler_directive
    : '`line' [0-9]+ String [0-9]+
    ;

fragment F_time_unit : [0-9]+ F_WS+ [mnpf] 's';
Timescale_compiler_directive
    : '`timescale' F_WS+ F_time_unit F_WS+ '/' F_time_unit
    ;

Unconnected_drive_compiler_directive
    : '`unconnected_drive' F_WS+ 'pull' [01]
    ;
Nounconnected_drive_compiler_directive
    : '`nounconnected_drive'
    ;

Simple_identifier : [a-zA-Z_] [a-zA-Z0-9_$]*;
String : '"' (~ [\n\r])* '"' ;
