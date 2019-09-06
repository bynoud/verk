// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

//*******************************************************************/
//* Company:    Microsoft Corporation                               */
//* Engineer:   Richard Neil Pittman                                */
//*                                                                 */
//* Revision:                                                       */
//* Revision    0.1.0   -   Internal Beta Release                   */
//* Revision    0.2.0   -   ANTLR GitHub Release                    */
//*                                                                 */
//* Additional Comments:                                            */
//*                                                                 */
//*******************************************************************/

lexer grammar SystemVerilogLexer;

/**********LEXER**********/

// Channels
fragment
COMMENT_TEXT : .*? ;

//fragment Carriage_return : '\r' -> channel(HIDDEN);
//Forward_slash_forward_slash : '//'  -> channel(3);
//Forward_slash_star : '/*'  -> channel(3);
//New_line : '\n' -> channel(HIDDEN);
//Star_forward_slash : '*/'  -> channel(3);
//Block_comment : Forward_slash_star COMMENT_TEXT Star_forward_slash -> channel(3);
////Line directive emitted by preprocessor before and after include file insertion.
//Line_directive : '`line' .*? Carriage_return? New_line -> channel(2) ;
//One_line_comment : Forward_slash_forward_slash COMMENT_TEXT Carriage_return? New_line -> channel(3) ;

// DT: not sure why they write like above
fragment F_newline : '\r'? '\n' ;
fragment F_blankspace : [ \t\r\n] ;
Block_comment : '/*' .*? '*/' -> channel(HIDDEN);
Line_directive : '`line' .*? F_newline -> channel(HIDDEN) ;
One_line_comment : '//' .*? F_newline -> channel(HIDDEN) ;
New_line : F_newline -> channel(HIDDEN) ;
WHITE_SPACE : [ \t]+ -> channel(HIDDEN) ;

// numbers
fragment
Binary_base : Quote [sS]? [bB] ;
fragment
Binary_digit : X_digit | Z_digit | [01] ;
fragment
Binary_value : Binary_digit ( '_' | Binary_digit )* ;
fragment
Decimal_base : Quote [sS]? [dD] ;
fragment
Decimal_digit : [0-9] ;
fragment
Exp : 'e' | 'E' ;
fragment
Hex_base : Quote [sS]? [hH];
fragment
Hex_digit : X_digit | Z_digit | [0-9a-fA-F] ;
fragment
Hex_value : Hex_digit ( '_' | Hex_digit )* ;
fragment
No_base : Quote [sS]? ;
fragment
Non_zero_decimal_digit : [1-9] ;
fragment
Non_zero_unsigned_number : Non_zero_decimal_digit ( '_' | Decimal_digit)* ;
fragment
Octal_base : Quote [sS]? [oO] ;
fragment
Octal_digit : X_digit | Z_digit | [0-7] ;
fragment
Octal_value : Octal_digit ( '_' | Octal_digit )* ;
fragment
Size : Non_zero_unsigned_number ;
fragment
Unsigned_number : Decimal_digit ( '_' | Decimal_digit )* ;
fragment
X_digit : [xX] ;
fragment
Z_digit : [zZ?] ;

Binary_number : ( Size )? Binary_base Binary_value ;
Decimal_number : Unsigned_number
               | ( Size )? Decimal_base Unsigned_number
               | ( Size )? Decimal_base X_digit ( '_' )*
               | ( Size )? Decimal_base Z_digit ( '_' )*
               | No_base Unsigned_number
               | No_base X_digit ( '_' )*
               | No_base Z_digit ( '_' )*
               ;
Fixed_point_number : Unsigned_number Dot Unsigned_number ;
Hex_number : ( Size )? Hex_base Hex_value ;
Octal_number : ( Size )? Octal_base Octal_value ;
Real_exp_form : Unsigned_number ( Dot Unsigned_number )? Exp ( '+' | '-' )? Unsigned_number ;
Unbased_unsized_literal : '\'0' | '\'1' | Quote Z_or_x ;

// operation
Plus : '+' ;
Dash : '-';
Exclamation : '!' ;
Hiphen : '&' ;
Tilde_hiphen : '~&' ;
Pipe : '|' ;
Tilde_pipe: '~|' ;
Carret : '^' ;
Tilde_carret : '~^' ;
Carret_tilde : '^~' ;

Percent : '%' ;
Double_equal : '==' ;
Exclamation_equal : '!=' ;
Triple_equal : '===' ;
Exclamation_double_equal : '!==' ;
Double_hiphen : '&&' ;
Double_pipe : '||' ;
Double_star : '**' ;
Right_angle_equal : '>=' ;
Double_right_angle : '>>' ;
Double_left_angle : '<<' ;
Triple_right_angle : '>>>' ;
Triple_left_angle : '<<<' ;

