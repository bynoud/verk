// Generated from SystemVerilogParser.g4 by ANTLR 4.7.1
package vn.ductt.verk.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SystemVerilogParser}.
 */
public interface SystemVerilogParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void enterModule_keyword(SystemVerilogParser.Module_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void exitModule_keyword(SystemVerilogParser.Module_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStruct_keyword(SystemVerilogParser.Struct_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStruct_keyword(SystemVerilogParser.Struct_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#any_case_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAny_case_keyword(SystemVerilogParser.Any_case_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#any_case_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAny_case_keyword(SystemVerilogParser.Any_case_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(SystemVerilogParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(SystemVerilogParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SystemVerilogParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SystemVerilogParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(SystemVerilogParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(SystemVerilogParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#unary_assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_assign_operator(SystemVerilogParser.Unary_assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#unary_assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_assign_operator(SystemVerilogParser.Unary_assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#binary_assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_assign_operator(SystemVerilogParser.Binary_assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#binary_assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_assign_operator(SystemVerilogParser.Binary_assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(SystemVerilogParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(SystemVerilogParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#description_star}.
	 * @param ctx the parse tree
	 */
	void enterDescription_star(SystemVerilogParser.Description_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#description_star}.
	 * @param ctx the parse tree
	 */
	void exitDescription_star(SystemVerilogParser.Description_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#header_text}.
	 * @param ctx the parse tree
	 */
	void enterHeader_text(SystemVerilogParser.Header_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#header_text}.
	 * @param ctx the parse tree
	 */
	void exitHeader_text(SystemVerilogParser.Header_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#design_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDesign_attribute(SystemVerilogParser.Design_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#design_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDesign_attribute(SystemVerilogParser.Design_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(SystemVerilogParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(SystemVerilogParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(SystemVerilogParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(SystemVerilogParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration(SystemVerilogParser.Module_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration(SystemVerilogParser.Module_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModule_identifier(SystemVerilogParser.Module_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModule_identifier(SystemVerilogParser.Module_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_interface}.
	 * @param ctx the parse tree
	 */
	void enterModule_interface(SystemVerilogParser.Module_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_interface}.
	 * @param ctx the parse tree
	 */
	void exitModule_interface(SystemVerilogParser.Module_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_parameter_interface}.
	 * @param ctx the parse tree
	 */
	void enterModule_parameter_interface(SystemVerilogParser.Module_parameter_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_parameter_interface}.
	 * @param ctx the parse tree
	 */
	void exitModule_parameter_interface(SystemVerilogParser.Module_parameter_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_port_interface}.
	 * @param ctx the parse tree
	 */
	void enterModule_port_interface(SystemVerilogParser.Module_port_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_port_interface}.
	 * @param ctx the parse tree
	 */
	void exitModule_port_interface(SystemVerilogParser.Module_port_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_item_star}.
	 * @param ctx the parse tree
	 */
	void enterModule_item_star(SystemVerilogParser.Module_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_item_star}.
	 * @param ctx the parse tree
	 */
	void exitModule_item_star(SystemVerilogParser.Module_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_item(SystemVerilogParser.Module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_item(SystemVerilogParser.Module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#colon_module_identifier}.
	 * @param ctx the parse tree
	 */
	void enterColon_module_identifier(SystemVerilogParser.Colon_module_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#colon_module_identifier}.
	 * @param ctx the parse tree
	 */
	void exitColon_module_identifier(SystemVerilogParser.Colon_module_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(SystemVerilogParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(SystemVerilogParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPackage_identifier(SystemVerilogParser.Package_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPackage_identifier(SystemVerilogParser.Package_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#colon_package_identifier}.
	 * @param ctx the parse tree
	 */
	void enterColon_package_identifier(SystemVerilogParser.Colon_package_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#colon_package_identifier}.
	 * @param ctx the parse tree
	 */
	void exitColon_package_identifier(SystemVerilogParser.Colon_package_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#package_item_star}.
	 * @param ctx the parse tree
	 */
	void enterPackage_item_star(SystemVerilogParser.Package_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#package_item_star}.
	 * @param ctx the parse tree
	 */
	void exitPackage_item_star(SystemVerilogParser.Package_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#package_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_item(SystemVerilogParser.Package_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#package_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_item(SystemVerilogParser.Package_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#import_package}.
	 * @param ctx the parse tree
	 */
	void enterImport_package(SystemVerilogParser.Import_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#import_package}.
	 * @param ctx the parse tree
	 */
	void exitImport_package(SystemVerilogParser.Import_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#package_item_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPackage_item_identifier(SystemVerilogParser.Package_item_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#package_item_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPackage_item_identifier(SystemVerilogParser.Package_item_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parameter_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterParameter_item_semicolon(SystemVerilogParser.Parameter_item_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parameter_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitParameter_item_semicolon(SystemVerilogParser.Parameter_item_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parameter_item}.
	 * @param ctx the parse tree
	 */
	void enterParameter_item(SystemVerilogParser.Parameter_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parameter_item}.
	 * @param ctx the parse tree
	 */
	void exitParameter_item(SystemVerilogParser.Parameter_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_port_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttr_port_item_semicolon(SystemVerilogParser.Attr_port_item_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_port_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttr_port_item_semicolon(SystemVerilogParser.Attr_port_item_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_variable_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttr_variable_item_semicolon(SystemVerilogParser.Attr_variable_item_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_variable_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttr_variable_item_semicolon(SystemVerilogParser.Attr_variable_item_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_item}.
	 * @param ctx the parse tree
	 */
	void enterVariable_item(SystemVerilogParser.Variable_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_item}.
	 * @param ctx the parse tree
	 */
	void exitVariable_item(SystemVerilogParser.Variable_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#subroutine_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_item_semicolon(SystemVerilogParser.Subroutine_item_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#subroutine_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_item_semicolon(SystemVerilogParser.Subroutine_item_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#subroutine_item}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_item(SystemVerilogParser.Subroutine_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#subroutine_item}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_item(SystemVerilogParser.Subroutine_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_construct_item}.
	 * @param ctx the parse tree
	 */
	void enterAttr_construct_item(SystemVerilogParser.Attr_construct_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_construct_item}.
	 * @param ctx the parse tree
	 */
	void exitAttr_construct_item(SystemVerilogParser.Attr_construct_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#construct_item}.
	 * @param ctx the parse tree
	 */
	void enterConstruct_item(SystemVerilogParser.Construct_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#construct_item}.
	 * @param ctx the parse tree
	 */
	void exitConstruct_item(SystemVerilogParser.Construct_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_component_item}.
	 * @param ctx the parse tree
	 */
	void enterAttr_component_item(SystemVerilogParser.Attr_component_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_component_item}.
	 * @param ctx the parse tree
	 */
	void exitAttr_component_item(SystemVerilogParser.Attr_component_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#component_item}.
	 * @param ctx the parse tree
	 */
	void enterComponent_item(SystemVerilogParser.Component_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#component_item}.
	 * @param ctx the parse tree
	 */
	void exitComponent_item(SystemVerilogParser.Component_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#compiler_item}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_item(SystemVerilogParser.Compiler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#compiler_item}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_item(SystemVerilogParser.Compiler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#type_item}.
	 * @param ctx the parse tree
	 */
	void enterType_item(SystemVerilogParser.Type_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#type_item}.
	 * @param ctx the parse tree
	 */
	void exitType_item(SystemVerilogParser.Type_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#null_item}.
	 * @param ctx the parse tree
	 */
	void enterNull_item(SystemVerilogParser.Null_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#null_item}.
	 * @param ctx the parse tree
	 */
	void exitNull_item(SystemVerilogParser.Null_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_interface_parameters}.
	 * @param ctx the parse tree
	 */
	void enterList_of_interface_parameters(SystemVerilogParser.List_of_interface_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_interface_parameters}.
	 * @param ctx the parse tree
	 */
	void exitList_of_interface_parameters(SystemVerilogParser.List_of_interface_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_parameter_declarations}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_declarations(SystemVerilogParser.List_of_parameter_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_parameter_declarations}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_declarations(SystemVerilogParser.List_of_parameter_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_parameter_declaration_star(SystemVerilogParser.Comma_parameter_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_parameter_declaration_star(SystemVerilogParser.Comma_parameter_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComma_parameter_declaration(SystemVerilogParser.Comma_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComma_parameter_declaration(SystemVerilogParser.Comma_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_parameter_descriptions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_descriptions(SystemVerilogParser.List_of_parameter_descriptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_parameter_descriptions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_descriptions(SystemVerilogParser.List_of_parameter_descriptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#param_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParam_declaration(SystemVerilogParser.Param_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#param_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParam_declaration(SystemVerilogParser.Param_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#param_description}.
	 * @param ctx the parse tree
	 */
	void enterParam_description(SystemVerilogParser.Param_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#param_description}.
	 * @param ctx the parse tree
	 */
	void exitParam_description(SystemVerilogParser.Param_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(SystemVerilogParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(SystemVerilogParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_declaration(SystemVerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_declaration(SystemVerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void enterParameter_override(SystemVerilogParser.Parameter_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void exitParameter_override(SystemVerilogParser.Parameter_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_tf_interface_ports}.
	 * @param ctx the parse tree
	 */
	void enterList_of_tf_interface_ports(SystemVerilogParser.List_of_tf_interface_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_tf_interface_ports}.
	 * @param ctx the parse tree
	 */
	void exitList_of_tf_interface_ports(SystemVerilogParser.List_of_tf_interface_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations}.
	 * @param ctx the parse tree
	 */
	void enterList_of_tf_port_declarations(SystemVerilogParser.List_of_tf_port_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations}.
	 * @param ctx the parse tree
	 */
	void exitList_of_tf_port_declarations(SystemVerilogParser.List_of_tf_port_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_comma}.
	 * @param ctx the parse tree
	 */
	void enterList_of_tf_port_declarations_comma(SystemVerilogParser.List_of_tf_port_declarations_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_comma}.
	 * @param ctx the parse tree
	 */
	void exitList_of_tf_port_declarations_comma(SystemVerilogParser.List_of_tf_port_declarations_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_attr_tf_port_declaration_star(SystemVerilogParser.Comma_attr_tf_port_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_attr_tf_port_declaration_star(SystemVerilogParser.Comma_attr_tf_port_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComma_attr_tf_port_declaration(SystemVerilogParser.Comma_attr_tf_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComma_attr_tf_port_declaration(SystemVerilogParser.Comma_attr_tf_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterList_of_tf_port_declarations_semicolon(SystemVerilogParser.List_of_tf_port_declarations_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitList_of_tf_port_declarations_semicolon(SystemVerilogParser.List_of_tf_port_declarations_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 */
	void enterAttr_tf_port_declaration_semicolon_plus(SystemVerilogParser.Attr_tf_port_declaration_semicolon_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 */
	void exitAttr_tf_port_declaration_semicolon_plus(SystemVerilogParser.Attr_tf_port_declaration_semicolon_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 */
	void enterAttr_tf_port_declaration_semicolon_star(SystemVerilogParser.Attr_tf_port_declaration_semicolon_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 */
	void exitAttr_tf_port_declaration_semicolon_star(SystemVerilogParser.Attr_tf_port_declaration_semicolon_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttr_tf_port_declaration_semicolon(SystemVerilogParser.Attr_tf_port_declaration_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttr_tf_port_declaration_semicolon(SystemVerilogParser.Attr_tf_port_declaration_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttr_tf_port_declaration(SystemVerilogParser.Attr_tf_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttr_tf_port_declaration(SystemVerilogParser.Attr_tf_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_declaration(SystemVerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_declaration(SystemVerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_interface_ports}.
	 * @param ctx the parse tree
	 */
	void enterList_of_interface_ports(SystemVerilogParser.List_of_interface_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_interface_ports}.
	 * @param ctx the parse tree
	 */
	void exitList_of_interface_ports(SystemVerilogParser.List_of_interface_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_identifiers(SystemVerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_identifiers(SystemVerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_port_identifier_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_port_identifier_star(SystemVerilogParser.Comma_port_identifier_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_port_identifier_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_port_identifier_star(SystemVerilogParser.Comma_port_identifier_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterComma_port_identifier(SystemVerilogParser.Comma_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitComma_port_identifier(SystemVerilogParser.Comma_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPort_identifier(SystemVerilogParser.Port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPort_identifier(SystemVerilogParser.Port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_declarations(SystemVerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_declarations(SystemVerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_comma}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_declarations_comma(SystemVerilogParser.List_of_port_declarations_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_comma}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_declarations_comma(SystemVerilogParser.List_of_port_declarations_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_attr_port_declaration_star(SystemVerilogParser.Comma_attr_port_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_attr_port_declaration_star(SystemVerilogParser.Comma_attr_port_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComma_attr_port_declaration(SystemVerilogParser.Comma_attr_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComma_attr_port_declaration(SystemVerilogParser.Comma_attr_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_declarations_semicolon(SystemVerilogParser.List_of_port_declarations_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_declarations_semicolon(SystemVerilogParser.List_of_port_declarations_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 */
	void enterAttr_port_declaration_semicolon_plus(SystemVerilogParser.Attr_port_declaration_semicolon_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 */
	void exitAttr_port_declaration_semicolon_plus(SystemVerilogParser.Attr_port_declaration_semicolon_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 */
	void enterAttr_port_declaration_semicolon_star(SystemVerilogParser.Attr_port_declaration_semicolon_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 */
	void exitAttr_port_declaration_semicolon_star(SystemVerilogParser.Attr_port_declaration_semicolon_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterAttr_port_declaration_semicolon(SystemVerilogParser.Attr_port_declaration_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitAttr_port_declaration_semicolon(SystemVerilogParser.Attr_port_declaration_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttr_port_declaration(SystemVerilogParser.Attr_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttr_port_declaration(SystemVerilogParser.Attr_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPort_declaration(SystemVerilogParser.Port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPort_declaration(SystemVerilogParser.Port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#port_description}.
	 * @param ctx the parse tree
	 */
	void enterPort_description(SystemVerilogParser.Port_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#port_description}.
	 * @param ctx the parse tree
	 */
	void exitPort_description(SystemVerilogParser.Port_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#inout_description}.
	 * @param ctx the parse tree
	 */
	void enterInout_description(SystemVerilogParser.Inout_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#inout_description}.
	 * @param ctx the parse tree
	 */
	void exitInout_description(SystemVerilogParser.Inout_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#input_description}.
	 * @param ctx the parse tree
	 */
	void enterInput_description(SystemVerilogParser.Input_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#input_description}.
	 * @param ctx the parse tree
	 */
	void exitInput_description(SystemVerilogParser.Input_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#output_description}.
	 * @param ctx the parse tree
	 */
	void enterOutput_description(SystemVerilogParser.Output_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#output_description}.
	 * @param ctx the parse tree
	 */
	void exitOutput_description(SystemVerilogParser.Output_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#ref_description}.
	 * @param ctx the parse tree
	 */
	void enterRef_description(SystemVerilogParser.Ref_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#ref_description}.
	 * @param ctx the parse tree
	 */
	void exitRef_description(SystemVerilogParser.Ref_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#tf_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTf_declaration(SystemVerilogParser.Tf_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#tf_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTf_declaration(SystemVerilogParser.Tf_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInout_declaration(SystemVerilogParser.Inout_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInout_declaration(SystemVerilogParser.Inout_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInput_declaration(SystemVerilogParser.Input_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInput_declaration(SystemVerilogParser.Input_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutput_declaration(SystemVerilogParser.Output_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutput_declaration(SystemVerilogParser.Output_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRef_declaration(SystemVerilogParser.Ref_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRef_declaration(SystemVerilogParser.Ref_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#user_type}.
	 * @param ctx the parse tree
	 */
	void enterUser_type(SystemVerilogParser.User_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#user_type}.
	 * @param ctx the parse tree
	 */
	void exitUser_type(SystemVerilogParser.User_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#user_type_identifer}.
	 * @param ctx the parse tree
	 */
	void enterUser_type_identifer(SystemVerilogParser.User_type_identiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#user_type_identifer}.
	 * @param ctx the parse tree
	 */
	void exitUser_type_identifer(SystemVerilogParser.User_type_identiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#dimension_plus}.
	 * @param ctx the parse tree
	 */
	void enterDimension_plus(SystemVerilogParser.Dimension_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#dimension_plus}.
	 * @param ctx the parse tree
	 */
	void exitDimension_plus(SystemVerilogParser.Dimension_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#dimension_star}.
	 * @param ctx the parse tree
	 */
	void enterDimension_star(SystemVerilogParser.Dimension_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#dimension_star}.
	 * @param ctx the parse tree
	 */
	void exitDimension_star(SystemVerilogParser.Dimension_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(SystemVerilogParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(SystemVerilogParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(SystemVerilogParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(SystemVerilogParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#index_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expression(SystemVerilogParser.Index_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#index_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expression(SystemVerilogParser.Index_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#sb_range}.
	 * @param ctx the parse tree
	 */
	void enterSb_range(SystemVerilogParser.Sb_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#sb_range}.
	 * @param ctx the parse tree
	 */
	void exitSb_range(SystemVerilogParser.Sb_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#base_increment_range}.
	 * @param ctx the parse tree
	 */
	void enterBase_increment_range(SystemVerilogParser.Base_increment_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#base_increment_range}.
	 * @param ctx the parse tree
	 */
	void exitBase_increment_range(SystemVerilogParser.Base_increment_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#base_decrement_range}.
	 * @param ctx the parse tree
	 */
	void enterBase_decrement_range(SystemVerilogParser.Base_decrement_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#base_decrement_range}.
	 * @param ctx the parse tree
	 */
	void exitBase_decrement_range(SystemVerilogParser.Base_decrement_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#base_expression}.
	 * @param ctx the parse tree
	 */
	void enterBase_expression(SystemVerilogParser.Base_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#base_expression}.
	 * @param ctx the parse tree
	 */
	void exitBase_expression(SystemVerilogParser.Base_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void enterNet_type(SystemVerilogParser.Net_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void exitNet_type(SystemVerilogParser.Net_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void enterDrive_strength(SystemVerilogParser.Drive_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void exitDrive_strength(SystemVerilogParser.Drive_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#drive_strength_value_0}.
	 * @param ctx the parse tree
	 */
	void enterDrive_strength_value_0(SystemVerilogParser.Drive_strength_value_0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#drive_strength_value_0}.
	 * @param ctx the parse tree
	 */
	void exitDrive_strength_value_0(SystemVerilogParser.Drive_strength_value_0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#drive_strength_value_1}.
	 * @param ctx the parse tree
	 */
	void enterDrive_strength_value_1(SystemVerilogParser.Drive_strength_value_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#drive_strength_value_1}.
	 * @param ctx the parse tree
	 */
	void exitDrive_strength_value_1(SystemVerilogParser.Drive_strength_value_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void enterStrength0(SystemVerilogParser.Strength0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void exitStrength0(SystemVerilogParser.Strength0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void enterStrength1(SystemVerilogParser.Strength1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void exitStrength1(SystemVerilogParser.Strength1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#highz0}.
	 * @param ctx the parse tree
	 */
	void enterHighz0(SystemVerilogParser.Highz0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#highz0}.
	 * @param ctx the parse tree
	 */
	void exitHighz0(SystemVerilogParser.Highz0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#highz1}.
	 * @param ctx the parse tree
	 */
	void enterHighz1(SystemVerilogParser.Highz1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#highz1}.
	 * @param ctx the parse tree
	 */
	void exitHighz1(SystemVerilogParser.Highz1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 */
	void enterCharge_strength(SystemVerilogParser.Charge_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 */
	void exitCharge_strength(SystemVerilogParser.Charge_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#charge_size}.
	 * @param ctx the parse tree
	 */
	void enterCharge_size(SystemVerilogParser.Charge_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#charge_size}.
	 * @param ctx the parse tree
	 */
	void exitCharge_size(SystemVerilogParser.Charge_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_variable_descriptions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_descriptions(SystemVerilogParser.List_of_variable_descriptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_variable_descriptions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_descriptions(SystemVerilogParser.List_of_variable_descriptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_variable_description_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_variable_description_star(SystemVerilogParser.Comma_variable_description_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_variable_description_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_variable_description_star(SystemVerilogParser.Comma_variable_description_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_variable_description}.
	 * @param ctx the parse tree
	 */
	void enterComma_variable_description(SystemVerilogParser.Comma_variable_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_variable_description}.
	 * @param ctx the parse tree
	 */
	void exitComma_variable_description(SystemVerilogParser.Comma_variable_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_description}.
	 * @param ctx the parse tree
	 */
	void enterVariable_description(SystemVerilogParser.Variable_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_description}.
	 * @param ctx the parse tree
	 */
	void exitVariable_description(SystemVerilogParser.Variable_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(SystemVerilogParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(SystemVerilogParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_hierarchical_variable_descriptions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_hierarchical_variable_descriptions(SystemVerilogParser.List_of_hierarchical_variable_descriptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_hierarchical_variable_descriptions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_hierarchical_variable_descriptions(SystemVerilogParser.List_of_hierarchical_variable_descriptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_hierarchical_variable_description_star(SystemVerilogParser.Comma_hierarchical_variable_description_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_hierarchical_variable_description_star(SystemVerilogParser.Comma_hierarchical_variable_description_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description}.
	 * @param ctx the parse tree
	 */
	void enterComma_hierarchical_variable_description(SystemVerilogParser.Comma_hierarchical_variable_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description}.
	 * @param ctx the parse tree
	 */
	void exitComma_hierarchical_variable_description(SystemVerilogParser.Comma_hierarchical_variable_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_description}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_variable_description(SystemVerilogParser.Hierarchical_variable_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_description}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_variable_description(SystemVerilogParser.Hierarchical_variable_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_variable_identifier(SystemVerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_variable_identifier(SystemVerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNet_declaration(SystemVerilogParser.Net_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNet_declaration(SystemVerilogParser.Net_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReg_declaration(SystemVerilogParser.Reg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReg_declaration(SystemVerilogParser.Reg_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#logic_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLogic_declaration(SystemVerilogParser.Logic_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#logic_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLogic_declaration(SystemVerilogParser.Logic_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#bits_type}.
	 * @param ctx the parse tree
	 */
	void enterBits_type(SystemVerilogParser.Bits_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#bits_type}.
	 * @param ctx the parse tree
	 */
	void exitBits_type(SystemVerilogParser.Bits_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#bits_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBits_declaration(SystemVerilogParser.Bits_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#bits_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBits_declaration(SystemVerilogParser.Bits_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_declaration(SystemVerilogParser.Integer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_declaration(SystemVerilogParser.Integer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(SystemVerilogParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(SystemVerilogParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReal_declaration(SystemVerilogParser.Real_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReal_declaration(SystemVerilogParser.Real_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTime_declaration(SystemVerilogParser.Time_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTime_declaration(SystemVerilogParser.Time_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRealtime_declaration(SystemVerilogParser.Realtime_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRealtime_declaration(SystemVerilogParser.Realtime_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(SystemVerilogParser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(SystemVerilogParser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_declaration(SystemVerilogParser.Genvar_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_declaration(SystemVerilogParser.Genvar_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#usertype_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUsertype_variable_declaration(SystemVerilogParser.Usertype_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#usertype_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUsertype_variable_declaration(SystemVerilogParser.Usertype_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(SystemVerilogParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(SystemVerilogParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(SystemVerilogParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(SystemVerilogParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(SystemVerilogParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(SystemVerilogParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(SystemVerilogParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(SystemVerilogParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(SystemVerilogParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(SystemVerilogParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(SystemVerilogParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(SystemVerilogParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_interface}.
	 * @param ctx the parse tree
	 */
	void enterFunction_interface(SystemVerilogParser.Function_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_interface}.
	 * @param ctx the parse tree
	 */
	void exitFunction_interface(SystemVerilogParser.Function_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterFunction_item_declaration_star(SystemVerilogParser.Function_item_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitFunction_item_declaration_star(SystemVerilogParser.Function_item_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterFunction_item_declaration_semicolon(SystemVerilogParser.Function_item_declaration_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitFunction_item_declaration_semicolon(SystemVerilogParser.Function_item_declaration_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_item_declaration(SystemVerilogParser.Function_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_item_declaration(SystemVerilogParser.Function_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(SystemVerilogParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(SystemVerilogParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#colon_function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterColon_function_identifier(SystemVerilogParser.Colon_function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#colon_function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitColon_function_identifier(SystemVerilogParser.Colon_function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_declaration(SystemVerilogParser.Task_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_declaration(SystemVerilogParser.Task_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTask_identifier(SystemVerilogParser.Task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTask_identifier(SystemVerilogParser.Task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_interface}.
	 * @param ctx the parse tree
	 */
	void enterTask_interface(SystemVerilogParser.Task_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_interface}.
	 * @param ctx the parse tree
	 */
	void exitTask_interface(SystemVerilogParser.Task_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterTask_item_declaration_semicolon(SystemVerilogParser.Task_item_declaration_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitTask_item_declaration_semicolon(SystemVerilogParser.Task_item_declaration_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_item_declaration(SystemVerilogParser.Task_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_item_declaration(SystemVerilogParser.Task_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterTask_item_declaration_star(SystemVerilogParser.Task_item_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitTask_item_declaration_star(SystemVerilogParser.Task_item_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_statement(SystemVerilogParser.Task_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_statement(SystemVerilogParser.Task_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterStruct_item_semicolon(SystemVerilogParser.Struct_item_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_item_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitStruct_item_semicolon(SystemVerilogParser.Struct_item_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_item_star}.
	 * @param ctx the parse tree
	 */
	void enterStruct_item_star(SystemVerilogParser.Struct_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_item_star}.
	 * @param ctx the parse tree
	 */
	void exitStruct_item_star(SystemVerilogParser.Struct_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_item}.
	 * @param ctx the parse tree
	 */
	void enterStruct_item(SystemVerilogParser.Struct_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_item}.
	 * @param ctx the parse tree
	 */
	void exitStruct_item(SystemVerilogParser.Struct_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(SystemVerilogParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(SystemVerilogParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void enterEnum_type(SystemVerilogParser.Enum_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enum_type}.
	 * @param ctx the parse tree
	 */
	void exitEnum_type(SystemVerilogParser.Enum_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_enum_items}.
	 * @param ctx the parse tree
	 */
	void enterList_of_enum_items(SystemVerilogParser.List_of_enum_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_enum_items}.
	 * @param ctx the parse tree
	 */
	void exitList_of_enum_items(SystemVerilogParser.List_of_enum_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enum_item}.
	 * @param ctx the parse tree
	 */
	void enterEnum_item(SystemVerilogParser.Enum_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enum_item}.
	 * @param ctx the parse tree
	 */
	void exitEnum_item(SystemVerilogParser.Enum_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_identifier(SystemVerilogParser.Enum_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_identifier(SystemVerilogParser.Enum_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_enum_item_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_enum_item_star(SystemVerilogParser.Comma_enum_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_enum_item_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_enum_item_star(SystemVerilogParser.Comma_enum_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_enum_item}.
	 * @param ctx the parse tree
	 */
	void enterComma_enum_item(SystemVerilogParser.Comma_enum_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_enum_item}.
	 * @param ctx the parse tree
	 */
	void exitComma_enum_item(SystemVerilogParser.Comma_enum_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enumerated_type}.
	 * @param ctx the parse tree
	 */
	void enterEnumerated_type(SystemVerilogParser.Enumerated_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enumerated_type}.
	 * @param ctx the parse tree
	 */
	void exitEnumerated_type(SystemVerilogParser.Enumerated_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(SystemVerilogParser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(SystemVerilogParser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parameter_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterParameter_interface_assignments(SystemVerilogParser.Parameter_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parameter_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitParameter_interface_assignments(SystemVerilogParser.Parameter_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_interface_assignments(SystemVerilogParser.List_of_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_interface_assignments(SystemVerilogParser.List_of_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_ordered_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ordered_interface_assignments(SystemVerilogParser.List_of_ordered_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_ordered_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ordered_interface_assignments(SystemVerilogParser.List_of_ordered_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_ordered_interface_assignment_star(SystemVerilogParser.Comma_ordered_interface_assignment_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_ordered_interface_assignment_star(SystemVerilogParser.Comma_ordered_interface_assignment_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComma_ordered_interface_assignment(SystemVerilogParser.Comma_ordered_interface_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComma_ordered_interface_assignment(SystemVerilogParser.Comma_ordered_interface_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#ordered_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_interface_assignment(SystemVerilogParser.Ordered_interface_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#ordered_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_interface_assignment(SystemVerilogParser.Ordered_interface_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_named_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_named_interface_assignments(SystemVerilogParser.List_of_named_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_named_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_named_interface_assignments(SystemVerilogParser.List_of_named_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_named_interface_assignment_star(SystemVerilogParser.Comma_named_interface_assignment_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_named_interface_assignment_star(SystemVerilogParser.Comma_named_interface_assignment_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComma_named_interface_assignment(SystemVerilogParser.Comma_named_interface_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComma_named_interface_assignment(SystemVerilogParser.Comma_named_interface_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#named_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNamed_interface_assignment(SystemVerilogParser.Named_interface_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#named_interface_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNamed_interface_assignment(SystemVerilogParser.Named_interface_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_module_instances}.
	 * @param ctx the parse tree
	 */
	void enterList_of_module_instances(SystemVerilogParser.List_of_module_instancesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_module_instances}.
	 * @param ctx the parse tree
	 */
	void exitList_of_module_instances(SystemVerilogParser.List_of_module_instancesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_module_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_module_instance_star(SystemVerilogParser.Comma_module_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_module_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_module_instance_star(SystemVerilogParser.Comma_module_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_module_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_module_instance(SystemVerilogParser.Comma_module_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_module_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_module_instance(SystemVerilogParser.Comma_module_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void enterModule_instance(SystemVerilogParser.Module_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void exitModule_instance(SystemVerilogParser.Module_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#module_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModule_instance_identifier(SystemVerilogParser.Module_instance_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#module_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModule_instance_identifier(SystemVerilogParser.Module_instance_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayed_identifier(SystemVerilogParser.Arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayed_identifier(SystemVerilogParser.Arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSimple_arrayed_identifier(SystemVerilogParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSimple_arrayed_identifier(SystemVerilogParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_arrayed_identifier(SystemVerilogParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_arrayed_identifier(SystemVerilogParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#port_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterPort_interface_assignments(SystemVerilogParser.Port_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#port_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitPort_interface_assignments(SystemVerilogParser.Port_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(SystemVerilogParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(SystemVerilogParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_delay_values}.
	 * @param ctx the parse tree
	 */
	void enterList_of_delay_values(SystemVerilogParser.List_of_delay_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_delay_values}.
	 * @param ctx the parse tree
	 */
	void exitList_of_delay_values(SystemVerilogParser.List_of_delay_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_delay_value_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_delay_value_star(SystemVerilogParser.Comma_delay_value_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_delay_value_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_delay_value_star(SystemVerilogParser.Comma_delay_value_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_delay_value}.
	 * @param ctx the parse tree
	 */
	void enterComma_delay_value(SystemVerilogParser.Comma_delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_delay_value}.
	 * @param ctx the parse tree
	 */
	void exitComma_delay_value(SystemVerilogParser.Comma_delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void enterDelay_value(SystemVerilogParser.Delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void exitDelay_value(SystemVerilogParser.Delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 */
	void enterPulldown_strength(SystemVerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 */
	void exitPulldown_strength(SystemVerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 */
	void enterPullup_strength(SystemVerilogParser.Pullup_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 */
	void exitPullup_strength(SystemVerilogParser.Pullup_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#gate_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGate_instance_identifier(SystemVerilogParser.Gate_instance_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#gate_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGate_instance_identifier(SystemVerilogParser.Gate_instance_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterGate_instantiation(SystemVerilogParser.Gate_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitGate_instantiation(SystemVerilogParser.Gate_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gatetype(SystemVerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gatetype(SystemVerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterMos_switchtype(SystemVerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitMos_switchtype(SystemVerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switchtype(SystemVerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switchtype(SystemVerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterN_output_gatetype(SystemVerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitN_output_gatetype(SystemVerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gatetype(SystemVerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gatetype(SystemVerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterPass_switchtype(SystemVerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitPass_switchtype(SystemVerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_enable_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterPass_enable_switchtype(SystemVerilogParser.Pass_enable_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_enable_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitPass_enable_switchtype(SystemVerilogParser.Pass_enable_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pulldown_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterPulldown_instantiation(SystemVerilogParser.Pulldown_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pulldown_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitPulldown_instantiation(SystemVerilogParser.Pulldown_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pullup_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterPullup_instantiation(SystemVerilogParser.Pullup_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pullup_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitPullup_instantiation(SystemVerilogParser.Pullup_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enable_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterEnable_instantiation(SystemVerilogParser.Enable_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enable_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitEnable_instantiation(SystemVerilogParser.Enable_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#mos_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterMos_instantiation(SystemVerilogParser.Mos_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#mos_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitMos_instantiation(SystemVerilogParser.Mos_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#cmos_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterCmos_instantiation(SystemVerilogParser.Cmos_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#cmos_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitCmos_instantiation(SystemVerilogParser.Cmos_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_output_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterN_output_instantiation(SystemVerilogParser.N_output_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_output_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitN_output_instantiation(SystemVerilogParser.N_output_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_input_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterN_input_instantiation(SystemVerilogParser.N_input_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_input_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitN_input_instantiation(SystemVerilogParser.N_input_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterPass_instantiation(SystemVerilogParser.Pass_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitPass_instantiation(SystemVerilogParser.Pass_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_enable_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterPass_enable_instantiation(SystemVerilogParser.Pass_enable_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_enable_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitPass_enable_instantiation(SystemVerilogParser.Pass_enable_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_pull_gate_instance(SystemVerilogParser.List_of_pull_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_pull_gate_instance(SystemVerilogParser.List_of_pull_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_enable_gate_instance(SystemVerilogParser.List_of_enable_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_enable_gate_instance(SystemVerilogParser.List_of_enable_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_mos_switch_instance(SystemVerilogParser.List_of_mos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_mos_switch_instance(SystemVerilogParser.List_of_mos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_cmos_switch_instance(SystemVerilogParser.List_of_cmos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_cmos_switch_instance(SystemVerilogParser.List_of_cmos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_n_input_gate_instance(SystemVerilogParser.List_of_n_input_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_n_input_gate_instance(SystemVerilogParser.List_of_n_input_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_n_output_gate_instance(SystemVerilogParser.List_of_n_output_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_n_output_gate_instance(SystemVerilogParser.List_of_n_output_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_pass_switch_instance(SystemVerilogParser.List_of_pass_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_pass_switch_instance(SystemVerilogParser.List_of_pass_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterList_of_pass_enable_switch_instance(SystemVerilogParser.List_of_pass_enable_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitList_of_pass_enable_switch_instance(SystemVerilogParser.List_of_pass_enable_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_pull_gate_instance_star(SystemVerilogParser.Comma_pull_gate_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_pull_gate_instance_star(SystemVerilogParser.Comma_pull_gate_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_enable_gate_instance_star(SystemVerilogParser.Comma_enable_gate_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_enable_gate_instance_star(SystemVerilogParser.Comma_enable_gate_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_mos_switch_instance_star(SystemVerilogParser.Comma_mos_switch_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_mos_switch_instance_star(SystemVerilogParser.Comma_mos_switch_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_cmos_switch_instance_star(SystemVerilogParser.Comma_cmos_switch_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_cmos_switch_instance_star(SystemVerilogParser.Comma_cmos_switch_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_n_input_gate_instance_star(SystemVerilogParser.Comma_n_input_gate_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_n_input_gate_instance_star(SystemVerilogParser.Comma_n_input_gate_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_n_output_gate_instance_star(SystemVerilogParser.Comma_n_output_gate_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_n_output_gate_instance_star(SystemVerilogParser.Comma_n_output_gate_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_pass_switch_instance_star(SystemVerilogParser.Comma_pass_switch_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_pass_switch_instance_star(SystemVerilogParser.Comma_pass_switch_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_pass_enable_switch_instance_star(SystemVerilogParser.Comma_pass_enable_switch_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_pass_enable_switch_instance_star(SystemVerilogParser.Comma_pass_enable_switch_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_pull_gate_instance(SystemVerilogParser.Comma_pull_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_pull_gate_instance(SystemVerilogParser.Comma_pull_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_enable_gate_instance(SystemVerilogParser.Comma_enable_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_enable_gate_instance(SystemVerilogParser.Comma_enable_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_mos_switch_instance(SystemVerilogParser.Comma_mos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_mos_switch_instance(SystemVerilogParser.Comma_mos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_cmos_switch_instance(SystemVerilogParser.Comma_cmos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_cmos_switch_instance(SystemVerilogParser.Comma_cmos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_n_input_gate_instance(SystemVerilogParser.Comma_n_input_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_n_input_gate_instance(SystemVerilogParser.Comma_n_input_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_n_output_gate_instance(SystemVerilogParser.Comma_n_output_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_n_output_gate_instance(SystemVerilogParser.Comma_n_output_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_pass_switch_instance(SystemVerilogParser.Comma_pass_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_pass_switch_instance(SystemVerilogParser.Comma_pass_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterComma_pass_enable_switch_instance(SystemVerilogParser.Comma_pass_enable_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitComma_pass_enable_switch_instance(SystemVerilogParser.Comma_pass_enable_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterPull_gate_instance(SystemVerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitPull_gate_instance(SystemVerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gate_instance(SystemVerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gate_instance(SystemVerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterMos_switch_instance(SystemVerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitMos_switch_instance(SystemVerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switch_instance(SystemVerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switch_instance(SystemVerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gate_instance(SystemVerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gate_instance(SystemVerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterN_output_gate_instance(SystemVerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitN_output_gate_instance(SystemVerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterPass_switch_instance(SystemVerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitPass_switch_instance(SystemVerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterPass_enable_switch_instance(SystemVerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitPass_enable_switch_instance(SystemVerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pull_gate_interface}.
	 * @param ctx the parse tree
	 */
	void enterPull_gate_interface(SystemVerilogParser.Pull_gate_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pull_gate_interface}.
	 * @param ctx the parse tree
	 */
	void exitPull_gate_interface(SystemVerilogParser.Pull_gate_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enable_gate_interface}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gate_interface(SystemVerilogParser.Enable_gate_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enable_gate_interface}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gate_interface(SystemVerilogParser.Enable_gate_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#mos_switch_interface}.
	 * @param ctx the parse tree
	 */
	void enterMos_switch_interface(SystemVerilogParser.Mos_switch_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#mos_switch_interface}.
	 * @param ctx the parse tree
	 */
	void exitMos_switch_interface(SystemVerilogParser.Mos_switch_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#cmos_switch_interface}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switch_interface(SystemVerilogParser.Cmos_switch_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#cmos_switch_interface}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switch_interface(SystemVerilogParser.Cmos_switch_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_input_gate_interface}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gate_interface(SystemVerilogParser.N_input_gate_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_input_gate_interface}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gate_interface(SystemVerilogParser.N_input_gate_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#n_output_gate_interface}.
	 * @param ctx the parse tree
	 */
	void enterN_output_gate_interface(SystemVerilogParser.N_output_gate_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#n_output_gate_interface}.
	 * @param ctx the parse tree
	 */
	void exitN_output_gate_interface(SystemVerilogParser.N_output_gate_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_switch_interface}.
	 * @param ctx the parse tree
	 */
	void enterPass_switch_interface(SystemVerilogParser.Pass_switch_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_switch_interface}.
	 * @param ctx the parse tree
	 */
	void exitPass_switch_interface(SystemVerilogParser.Pass_switch_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_interface}.
	 * @param ctx the parse tree
	 */
	void enterPass_enable_switch_interface(SystemVerilogParser.Pass_enable_switch_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_interface}.
	 * @param ctx the parse tree
	 */
	void exitPass_enable_switch_interface(SystemVerilogParser.Pass_enable_switch_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_input_terminals}.
	 * @param ctx the parse tree
	 */
	void enterList_of_input_terminals(SystemVerilogParser.List_of_input_terminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_input_terminals}.
	 * @param ctx the parse tree
	 */
	void exitList_of_input_terminals(SystemVerilogParser.List_of_input_terminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_output_terminals}.
	 * @param ctx the parse tree
	 */
	void enterList_of_output_terminals(SystemVerilogParser.List_of_output_terminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_output_terminals}.
	 * @param ctx the parse tree
	 */
	void exitList_of_output_terminals(SystemVerilogParser.List_of_output_terminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_input_terminal_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_input_terminal_star(SystemVerilogParser.Comma_input_terminal_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_input_terminal_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_input_terminal_star(SystemVerilogParser.Comma_input_terminal_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_output_terminal_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_output_terminal_star(SystemVerilogParser.Comma_output_terminal_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_output_terminal_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_output_terminal_star(SystemVerilogParser.Comma_output_terminal_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_input_terminal}.
	 * @param ctx the parse tree
	 */
	void enterComma_input_terminal(SystemVerilogParser.Comma_input_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_input_terminal}.
	 * @param ctx the parse tree
	 */
	void exitComma_input_terminal(SystemVerilogParser.Comma_input_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_output_terminal}.
	 * @param ctx the parse tree
	 */
	void enterComma_output_terminal(SystemVerilogParser.Comma_output_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_output_terminal}.
	 * @param ctx the parse tree
	 */
	void exitComma_output_terminal(SystemVerilogParser.Comma_output_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 */
	void enterEnable_terminal(SystemVerilogParser.Enable_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 */
	void exitEnable_terminal(SystemVerilogParser.Enable_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 */
	void enterInput_terminal(SystemVerilogParser.Input_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 */
	void exitInput_terminal(SystemVerilogParser.Input_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 */
	void enterInout_terminal(SystemVerilogParser.Inout_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 */
	void exitInout_terminal(SystemVerilogParser.Inout_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void enterNcontrol_terminal(SystemVerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void exitNcontrol_terminal(SystemVerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 */
	void enterOutput_terminal(SystemVerilogParser.Output_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 */
	void exitOutput_terminal(SystemVerilogParser.Output_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void enterPcontrol_terminal(SystemVerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void exitPcontrol_terminal(SystemVerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#statement_star}.
	 * @param ctx the parse tree
	 */
	void enterStatement_star(SystemVerilogParser.Statement_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#statement_star}.
	 * @param ctx the parse tree
	 */
	void exitStatement_star(SystemVerilogParser.Statement_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#statement_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterStatement_semicolon(SystemVerilogParser.Statement_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#statement_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitStatement_semicolon(SystemVerilogParser.Statement_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SystemVerilogParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SystemVerilogParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(SystemVerilogParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(SystemVerilogParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#flow_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterFlow_control_statement(SystemVerilogParser.Flow_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#flow_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitFlow_control_statement(SystemVerilogParser.Flow_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(SystemVerilogParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(SystemVerilogParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_call_statement(SystemVerilogParser.Task_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_call_statement(SystemVerilogParser.Task_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_statement}.
	 * @param ctx the parse tree
	 */
	void enterEvent_statement(SystemVerilogParser.Event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_statement}.
	 * @param ctx the parse tree
	 */
	void exitEvent_statement(SystemVerilogParser.Event_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#procedural_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_statement(SystemVerilogParser.Procedural_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#procedural_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_statement(SystemVerilogParser.Procedural_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(SystemVerilogParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(SystemVerilogParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#subroutine_statement}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_statement(SystemVerilogParser.Subroutine_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#subroutine_statement}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_statement(SystemVerilogParser.Subroutine_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SystemVerilogParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SystemVerilogParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(SystemVerilogParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(SystemVerilogParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_continuous_assignments(SystemVerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_continuous_assignments(SystemVerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(SystemVerilogParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(SystemVerilogParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeassign_statement(SystemVerilogParser.Deassign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeassign_statement(SystemVerilogParser.Deassign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#force_statement}.
	 * @param ctx the parse tree
	 */
	void enterForce_statement(SystemVerilogParser.Force_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#force_statement}.
	 * @param ctx the parse tree
	 */
	void exitForce_statement(SystemVerilogParser.Force_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#release_statement}.
	 * @param ctx the parse tree
	 */
	void enterRelease_statement(SystemVerilogParser.Release_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#release_statement}.
	 * @param ctx the parse tree
	 */
	void exitRelease_statement(SystemVerilogParser.Release_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_timing_control_statement(SystemVerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_timing_control_statement(SystemVerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#property_statement}.
	 * @param ctx the parse tree
	 */
	void enterProperty_statement(SystemVerilogParser.Property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#property_statement}.
	 * @param ctx the parse tree
	 */
	void exitProperty_statement(SystemVerilogParser.Property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#disable_condition_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisable_condition_statement(SystemVerilogParser.Disable_condition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#disable_condition_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisable_condition_statement(SystemVerilogParser.Disable_condition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#property_expression}.
	 * @param ctx the parse tree
	 */
	void enterProperty_expression(SystemVerilogParser.Property_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#property_expression}.
	 * @param ctx the parse tree
	 */
	void exitProperty_expression(SystemVerilogParser.Property_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_assertion_statement(SystemVerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_assertion_statement(SystemVerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#assert_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssert_else_statement(SystemVerilogParser.Assert_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#assert_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssert_else_statement(SystemVerilogParser.Assert_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#assert_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssert_statement(SystemVerilogParser.Assert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#assert_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssert_statement(SystemVerilogParser.Assert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 */
	void enterSystem_task_enable(SystemVerilogParser.System_task_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 */
	void exitSystem_task_enable(SystemVerilogParser.System_task_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSystem_task_identifier(SystemVerilogParser.System_task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSystem_task_identifier(SystemVerilogParser.System_task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterTask_interface_assignments(SystemVerilogParser.Task_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitTask_interface_assignments(SystemVerilogParser.Task_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#task_enable}.
	 * @param ctx the parse tree
	 */
	void enterTask_enable(SystemVerilogParser.Task_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#task_enable}.
	 * @param ctx the parse tree
	 */
	void exitTask_enable(SystemVerilogParser.Task_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_task_identifier(SystemVerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_task_identifier(SystemVerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisable_statement(SystemVerilogParser.Disable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisable_statement(SystemVerilogParser.Disable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_block_identifier(SystemVerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_block_identifier(SystemVerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterVariable_lvalue(SystemVerilogParser.Variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitVariable_lvalue(SystemVerilogParser.Variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_variable_lvalue(SystemVerilogParser.Hierarchical_variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_variable_lvalue(SystemVerilogParser.Hierarchical_variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterVariable_concatenation(SystemVerilogParser.Variable_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitVariable_concatenation(SystemVerilogParser.Variable_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_concatenation_value}.
	 * @param ctx the parse tree
	 */
	void enterVariable_concatenation_value(SystemVerilogParser.Variable_concatenation_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_concatenation_value}.
	 * @param ctx the parse tree
	 */
	void exitVariable_concatenation_value(SystemVerilogParser.Variable_concatenation_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_vcv_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_vcv_star(SystemVerilogParser.Comma_vcv_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_vcv_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_vcv_star(SystemVerilogParser.Comma_vcv_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBlocking_assignment(SystemVerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBlocking_assignment(SystemVerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNonblocking_assignment(SystemVerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNonblocking_assignment(SystemVerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#prefix_assignment}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_assignment(SystemVerilogParser.Prefix_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#prefix_assignment}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_assignment(SystemVerilogParser.Prefix_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#postfix_assignment}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_assignment(SystemVerilogParser.Postfix_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#postfix_assignment}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_assignment(SystemVerilogParser.Postfix_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOperator_assignment(SystemVerilogParser.Operator_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOperator_assignment(SystemVerilogParser.Operator_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#declarative_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_assignment(SystemVerilogParser.Declarative_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#declarative_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_assignment(SystemVerilogParser.Declarative_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_or_event_control(SystemVerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_or_event_control(SystemVerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_control(SystemVerilogParser.Delay_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_control(SystemVerilogParser.Delay_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control(SystemVerilogParser.Event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control(SystemVerilogParser.Event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_control_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control_identifier(SystemVerilogParser.Event_control_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_control_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control_identifier(SystemVerilogParser.Event_control_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_control_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control_expression(SystemVerilogParser.Event_control_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_control_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control_expression(SystemVerilogParser.Event_control_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression(SystemVerilogParser.Event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression(SystemVerilogParser.Event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#single_event_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_event_expression(SystemVerilogParser.Single_event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#single_event_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_event_expression(SystemVerilogParser.Single_event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_expression_edgespec}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression_edgespec(SystemVerilogParser.Event_expression_edgespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_expression_edgespec}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression_edgespec(SystemVerilogParser.Event_expression_edgespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_expression_or}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression_or(SystemVerilogParser.Event_expression_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_expression_or}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression_or(SystemVerilogParser.Event_expression_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_comma}.
	 * @param ctx the parse tree
	 */
	void enterList_of_event_expression_comma(SystemVerilogParser.List_of_event_expression_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_comma}.
	 * @param ctx the parse tree
	 */
	void exitList_of_event_expression_comma(SystemVerilogParser.List_of_event_expression_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_event_expression_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_event_expression_star(SystemVerilogParser.Comma_event_expression_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_event_expression_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_event_expression_star(SystemVerilogParser.Comma_event_expression_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_event_expression}.
	 * @param ctx the parse tree
	 */
	void enterComma_event_expression(SystemVerilogParser.Comma_event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_event_expression}.
	 * @param ctx the parse tree
	 */
	void exitComma_event_expression(SystemVerilogParser.Comma_event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_or}.
	 * @param ctx the parse tree
	 */
	void enterList_of_event_expression_or(SystemVerilogParser.List_of_event_expression_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_or}.
	 * @param ctx the parse tree
	 */
	void exitList_of_event_expression_or(SystemVerilogParser.List_of_event_expression_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#or_event_expression_star}.
	 * @param ctx the parse tree
	 */
	void enterOr_event_expression_star(SystemVerilogParser.Or_event_expression_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#or_event_expression_star}.
	 * @param ctx the parse tree
	 */
	void exitOr_event_expression_star(SystemVerilogParser.Or_event_expression_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#or_event_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_event_expression(SystemVerilogParser.Or_event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#or_event_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_event_expression(SystemVerilogParser.Or_event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_control_wildcard}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control_wildcard(SystemVerilogParser.Event_control_wildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_control_wildcard}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control_wildcard(SystemVerilogParser.Event_control_wildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#repeat_event_control}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_event_control(SystemVerilogParser.Repeat_event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#repeat_event_control}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_event_control(SystemVerilogParser.Repeat_event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger(SystemVerilogParser.Event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger(SystemVerilogParser.Event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_event_identifier(SystemVerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_event_identifier(SystemVerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_identifier(SystemVerilogParser.Event_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_identifier(SystemVerilogParser.Event_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void enterWait_statement(SystemVerilogParser.Wait_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void exitWait_statement(SystemVerilogParser.Wait_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_generated_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterAttr_generated_instantiation(SystemVerilogParser.Attr_generated_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_generated_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitAttr_generated_instantiation(SystemVerilogParser.Attr_generated_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generated_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterGenerated_instantiation(SystemVerilogParser.Generated_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generated_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitGenerated_instantiation(SystemVerilogParser.Generated_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_item_star}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_item_star(SystemVerilogParser.Generate_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_item_star}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_item_star(SystemVerilogParser.Generate_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_item(SystemVerilogParser.Generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_item(SystemVerilogParser.Generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_block(SystemVerilogParser.Generate_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_block(SystemVerilogParser.Generate_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier0}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_colon_block_identifier0(SystemVerilogParser.Generate_colon_block_identifier0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier0}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_colon_block_identifier0(SystemVerilogParser.Generate_colon_block_identifier0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier1}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_colon_block_identifier1(SystemVerilogParser.Generate_colon_block_identifier1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier1}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_colon_block_identifier1(SystemVerilogParser.Generate_colon_block_identifier1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_colon_block_identifier(SystemVerilogParser.Generate_colon_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_colon_block_identifier(SystemVerilogParser.Generate_colon_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_block_identifier(SystemVerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_block_identifier(SystemVerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_conditional_statement(SystemVerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_conditional_statement(SystemVerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_if_statement(SystemVerilogParser.Generate_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_if_statement(SystemVerilogParser.Generate_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_else_statement(SystemVerilogParser.Generate_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_else_statement(SystemVerilogParser.Generate_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_loop_statement(SystemVerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_loop_statement(SystemVerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_forever_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_forever_loop_statement(SystemVerilogParser.Generate_forever_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_forever_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_forever_loop_statement(SystemVerilogParser.Generate_forever_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_repeat_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_repeat_loop_statement(SystemVerilogParser.Generate_repeat_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_repeat_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_repeat_loop_statement(SystemVerilogParser.Generate_repeat_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_while_loop_statement(SystemVerilogParser.Generate_while_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_while_loop_statement(SystemVerilogParser.Generate_while_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_do_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_do_loop_statement(SystemVerilogParser.Generate_do_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_do_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_do_loop_statement(SystemVerilogParser.Generate_do_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_for_loop_statement(SystemVerilogParser.Generate_for_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_for_loop_statement(SystemVerilogParser.Generate_for_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_case_statement(SystemVerilogParser.Generate_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_case_statement(SystemVerilogParser.Generate_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_case_item_star}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_case_item_star(SystemVerilogParser.Generate_case_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_case_item_star}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_case_item_star(SystemVerilogParser.Generate_case_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_case_item(SystemVerilogParser.Generate_case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_case_item(SystemVerilogParser.Generate_case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(SystemVerilogParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(SystemVerilogParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SystemVerilogParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SystemVerilogParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseif_statement(SystemVerilogParser.Elseif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseif_statement(SystemVerilogParser.Elseif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(SystemVerilogParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(SystemVerilogParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(SystemVerilogParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(SystemVerilogParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(SystemVerilogParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(SystemVerilogParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#forever_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterForever_loop_statement(SystemVerilogParser.Forever_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#forever_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitForever_loop_statement(SystemVerilogParser.Forever_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#repeat_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_loop_statement(SystemVerilogParser.Repeat_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#repeat_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_loop_statement(SystemVerilogParser.Repeat_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(SystemVerilogParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(SystemVerilogParser.While_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#do_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_loop_statement(SystemVerilogParser.Do_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#do_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_loop_statement(SystemVerilogParser.Do_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(SystemVerilogParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(SystemVerilogParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#loop_init_assignment}.
	 * @param ctx the parse tree
	 */
	void enterLoop_init_assignment(SystemVerilogParser.Loop_init_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#loop_init_assignment}.
	 * @param ctx the parse tree
	 */
	void exitLoop_init_assignment(SystemVerilogParser.Loop_init_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#loop_terminate_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_terminate_expression(SystemVerilogParser.Loop_terminate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#loop_terminate_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_terminate_expression(SystemVerilogParser.Loop_terminate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#loop_step_assignment}.
	 * @param ctx the parse tree
	 */
	void enterLoop_step_assignment(SystemVerilogParser.Loop_step_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#loop_step_assignment}.
	 * @param ctx the parse tree
	 */
	void exitLoop_step_assignment(SystemVerilogParser.Loop_step_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(SystemVerilogParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(SystemVerilogParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_item_star}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_star(SystemVerilogParser.Case_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_item_star}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_star(SystemVerilogParser.Case_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(SystemVerilogParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(SystemVerilogParser.Case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_switch}.
	 * @param ctx the parse tree
	 */
	void enterCase_switch(SystemVerilogParser.Case_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_switch}.
	 * @param ctx the parse tree
	 */
	void exitCase_switch(SystemVerilogParser.Case_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_item_key}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_key(SystemVerilogParser.Case_item_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_item_key}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_key(SystemVerilogParser.Case_item_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#case_item_key_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_key_expression(SystemVerilogParser.Case_item_key_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#case_item_key_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_key_expression(SystemVerilogParser.Case_item_key_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression}.
	 * @param ctx the parse tree
	 */
	void enterComma_case_item_key_expression(SystemVerilogParser.Comma_case_item_key_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression}.
	 * @param ctx the parse tree
	 */
	void exitComma_case_item_key_expression(SystemVerilogParser.Comma_case_item_key_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_case_item_key_expression_star(SystemVerilogParser.Comma_case_item_key_expression_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_case_item_key_expression_star(SystemVerilogParser.Comma_case_item_key_expression_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SystemVerilogParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SystemVerilogParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(SystemVerilogParser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(SystemVerilogParser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#primary_range}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_range(SystemVerilogParser.Primary_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#primary_range}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_range(SystemVerilogParser.Primary_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SystemVerilogParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SystemVerilogParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(SystemVerilogParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(SystemVerilogParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#unary_post_assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_post_assign_expression(SystemVerilogParser.Unary_post_assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#unary_post_assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_post_assign_expression(SystemVerilogParser.Unary_post_assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#unary_pre_assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_pre_assign_expression(SystemVerilogParser.Unary_pre_assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#unary_pre_assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_pre_assign_expression(SystemVerilogParser.Unary_pre_assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(SystemVerilogParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(SystemVerilogParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expression(SystemVerilogParser.Ternary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expression(SystemVerilogParser.Ternary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterMintypmax_expression(SystemVerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitMintypmax_expression(SystemVerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#structured_value}.
	 * @param ctx the parse tree
	 */
	void enterStructured_value(SystemVerilogParser.Structured_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#structured_value}.
	 * @param ctx the parse tree
	 */
	void exitStructured_value(SystemVerilogParser.Structured_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#arrayed_structured_value}.
	 * @param ctx the parse tree
	 */
	void enterArrayed_structured_value(SystemVerilogParser.Arrayed_structured_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#arrayed_structured_value}.
	 * @param ctx the parse tree
	 */
	void exitArrayed_structured_value(SystemVerilogParser.Arrayed_structured_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item}.
	 * @param ctx the parse tree
	 */
	void enterArrayed_structure_item(SystemVerilogParser.Arrayed_structure_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item}.
	 * @param ctx the parse tree
	 */
	void exitArrayed_structure_item(SystemVerilogParser.Arrayed_structure_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item}.
	 * @param ctx the parse tree
	 */
	void enterComma_arrayed_structure_item(SystemVerilogParser.Comma_arrayed_structure_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item}.
	 * @param ctx the parse tree
	 */
	void exitComma_arrayed_structure_item(SystemVerilogParser.Comma_arrayed_structure_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_arrayed_structure_item_star(SystemVerilogParser.Comma_arrayed_structure_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_arrayed_structure_item_star(SystemVerilogParser.Comma_arrayed_structure_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item_plus}.
	 * @param ctx the parse tree
	 */
	void enterArrayed_structure_item_plus(SystemVerilogParser.Arrayed_structure_item_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item_plus}.
	 * @param ctx the parse tree
	 */
	void exitArrayed_structure_item_plus(SystemVerilogParser.Arrayed_structure_item_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_type_cast}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type_cast(SystemVerilogParser.Variable_type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_type_cast}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type_cast(SystemVerilogParser.Variable_type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#width_type_cast}.
	 * @param ctx the parse tree
	 */
	void enterWidth_type_cast(SystemVerilogParser.Width_type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#width_type_cast}.
	 * @param ctx the parse tree
	 */
	void exitWidth_type_cast(SystemVerilogParser.Width_type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#sign_type_cast}.
	 * @param ctx the parse tree
	 */
	void enterSign_type_cast(SystemVerilogParser.Sign_type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#sign_type_cast}.
	 * @param ctx the parse tree
	 */
	void exitSign_type_cast(SystemVerilogParser.Sign_type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#null_type_cast}.
	 * @param ctx the parse tree
	 */
	void enterNull_type_cast(SystemVerilogParser.Null_type_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#null_type_cast}.
	 * @param ctx the parse tree
	 */
	void exitNull_type_cast(SystemVerilogParser.Null_type_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(SystemVerilogParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(SystemVerilogParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#type_cast_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_cast_identifier(SystemVerilogParser.Type_cast_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#type_cast_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_cast_identifier(SystemVerilogParser.Type_cast_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#type_cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterType_cast_expression(SystemVerilogParser.Type_cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#type_cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitType_cast_expression(SystemVerilogParser.Type_cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SystemVerilogParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SystemVerilogParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_function_identifier(SystemVerilogParser.Hierarchical_function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_function_identifier(SystemVerilogParser.Hierarchical_function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#function_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_interface_assignments(SystemVerilogParser.Function_interface_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#function_interface_assignments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_interface_assignments(SystemVerilogParser.Function_interface_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function_call(SystemVerilogParser.System_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function_call(SystemVerilogParser.System_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#system_function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function_identifier(SystemVerilogParser.System_function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#system_function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function_identifier(SystemVerilogParser.System_function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void enterConstant_function_call(SystemVerilogParser.Constant_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void exitConstant_function_call(SystemVerilogParser.Constant_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#imported_function_call}.
	 * @param ctx the parse tree
	 */
	void enterImported_function_call(SystemVerilogParser.Imported_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#imported_function_call}.
	 * @param ctx the parse tree
	 */
	void exitImported_function_call(SystemVerilogParser.Imported_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#imported_function_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImported_function_hierarchical_identifier(SystemVerilogParser.Imported_function_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#imported_function_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImported_function_hierarchical_identifier(SystemVerilogParser.Imported_function_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#primary_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_hierarchical_identifier(SystemVerilogParser.Primary_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#primary_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_hierarchical_identifier(SystemVerilogParser.Primary_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#primary_imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_imported_hierarchical_identifier(SystemVerilogParser.Primary_imported_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#primary_imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_imported_hierarchical_identifier(SystemVerilogParser.Primary_imported_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImported_hierarchical_identifier(SystemVerilogParser.Imported_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImported_hierarchical_identifier(SystemVerilogParser.Imported_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expression(SystemVerilogParser.Parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expression(SystemVerilogParser.Parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(SystemVerilogParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(SystemVerilogParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_concatenation(SystemVerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_concatenation(SystemVerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_expression_plus}.
	 * @param ctx the parse tree
	 */
	void enterComma_expression_plus(SystemVerilogParser.Comma_expression_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_expression_plus}.
	 * @param ctx the parse tree
	 */
	void exitComma_expression_plus(SystemVerilogParser.Comma_expression_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_expression_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_expression_star(SystemVerilogParser.Comma_expression_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_expression_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_expression_star(SystemVerilogParser.Comma_expression_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#typedef_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_declaration(SystemVerilogParser.Typedef_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#typedef_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_declaration(SystemVerilogParser.Typedef_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#typedef_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_identifier(SystemVerilogParser.Typedef_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#typedef_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_identifier(SystemVerilogParser.Typedef_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#typedef_definition}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_definition(SystemVerilogParser.Typedef_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#typedef_definition}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_definition(SystemVerilogParser.Typedef_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#typedef_definition_type}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_definition_type(SystemVerilogParser.Typedef_definition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#typedef_definition_type}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_definition_type(SystemVerilogParser.Typedef_definition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type(SystemVerilogParser.Complex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type(SystemVerilogParser.Complex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#typedef_type}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_type(SystemVerilogParser.Typedef_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#typedef_type}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_type(SystemVerilogParser.Typedef_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void enterPar_block(SystemVerilogParser.Par_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void exitPar_block(SystemVerilogParser.Par_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void enterSeq_block(SystemVerilogParser.Seq_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void exitSeq_block(SystemVerilogParser.Seq_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBlock_identifier(SystemVerilogParser.Block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBlock_identifier(SystemVerilogParser.Block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#colon_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterColon_block_identifier(SystemVerilogParser.Colon_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#colon_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitColon_block_identifier(SystemVerilogParser.Colon_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#block_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_declaration_star(SystemVerilogParser.Block_item_declaration_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#block_item_declaration_star}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_declaration_star(SystemVerilogParser.Block_item_declaration_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#block_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_declaration_semicolon(SystemVerilogParser.Block_item_declaration_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#block_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_declaration_semicolon(SystemVerilogParser.Block_item_declaration_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_declaration(SystemVerilogParser.Block_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_declaration(SystemVerilogParser.Block_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 */
	void enterJoin_keyword(SystemVerilogParser.Join_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 */
	void exitJoin_keyword(SystemVerilogParser.Join_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void enterContinuous_assign(SystemVerilogParser.Continuous_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void exitContinuous_assign(SystemVerilogParser.Continuous_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_assignments(SystemVerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_assignments(SystemVerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment_star}.
	 * @param ctx the parse tree
	 */
	void enterComma_variable_assignment_star(SystemVerilogParser.Comma_variable_assignment_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment_star}.
	 * @param ctx the parse tree
	 */
	void exitComma_variable_assignment_star(SystemVerilogParser.Comma_variable_assignment_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComma_variable_assignment(SystemVerilogParser.Comma_variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComma_variable_assignment(SystemVerilogParser.Comma_variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(SystemVerilogParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(SystemVerilogParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void enterInitial_construct(SystemVerilogParser.Initial_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void exitInitial_construct(SystemVerilogParser.Initial_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#final_construct}.
	 * @param ctx the parse tree
	 */
	void enterFinal_construct(SystemVerilogParser.Final_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#final_construct}.
	 * @param ctx the parse tree
	 */
	void exitFinal_construct(SystemVerilogParser.Final_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAlways_keyword(SystemVerilogParser.Always_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAlways_keyword(SystemVerilogParser.Always_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void enterAlways_construct(SystemVerilogParser.Always_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void exitAlways_construct(SystemVerilogParser.Always_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attribute_instance_star}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_instance_star(SystemVerilogParser.Attribute_instance_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attribute_instance_star}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_instance_star(SystemVerilogParser.Attribute_instance_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_instance(SystemVerilogParser.Attribute_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_instance(SystemVerilogParser.Attribute_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_spec_star}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec_star(SystemVerilogParser.Attr_spec_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_spec_star}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec_star(SystemVerilogParser.Attr_spec_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec(SystemVerilogParser.Attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec(SystemVerilogParser.Attr_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(SystemVerilogParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(SystemVerilogParser.Attr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SystemVerilogParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SystemVerilogParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_identifier(SystemVerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_identifier(SystemVerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item_star}.
	 * @param ctx the parse tree
	 */
	void enterDot_hierarchical_identifier_branch_item_star(SystemVerilogParser.Dot_hierarchical_identifier_branch_item_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item_star}.
	 * @param ctx the parse tree
	 */
	void exitDot_hierarchical_identifier_branch_item_star(SystemVerilogParser.Dot_hierarchical_identifier_branch_item_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 */
	void enterDot_hierarchical_identifier_branch_item(SystemVerilogParser.Dot_hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 */
	void exitDot_hierarchical_identifier_branch_item(SystemVerilogParser.Dot_hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_identifier_branch_item(SystemVerilogParser.Hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_identifier_branch_item(SystemVerilogParser.Hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_compiler_directive(SystemVerilogParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_compiler_directive(SystemVerilogParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#timeunit_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimeunit_directive(SystemVerilogParser.Timeunit_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#timeunit_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimeunit_directive(SystemVerilogParser.Timeunit_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#timeprecision_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimeprecision_directive(SystemVerilogParser.Timeprecision_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#timeprecision_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimeprecision_directive(SystemVerilogParser.Timeprecision_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#default_nettype_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_nettype_statement(SystemVerilogParser.Default_nettype_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#default_nettype_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_nettype_statement(SystemVerilogParser.Default_nettype_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SystemVerilogParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SystemVerilogParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#integral_number}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_number(SystemVerilogParser.Integral_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#integral_number}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_number(SystemVerilogParser.Integral_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SystemVerilogParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(SystemVerilogParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SystemVerilogParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(SystemVerilogParser.Real_numberContext ctx);
}