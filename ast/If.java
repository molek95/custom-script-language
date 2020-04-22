package ast;

import java.util.List;
import java.util.ArrayList;

public class If extends Expression {

	private Expression booleanExpr;
	private List<Expression> doExpr = new ArrayList<Expression>();
	private List<Expression> elseExpr = new ArrayList<Expression>();
	
	public If(Expression b) {
		this.booleanExpr = b;
	}
	
	public void addDoExpression(Expression expr) {
		doExpr.add(expr);
	}
	
	public void addElseExpression(Expression expr) {
		elseExpr.add(expr);
	}
		
	public double evaluate() {
		if(booleanExpr.evaluate() != 0) {
			for (Expression expr : doExpr)
                 expr.evaluate();
		}
		else {
		    for (Expression expr : elseExpr)
                 expr.evaluate();
		}
		return 0;
	}

}