Double_plus : '++' ;
Double_dash : '--' ;
Plus_equal : '+=' ;
Dash_equal : '-=' ;
Hiphen_equal : '&=' ;
Pipe_equal : '|=' ;

// Keywords
Always : 'always' ;
Always_comb : 'always_comb' ;
Always_ff : 'always_ff' ;
And : 'and' ;
Assert : 'assert' ;
Assign : 'assign' ;
Automatic : 'automatic' ;
Begin : 'begin' ;
Bit : 'bit' ;
Buf : 'buf' ;
Bufif0 : 'bufif0' ;
Bufif1 : 'bufif1' ;
Byte : 'byte' ;
Case_keyword : 'case' ;
Casez: 'casez' ;
Casex: 'casex' ;
Cell : 'cell' ;
Cmos : 'cmos' ;
Config : 'config' ;
Const : 'const' ;
Deassign : 'deassign' ;
Default : 'default' ;
Default_nettype : '`default_nettype' ;
Defparam : 'defparam' ;
Design : 'design' ;
Disable : 'disable' ;
Do : 'do' ;
Edge : 'edge' ;
Else : 'else' ;
End : 'end' ;
Endcase : 'endcase' ;
Endconfig : 'endconfig' ;
Endfunction : 'endfunction' ;
Endgenerate : 'endgenerate' ;
Endmodule: 'endmodule' ;
Endpackage : 'endpackage' ;
Endproperty : 'endproperty' ;
Endspecify : 'endspecify' ;
Endtask : 'endtask' ;
Enum : 'enum' ;
Event_keyword : 'event' ;
Final : 'final' ;
For : 'for' ;
Force : 'force' ;
Forever : 'forever' ;
Fork : 'fork' ;
Function : 'function' ;
Generate : 'generate' ;
Genvar : 'genvar' ;
Highz0 : 'highz0' ;
Highz1 : 'highz1' ;
If : 'if' ;
Iff : 'iff' ;
Ifnone : 'ifnone' ;
Import : 'import' ;
Incdir : '-incdir' ;
Initial : 'initial' ;
Inout : 'inout' ;
Input : 'input' ;
Instance : 'instance' ;
Int : 'int' ;
Integer : 'integer' ;
Join : 'join' ;
Join_any : 'join_any' ;
Join_none : 'join_none' ;
Large : 'large' ;
Liblist : 'liblist' ;
Library : '`library' ;
Localparam : 'localparam' ;
Logic : 'logic' ;
Macromodule : 'macromodule' ;
Medium : 'medium' ;
Module_keyword_only : 'module' ;
Nand : 'nand' ;
Negedge : 'negedge' ;
Nmos : 'nmos' ;
NONE : 'none' ;
Nor : 'nor' ;
Not : 'not' ;
Notif0 : 'notif0' ;
Notif1 : 'notif1' ;
Noshowcancelled : 'noshowcancelled' ;
Or : 'or ' ;
Output : 'output' ;
Parameter : 'parameter' ;
Path_pulse_dollar : 'PATHPULSE$' ;
Posedge : 'posedge' ;
Package : 'package' ;
Packed : 'packed' ;
Pmos : 'pmos' ;
Property : 'property' ;
Pull0 : 'pull0' ;
Pull1 : 'pull1' ;
Pullup : 'pullup' ;
Pulldown : 'pulldown' ;
Pulsestyle_ondetect : 'pulsestyle_ondetect' ;
Pulsestyle_onevent : 'pulsestyle_onevent' ;
Rcmos : 'rcmos' ;
Real : 'real' ;
Realtime : 'realtime' ;
Ref : 'ref' ;
Reg : 'reg' ;
Release : 'release' ;
Repeat : 'repeat' ;
Return : 'return' ;
Rnmos : 'rnmos' ;
Rpmos : 'rpmos' ;
Rtran : 'rtran' ;
Rtranif0 : 'rtranif0' ;
Rtranif1 : 'rtranif1' ;
Scalared : 'scalared' ;
Showcancelled : 'showcancelled' ;
Signed : 'signed' ;
Small : 'small' ;
Specify : 'specify' ;
Specparam : 'specparam' ;
Static : 'static' ;
SVString : 'string' ;
Strong0 : 'strong0' ;
Strong1 : 'strong1' ;
Struct : 'struct' ;
Supply0 : 'supply0' ;
Supply1 : 'supply1' ;
Task : 'task' ;
Tick_timescale : '`timescale' ;
Time : 'time' ;
Timeprecision : 'timeprecision' ;
Timeunit : 'timeunit' ;
Tran : 'tran' ;
Tranif0 : 'tranif0' ;
Tranif1 : 'tranif1' ;
Tri : 'tri' ;
Tri_and : 'triand' ;
Tri_or : 'trior' ;
Tri_reg : 'trireg' ;
Tri0 : 'tri0' ;
Tri1 : 'tri1' ;
Typedef : 'typedef' ;
UnionStruct : 'union' ;
Unsigned : 'unsigned' ;
Use : 'use' ;
Uwire : 'uwire' ;
Vectored : 'vectored' ;
Wait : 'wait' ;
Wand : 'wand' ;
Weak0 : 'weak0' ;
Weak1 : 'weak1' ;
While : 'while' ;
Wire : 'wire' ;
Wor : 'wor' ;
Xnor : 'xnor' ;
Xor : 'xor' ;

