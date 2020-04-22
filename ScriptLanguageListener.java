// Generated from ScriptLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptLanguageParser}.
 */
public interface ScriptLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ScriptLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ScriptLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ScriptLanguageParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ScriptLanguageParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#controlStructures}.
	 * @param ctx the parse tree
	 */
	void enterControlStructures(ScriptLanguageParser.ControlStructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#controlStructures}.
	 * @param ctx the parse tree
	 */
	void exitControlStructures(ScriptLanguageParser.ControlStructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ScriptLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ScriptLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ScriptLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ScriptLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ScriptLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ScriptLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#shortIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortIfStatement(ScriptLanguageParser.ShortIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#shortIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortIfStatement(ScriptLanguageParser.ShortIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#switchCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseStatement(ScriptLanguageParser.SwitchCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#switchCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseStatement(ScriptLanguageParser.SwitchCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ScriptLanguageParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ScriptLanguageParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ScriptLanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ScriptLanguageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ScriptLanguageParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ScriptLanguageParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(ScriptLanguageParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(ScriptLanguageParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(ScriptLanguageParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(ScriptLanguageParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptLanguageParser#fct}.
	 * @param ctx the parse tree
	 */
	void enterFct(ScriptLanguageParser.FctContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptLanguageParser#fct}.
	 * @param ctx the parse tree
	 */
	void exitFct(ScriptLanguageParser.FctContext ctx);
}