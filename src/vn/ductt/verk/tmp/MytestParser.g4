
parser grammar MytestParser;

options { tokenVocab=MytestLexer; }

top: Directive_define | Verilog_directive;
