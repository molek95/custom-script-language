package ast;

import java.util.List;
import java.util.ArrayList;

public class While extends Expression {

    private Expression booleanExpr;
	private List<Expression> doExpr = new ArrayList<Expression>();

    public While(Expression b) {
        this.booleanExpr = b;
    }

	public void addExpression(Expression expr) {
		doExpr.add(expr);
	}
	
	public double evaluate() {
		while (booleanExpr.evaluate() != 0) {
			for (Expression a : doExpr)
				a.evaluate();
		}
		return 0;
	}
}