// literals
fragment
ALPHA : [a-zA-Z_] ;
fragment
DIGIT : [0-9] ;

Dollar_Identifier : '$' [a-zA-Z0-9_$] [a-zA-Z0-9_$]* ;
Escaped_identifier : '\\' ~[ \r\t\n]* ;
Simple_identifier : ALPHA (ALPHA | DIGIT)* ;
String_literal : '"' (~('"'|'\n'|'\r') | '""')* '"'  ;


// punctuation
At : '@' ;
Close_parenthesis : ')' ;
Colon : ':' ;
Comma : ',' ;
Dash_right_angle : '->' ;
Dot : '.' ;
Dollar : '$' ;
Double_colon : '::' ;
Equal : '=' ;
Equals_right_angle : '=>' ;
Forward_slash : '/' ;
Hash : '#' ;
Left_angle_equals : '<=' ;
Left_bracket : '[' ;
Left_curly_bracket : '{' ;
Minus_colon : '-:' ;
Open_parenthesis : '(' ;
Plus_colon : '+:' ;
Question_mark : '?' ;
Quote : '\'' ;
Right_bracket : ']' ;
Right_curly_bracket : '}' ;
Semicolon : ';' ;
Double_semicolon: ';;' ; // DT: ??
Star : '*' ;
Star_right_angle : '*>' ;
Tilde : '~' ;


//Time
fragment
Time_unit : 's ' | 'ms' | 'us' | 'ns' | 'ps' | ' fs' ;

Time_literal : Decimal_number ' '? Time_unit
             | Fixed_point_number ' '? Time_unit
             ;


//Edge
fragment
Edge_descriptor : '01' | '10' | Z_or_x Zero_or_one | Zero_or_one Z_or_x ;
fragment
Zero_or_one : [01] ;
fragment
Z_or_x : [xXzZ] ;

Edge_control_specifier : Edge Right_bracket Edge_descriptor ( Comma Edge_descriptor )* Left_bracket ;

// DT : there's already these directive in used: line default_nettype timescale library
Directive_define : '`define' -> pushMode(DEFINE_MODE) ; // macro need special tokenize
Directive_include : '`include' ;
Directive_undef : '`undef' ;
Directive_undefineall : '`undefineall' ;
Directive_conditional : '`ifdef' | '`ifndef' | '`elsif' | '`else' | '`endif' ;
Directive_FILELINE : '`__FILE__' | '`__line__' ;
//Directive_timescale : '`timescale' F_blankspace+ Time_literal F_blankspace* '/' F_blankspace* Time_literal ;

// unsupported directive for now, combine all here
Directive_unsupported
    : ('`resetall'
    | '`unconnected_drive' F_blankspace+ ('pull0' | 'pull1')
    | '`nounconnected_drive'
    | '`celldefine'
    | '`endcelldefine'
    | '`pragma' .*? F_newline // TODO : complex syntax
    | '`begin_keywords' F_blankspace+ String_literal
    | '`end_keywords') -> channel(HIDDEN)
    ;

Verilog_directive : '`' Simple_identifier ;

//Escaped_newline : '\\' '\r'? '\n' ;
//Left_angle: '<' ;   // to support new `include <filename>
//Right_angle: '>' ;

Error_char: ~[ \r\t\n] ; // capture any other error charater for error message

mode DEFINE_MODE;
Define_left_angle: '<' ;
Define_right_angle: '>' ;
Define_open_parent: '(' ;
Define_close_parent: ')' ;
Define_open_bracket: [{[] ;
Define_close_bracket: [}\]] ;
Define_comma: ',' ;
Define_equal: '=' ;

Define_comment_continue : '//' .*? Define_escaped_newline -> channel(HIDDEN) ;
Define_comment_end : '//' .*? F_newline -> popMode;

Define_macro_call: '`' Simple_identifier ;

Define_delimit: '``' -> channel(HIDDEN) ;
Define_escaped_char: '`' ["\\] ;
//Define_escaped_char: '`' ~[ \t\r\n] ;

Define_identifier: Simple_identifier ;
Define_white_space: [ \t]+ -> channel(HIDDEN) ;
Define_escaped_newline: '\\' F_newline -> channel(HIDDEN);

Define_any_char: ~[\r\n] ;
Define_new_line: F_newline -> popMode ;

