
grammar Directive;


// macro
text_macro_definition
    : '`define' text_macro_name macro_text
    ;

text_macro_name
    : text_macro_identifier ( '(' list_of_formal_arguments ')' )?
    ;
list_of_formal_arguments
    : formal_argument_identifier ( ',' formal_argument_identifier )*
    ;
text_macro_identifier
    : Simple_identifier
    ;
formal_argument_identifier
    : Simple_identifier
    ;
macro_text
    : .*;   // any character to the end

text_macro_usage
    : '`' text_macro_identifier ( '(' list_of_actual_arguments ')' )?
    ;
list_of_actual_arguments
    : actual_argument ( ',' actual_argument )*
    ;
actual_argument
    : expression
    ;


// conditional directive
conditional_compilation_directive
    : cond_kw=('`ifdef'|'`ifndef') cond_id=text_macro_identifier ifdef_group_of_lines=group_of_lines
      ('`elsif' text_macro_identifier elsif_group_of_lines=group_of_lines)*
      ('`else' else_group_of_lines=group_of_lines)?
      '`endif'
    ;
group_of_lines
    : conditional_compilation_directive
    | .*?   // any character
    ;


expression : Simple_identifier ;    // only place holder for testing, full expression is defined elsewhere

Simple_identifier : [a-zA-Z_] [a-zA-Z0-9_$]*;
