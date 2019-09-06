// Generated from SystemVerilogParser.g4 by ANTLR 4.7.1
package vn.ductt.verk.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SystemVerilogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SystemVerilogParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_keyword(SystemVerilogParser.Module_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_keyword(SystemVerilogParser.Struct_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#any_case_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_case_keyword(SystemVerilogParser.Any_case_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(SystemVerilogParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SystemVerilogParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(SystemVerilogParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_assign_operator(SystemVerilogParser.Unary_assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_assign_operator(SystemVerilogParser.Binary_assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(SystemVerilogParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#description_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription_star(SystemVerilogParser.Description_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#header_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_text(SystemVerilogParser.Header_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#design_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_attribute(SystemVerilogParser.Design_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_directive(SystemVerilogParser.Compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(SystemVerilogParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(SystemVerilogParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_identifier(SystemVerilogParser.Module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_interface(SystemVerilogParser.Module_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_parameter_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_parameter_interface(SystemVerilogParser.Module_parameter_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_port_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_port_interface(SystemVerilogParser.Module_port_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item_star(SystemVerilogParser.Module_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item(SystemVerilogParser.Module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#colon_module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_module_identifier(SystemVerilogParser.Colon_module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(SystemVerilogParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_identifier(SystemVerilogParser.Package_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#colon_package_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_package_identifier(SystemVerilogParser.Colon_package_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_item_star(SystemVerilogParser.Package_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_item(SystemVerilogParser.Package_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#import_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_package(SystemVerilogParser.Import_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#package_item_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_item_identifier(SystemVerilogParser.Package_item_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_item_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_item_semicolon(SystemVerilogParser.Parameter_item_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_item(SystemVerilogParser.Parameter_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_port_item_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_port_item_semicolon(SystemVerilogParser.Attr_port_item_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_variable_item_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_variable_item_semicolon(SystemVerilogParser.Attr_variable_item_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_item(SystemVerilogParser.Variable_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#subroutine_item_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_item_semicolon(SystemVerilogParser.Subroutine_item_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#subroutine_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_item(SystemVerilogParser.Subroutine_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_construct_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_construct_item(SystemVerilogParser.Attr_construct_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#construct_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruct_item(SystemVerilogParser.Construct_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_component_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_component_item(SystemVerilogParser.Attr_component_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#component_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_item(SystemVerilogParser.Component_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#compiler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_item(SystemVerilogParser.Compiler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_item(SystemVerilogParser.Type_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#null_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_item(SystemVerilogParser.Null_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_interface_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_interface_parameters(SystemVerilogParser.List_of_interface_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_parameter_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_declarations(SystemVerilogParser.List_of_parameter_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_parameter_declaration_star(SystemVerilogParser.Comma_parameter_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_parameter_declaration(SystemVerilogParser.Comma_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_parameter_descriptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_descriptions(SystemVerilogParser.List_of_parameter_descriptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#param_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_declaration(SystemVerilogParser.Param_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#param_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_description(SystemVerilogParser.Param_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(SystemVerilogParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_declaration(SystemVerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_override(SystemVerilogParser.Parameter_overrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_tf_interface_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_interface_ports(SystemVerilogParser.List_of_tf_interface_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_port_declarations(SystemVerilogParser.List_of_tf_port_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_port_declarations_comma(SystemVerilogParser.List_of_tf_port_declarations_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_attr_tf_port_declaration_star(SystemVerilogParser.Comma_attr_tf_port_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_attr_tf_port_declaration(SystemVerilogParser.Comma_attr_tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_tf_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_port_declarations_semicolon(SystemVerilogParser.List_of_tf_port_declarations_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_tf_port_declaration_semicolon_plus(SystemVerilogParser.Attr_tf_port_declaration_semicolon_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_tf_port_declaration_semicolon_star(SystemVerilogParser.Attr_tf_port_declaration_semicolon_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_tf_port_declaration_semicolon(SystemVerilogParser.Attr_tf_port_declaration_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_tf_port_declaration(SystemVerilogParser.Attr_tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_declaration(SystemVerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_interface_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_interface_ports(SystemVerilogParser.List_of_interface_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(SystemVerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_port_identifier_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_port_identifier_star(SystemVerilogParser.Comma_port_identifier_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_port_identifier(SystemVerilogParser.Comma_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_identifier(SystemVerilogParser.Port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_declarations(SystemVerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_declarations_comma(SystemVerilogParser.List_of_port_declarations_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_attr_port_declaration_star(SystemVerilogParser.Comma_attr_port_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_attr_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_attr_port_declaration(SystemVerilogParser.Comma_attr_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_port_declarations_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_declarations_semicolon(SystemVerilogParser.List_of_port_declarations_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_port_declaration_semicolon_plus(SystemVerilogParser.Attr_port_declaration_semicolon_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_port_declaration_semicolon_star(SystemVerilogParser.Attr_port_declaration_semicolon_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_port_declaration_semicolon(SystemVerilogParser.Attr_port_declaration_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_port_declaration(SystemVerilogParser.Attr_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(SystemVerilogParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_description(SystemVerilogParser.Port_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_description(SystemVerilogParser.Inout_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_description(SystemVerilogParser.Input_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_description(SystemVerilogParser.Output_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ref_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_description(SystemVerilogParser.Ref_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#tf_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_declaration(SystemVerilogParser.Tf_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_declaration(SystemVerilogParser.Inout_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(SystemVerilogParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(SystemVerilogParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_declaration(SystemVerilogParser.Ref_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#user_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_type(SystemVerilogParser.User_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#user_type_identifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_type_identifer(SystemVerilogParser.User_type_identiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dimension_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension_plus(SystemVerilogParser.Dimension_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dimension_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension_star(SystemVerilogParser.Dimension_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(SystemVerilogParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(SystemVerilogParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#index_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expression(SystemVerilogParser.Index_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sb_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSb_range(SystemVerilogParser.Sb_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#base_increment_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_increment_range(SystemVerilogParser.Base_increment_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#base_decrement_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_decrement_range(SystemVerilogParser.Base_decrement_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#base_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_expression(SystemVerilogParser.Base_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type(SystemVerilogParser.Net_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength(SystemVerilogParser.Drive_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#drive_strength_value_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength_value_0(SystemVerilogParser.Drive_strength_value_0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#drive_strength_value_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength_value_1(SystemVerilogParser.Drive_strength_value_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#strength0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength0(SystemVerilogParser.Strength0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#strength1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength1(SystemVerilogParser.Strength1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#highz0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighz0(SystemVerilogParser.Highz0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#highz1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighz1(SystemVerilogParser.Highz1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharge_strength(SystemVerilogParser.Charge_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#charge_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharge_size(SystemVerilogParser.Charge_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_descriptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_descriptions(SystemVerilogParser.List_of_variable_descriptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_variable_description_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_variable_description_star(SystemVerilogParser.Comma_variable_description_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_variable_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_variable_description(SystemVerilogParser.Comma_variable_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_description(SystemVerilogParser.Variable_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier(SystemVerilogParser.Variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_hierarchical_variable_descriptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_hierarchical_variable_descriptions(SystemVerilogParser.List_of_hierarchical_variable_descriptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_hierarchical_variable_description_star(SystemVerilogParser.Comma_hierarchical_variable_description_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_hierarchical_variable_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_hierarchical_variable_description(SystemVerilogParser.Comma_hierarchical_variable_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_description(SystemVerilogParser.Hierarchical_variable_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_identifier(SystemVerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_declaration(SystemVerilogParser.Net_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_declaration(SystemVerilogParser.Reg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#logic_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_declaration(SystemVerilogParser.Logic_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bits_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBits_type(SystemVerilogParser.Bits_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#bits_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBits_declaration(SystemVerilogParser.Bits_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_declaration(SystemVerilogParser.Integer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(SystemVerilogParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_declaration(SystemVerilogParser.Real_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_declaration(SystemVerilogParser.Time_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealtime_declaration(SystemVerilogParser.Realtime_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration(SystemVerilogParser.Event_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_declaration(SystemVerilogParser.Genvar_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#usertype_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsertype_variable_declaration(SystemVerilogParser.Usertype_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(SystemVerilogParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(SystemVerilogParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(SystemVerilogParser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(SystemVerilogParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(SystemVerilogParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(SystemVerilogParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_interface(SystemVerilogParser.Function_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_item_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_item_declaration_star(SystemVerilogParser.Function_item_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_item_declaration_semicolon(SystemVerilogParser.Function_item_declaration_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_item_declaration(SystemVerilogParser.Function_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(SystemVerilogParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#colon_function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_function_identifier(SystemVerilogParser.Colon_function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(SystemVerilogParser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_identifier(SystemVerilogParser.Task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_interface(SystemVerilogParser.Task_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item_declaration_semicolon(SystemVerilogParser.Task_item_declaration_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item_declaration(SystemVerilogParser.Task_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_item_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item_declaration_star(SystemVerilogParser.Task_item_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_statement(SystemVerilogParser.Task_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_item_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_item_semicolon(SystemVerilogParser.Struct_item_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_item_star(SystemVerilogParser.Struct_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_item(SystemVerilogParser.Struct_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(SystemVerilogParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_type(SystemVerilogParser.Enum_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_enum_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_enum_items(SystemVerilogParser.List_of_enum_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_item(SystemVerilogParser.Enum_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_identifier(SystemVerilogParser.Enum_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_enum_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_enum_item_star(SystemVerilogParser.Comma_enum_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_enum_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_enum_item(SystemVerilogParser.Comma_enum_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enumerated_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerated_type(SystemVerilogParser.Enumerated_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(SystemVerilogParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parameter_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_interface_assignments(SystemVerilogParser.Parameter_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_interface_assignments(SystemVerilogParser.List_of_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_ordered_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ordered_interface_assignments(SystemVerilogParser.List_of_ordered_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_ordered_interface_assignment_star(SystemVerilogParser.Comma_ordered_interface_assignment_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_ordered_interface_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_ordered_interface_assignment(SystemVerilogParser.Comma_ordered_interface_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ordered_interface_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_interface_assignment(SystemVerilogParser.Ordered_interface_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_named_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_named_interface_assignments(SystemVerilogParser.List_of_named_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_named_interface_assignment_star(SystemVerilogParser.Comma_named_interface_assignment_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_named_interface_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_named_interface_assignment(SystemVerilogParser.Comma_named_interface_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#named_interface_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_interface_assignment(SystemVerilogParser.Named_interface_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_module_instances}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_module_instances(SystemVerilogParser.List_of_module_instancesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_module_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_module_instance_star(SystemVerilogParser.Comma_module_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_module_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_module_instance(SystemVerilogParser.Comma_module_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instance(SystemVerilogParser.Module_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#module_instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instance_identifier(SystemVerilogParser.Module_instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayed_identifier(SystemVerilogParser.Arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_arrayed_identifier(SystemVerilogParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_arrayed_identifier(SystemVerilogParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#port_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_interface_assignments(SystemVerilogParser.Port_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay(SystemVerilogParser.DelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_delay_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_delay_values(SystemVerilogParser.List_of_delay_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_delay_value_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_delay_value_star(SystemVerilogParser.Comma_delay_value_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_delay_value(SystemVerilogParser.Comma_delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_value(SystemVerilogParser.Delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulldown_strength(SystemVerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullup_strength(SystemVerilogParser.Pullup_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#gate_instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instance_identifier(SystemVerilogParser.Gate_instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instantiation(SystemVerilogParser.Gate_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gatetype(SystemVerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switchtype(SystemVerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switchtype(SystemVerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gatetype(SystemVerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gatetype(SystemVerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switchtype(SystemVerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_enable_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_switchtype(SystemVerilogParser.Pass_enable_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pulldown_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulldown_instantiation(SystemVerilogParser.Pulldown_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pullup_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullup_instantiation(SystemVerilogParser.Pullup_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_instantiation(SystemVerilogParser.Enable_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_instantiation(SystemVerilogParser.Mos_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_instantiation(SystemVerilogParser.Cmos_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_instantiation(SystemVerilogParser.N_output_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_instantiation(SystemVerilogParser.N_input_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_instantiation(SystemVerilogParser.Pass_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_enable_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_instantiation(SystemVerilogParser.Pass_enable_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_pull_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_pull_gate_instance(SystemVerilogParser.List_of_pull_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_enable_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_enable_gate_instance(SystemVerilogParser.List_of_enable_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_mos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_mos_switch_instance(SystemVerilogParser.List_of_mos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_cmos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_cmos_switch_instance(SystemVerilogParser.List_of_cmos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_n_input_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_n_input_gate_instance(SystemVerilogParser.List_of_n_input_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_n_output_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_n_output_gate_instance(SystemVerilogParser.List_of_n_output_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_pass_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_pass_switch_instance(SystemVerilogParser.List_of_pass_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_pass_enable_switch_instance(SystemVerilogParser.List_of_pass_enable_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pull_gate_instance_star(SystemVerilogParser.Comma_pull_gate_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_enable_gate_instance_star(SystemVerilogParser.Comma_enable_gate_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_mos_switch_instance_star(SystemVerilogParser.Comma_mos_switch_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_cmos_switch_instance_star(SystemVerilogParser.Comma_cmos_switch_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_n_input_gate_instance_star(SystemVerilogParser.Comma_n_input_gate_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_n_output_gate_instance_star(SystemVerilogParser.Comma_n_output_gate_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pass_switch_instance_star(SystemVerilogParser.Comma_pass_switch_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pass_enable_switch_instance_star(SystemVerilogParser.Comma_pass_enable_switch_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pull_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pull_gate_instance(SystemVerilogParser.Comma_pull_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_enable_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_enable_gate_instance(SystemVerilogParser.Comma_enable_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_mos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_mos_switch_instance(SystemVerilogParser.Comma_mos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_cmos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_cmos_switch_instance(SystemVerilogParser.Comma_cmos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_n_input_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_n_input_gate_instance(SystemVerilogParser.Comma_n_input_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_n_output_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_n_output_gate_instance(SystemVerilogParser.Comma_n_output_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pass_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pass_switch_instance(SystemVerilogParser.Comma_pass_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_pass_enable_switch_instance(SystemVerilogParser.Comma_pass_enable_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_gate_instance(SystemVerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gate_instance(SystemVerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switch_instance(SystemVerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switch_instance(SystemVerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gate_instance(SystemVerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gate_instance(SystemVerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switch_instance(SystemVerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_switch_instance(SystemVerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pull_gate_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_gate_interface(SystemVerilogParser.Pull_gate_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_gate_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gate_interface(SystemVerilogParser.Enable_gate_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mos_switch_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switch_interface(SystemVerilogParser.Mos_switch_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#cmos_switch_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switch_interface(SystemVerilogParser.Cmos_switch_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_input_gate_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gate_interface(SystemVerilogParser.N_input_gate_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#n_output_gate_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gate_interface(SystemVerilogParser.N_output_gate_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_switch_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switch_interface(SystemVerilogParser.Pass_switch_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pass_enable_switch_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_switch_interface(SystemVerilogParser.Pass_enable_switch_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_input_terminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_input_terminals(SystemVerilogParser.List_of_input_terminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_output_terminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_output_terminals(SystemVerilogParser.List_of_output_terminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_input_terminal_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_input_terminal_star(SystemVerilogParser.Comma_input_terminal_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_output_terminal_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_output_terminal_star(SystemVerilogParser.Comma_output_terminal_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_input_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_input_terminal(SystemVerilogParser.Comma_input_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_output_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_output_terminal(SystemVerilogParser.Comma_output_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_terminal(SystemVerilogParser.Enable_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_terminal(SystemVerilogParser.Input_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_terminal(SystemVerilogParser.Inout_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcontrol_terminal(SystemVerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_terminal(SystemVerilogParser.Output_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcontrol_terminal(SystemVerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_star(SystemVerilogParser.Statement_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_semicolon(SystemVerilogParser.Statement_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SystemVerilogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(SystemVerilogParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#flow_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_control_statement(SystemVerilogParser.Flow_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(SystemVerilogParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_call_statement(SystemVerilogParser.Task_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_statement(SystemVerilogParser.Event_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_statement(SystemVerilogParser.Procedural_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(SystemVerilogParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#subroutine_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_statement(SystemVerilogParser.Subroutine_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SystemVerilogParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(SystemVerilogParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_continuous_assignments(SystemVerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(SystemVerilogParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeassign_statement(SystemVerilogParser.Deassign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#force_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce_statement(SystemVerilogParser.Force_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#release_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_statement(SystemVerilogParser.Release_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_timing_control_statement(SystemVerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_statement(SystemVerilogParser.Property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#disable_condition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_condition_statement(SystemVerilogParser.Disable_condition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#property_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_expression(SystemVerilogParser.Property_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_assertion_statement(SystemVerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assert_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_else_statement(SystemVerilogParser.Assert_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_statement(SystemVerilogParser.Assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_task_enable(SystemVerilogParser.System_task_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_task_identifier(SystemVerilogParser.System_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_interface_assignments(SystemVerilogParser.Task_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#task_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_enable(SystemVerilogParser.Task_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_task_identifier(SystemVerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_statement(SystemVerilogParser.Disable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_block_identifier(SystemVerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_lvalue(SystemVerilogParser.Variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_lvalue(SystemVerilogParser.Hierarchical_variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_concatenation(SystemVerilogParser.Variable_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_concatenation_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_concatenation_value(SystemVerilogParser.Variable_concatenation_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_vcv_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_vcv_star(SystemVerilogParser.Comma_vcv_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocking_assignment(SystemVerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonblocking_assignment(SystemVerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#prefix_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_assignment(SystemVerilogParser.Prefix_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#postfix_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_assignment(SystemVerilogParser.Postfix_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_assignment(SystemVerilogParser.Operator_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#declarative_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarative_assignment(SystemVerilogParser.Declarative_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_or_event_control(SystemVerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#delay_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_control(SystemVerilogParser.Delay_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control(SystemVerilogParser.Event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_control_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control_identifier(SystemVerilogParser.Event_control_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_control_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control_expression(SystemVerilogParser.Event_control_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression(SystemVerilogParser.Event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#single_event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_event_expression(SystemVerilogParser.Single_event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_expression_edgespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression_edgespec(SystemVerilogParser.Event_expression_edgespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_expression_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression_or(SystemVerilogParser.Event_expression_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_event_expression_comma(SystemVerilogParser.List_of_event_expression_commaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_event_expression_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_event_expression_star(SystemVerilogParser.Comma_event_expression_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_event_expression(SystemVerilogParser.Comma_event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_event_expression_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_event_expression_or(SystemVerilogParser.List_of_event_expression_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#or_event_expression_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_event_expression_star(SystemVerilogParser.Or_event_expression_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#or_event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_event_expression(SystemVerilogParser.Or_event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_control_wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control_wildcard(SystemVerilogParser.Event_control_wildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#repeat_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_event_control(SystemVerilogParser.Repeat_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger(SystemVerilogParser.Event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_event_identifier(SystemVerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_identifier(SystemVerilogParser.Event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(SystemVerilogParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_generated_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_generated_instantiation(SystemVerilogParser.Attr_generated_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generated_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerated_instantiation(SystemVerilogParser.Generated_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item_star(SystemVerilogParser.Generate_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item(SystemVerilogParser.Generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block(SystemVerilogParser.Generate_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_colon_block_identifier0(SystemVerilogParser.Generate_colon_block_identifier0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_colon_block_identifier1(SystemVerilogParser.Generate_colon_block_identifier1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_colon_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_colon_block_identifier(SystemVerilogParser.Generate_colon_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block_identifier(SystemVerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_conditional_statement(SystemVerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_if_statement(SystemVerilogParser.Generate_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_else_statement(SystemVerilogParser.Generate_else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_loop_statement(SystemVerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_forever_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_forever_loop_statement(SystemVerilogParser.Generate_forever_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_repeat_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_repeat_loop_statement(SystemVerilogParser.Generate_repeat_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_while_loop_statement(SystemVerilogParser.Generate_while_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_do_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_do_loop_statement(SystemVerilogParser.Generate_do_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_for_loop_statement(SystemVerilogParser.Generate_for_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_case_statement(SystemVerilogParser.Generate_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_case_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_case_item_star(SystemVerilogParser.Generate_case_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_case_item(SystemVerilogParser.Generate_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(SystemVerilogParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SystemVerilogParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#elseif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_statement(SystemVerilogParser.Elseif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(SystemVerilogParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(SystemVerilogParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SystemVerilogParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#forever_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForever_loop_statement(SystemVerilogParser.Forever_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#repeat_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_loop_statement(SystemVerilogParser.Repeat_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop_statement(SystemVerilogParser.While_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#do_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop_statement(SystemVerilogParser.Do_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(SystemVerilogParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_init_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_init_assignment(SystemVerilogParser.Loop_init_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_terminate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_terminate_expression(SystemVerilogParser.Loop_terminate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#loop_step_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_step_assignment(SystemVerilogParser.Loop_step_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(SystemVerilogParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_star(SystemVerilogParser.Case_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item(SystemVerilogParser.Case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_switch(SystemVerilogParser.Case_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_key(SystemVerilogParser.Case_item_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#case_item_key_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_key_expression(SystemVerilogParser.Case_item_key_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_case_item_key_expression(SystemVerilogParser.Comma_case_item_key_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_case_item_key_expression_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_case_item_key_expression_star(SystemVerilogParser.Comma_case_item_key_expression_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SystemVerilogParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#single_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expression(SystemVerilogParser.Single_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_range(SystemVerilogParser.Primary_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SystemVerilogParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(SystemVerilogParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_post_assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_post_assign_expression(SystemVerilogParser.Unary_post_assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#unary_pre_assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_pre_assign_expression(SystemVerilogParser.Unary_pre_assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(SystemVerilogParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(SystemVerilogParser.Ternary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMintypmax_expression(SystemVerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#structured_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_value(SystemVerilogParser.Structured_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#arrayed_structured_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayed_structured_value(SystemVerilogParser.Arrayed_structured_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayed_structure_item(SystemVerilogParser.Arrayed_structure_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_arrayed_structure_item(SystemVerilogParser.Comma_arrayed_structure_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_arrayed_structure_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_arrayed_structure_item_star(SystemVerilogParser.Comma_arrayed_structure_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#arrayed_structure_item_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayed_structure_item_plus(SystemVerilogParser.Arrayed_structure_item_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type_cast(SystemVerilogParser.Variable_type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#width_type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_type_cast(SystemVerilogParser.Width_type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#sign_type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_type_cast(SystemVerilogParser.Sign_type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#null_type_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_type_cast(SystemVerilogParser.Null_type_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_type(SystemVerilogParser.Variable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_cast_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast_identifier(SystemVerilogParser.Type_cast_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#type_cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_cast_expression(SystemVerilogParser.Type_cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SystemVerilogParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_function_identifier(SystemVerilogParser.Hierarchical_function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#function_interface_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_interface_assignments(SystemVerilogParser.Function_interface_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function_call(SystemVerilogParser.System_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#system_function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function_identifier(SystemVerilogParser.System_function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_function_call(SystemVerilogParser.Constant_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#imported_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_function_call(SystemVerilogParser.Imported_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#imported_function_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_function_hierarchical_identifier(SystemVerilogParser.Imported_function_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_hierarchical_identifier(SystemVerilogParser.Primary_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#primary_imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_imported_hierarchical_identifier(SystemVerilogParser.Primary_imported_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#imported_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_hierarchical_identifier(SystemVerilogParser.Imported_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#parenthesis_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_expression(SystemVerilogParser.Parenthesis_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(SystemVerilogParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_concatenation(SystemVerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_expression_plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_expression_plus(SystemVerilogParser.Comma_expression_plusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_expression_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_expression_star(SystemVerilogParser.Comma_expression_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#typedef_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_declaration(SystemVerilogParser.Typedef_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#typedef_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_identifier(SystemVerilogParser.Typedef_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#typedef_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_definition(SystemVerilogParser.Typedef_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#typedef_definition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_definition_type(SystemVerilogParser.Typedef_definition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#complex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_type(SystemVerilogParser.Complex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#typedef_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_type(SystemVerilogParser.Typedef_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#par_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_block(SystemVerilogParser.Par_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#seq_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_block(SystemVerilogParser.Seq_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_identifier(SystemVerilogParser.Block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#colon_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_block_identifier(SystemVerilogParser.Colon_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_item_declaration_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration_star(SystemVerilogParser.Block_item_declaration_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_item_declaration_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration_semicolon(SystemVerilogParser.Block_item_declaration_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration(SystemVerilogParser.Block_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_keyword(SystemVerilogParser.Join_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuous_assign(SystemVerilogParser.Continuous_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_assignments(SystemVerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_variable_assignment_star(SystemVerilogParser.Comma_variable_assignment_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#comma_variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_variable_assignment(SystemVerilogParser.Comma_variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(SystemVerilogParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_construct(SystemVerilogParser.Initial_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#final_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_construct(SystemVerilogParser.Final_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_keyword(SystemVerilogParser.Always_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#always_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_construct(SystemVerilogParser.Always_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attribute_instance_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance_star(SystemVerilogParser.Attribute_instance_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance(SystemVerilogParser.Attribute_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_spec_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec_star(SystemVerilogParser.Attr_spec_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(SystemVerilogParser.Attr_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(SystemVerilogParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SystemVerilogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier(SystemVerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item_star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_hierarchical_identifier_branch_item_star(SystemVerilogParser.Dot_hierarchical_identifier_branch_item_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#dot_hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_hierarchical_identifier_branch_item(SystemVerilogParser.Dot_hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#hierarchical_identifier_branch_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier_branch_item(SystemVerilogParser.Hierarchical_identifier_branch_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timescale_compiler_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_compiler_directive(SystemVerilogParser.Timescale_compiler_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timeunit_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeunit_directive(SystemVerilogParser.Timeunit_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#timeprecision_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeprecision_directive(SystemVerilogParser.Timeprecision_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#default_nettype_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_nettype_statement(SystemVerilogParser.Default_nettype_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SystemVerilogParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#integral_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_number(SystemVerilogParser.Integral_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SystemVerilogParser#real_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_number(SystemVerilogParser.Real_numberContext ctx);
}