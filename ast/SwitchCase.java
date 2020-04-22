package ast;

import java.util.*;

public class SwitchCase extends Expression {

    private Identifier variable;
	private List<Expression> elseExpr = new ArrayList<Expression>();
    private Map<Expression,List<Expression>> map=new HashMap<Expression,List<Expression>>(); 

    public SwitchCase(String var) {
        this.variable = new Identifier(var);
    }

    public void addCase(Expression constEx) {
		this.map.put(constEx, new ArrayList<Expression>());
	}

	public void addDoExpression(Expression key, Expression exp) {
		map.get(key).add(exp);
	}
	
	public void addElseExpression(Expression expr) {
		elseExpr.add(expr);
	}

    public double evaluate() {
        for (Map.Entry<Expression, List<Expression>> entry : map.entrySet()) {
            if(variable.evaluate() == entry.getKey().evaluate()){
                for(Expression expr : entry.getValue())
                        expr.evaluate();

                    return 0;
                }
        }
        
        for (Expression expr : elseExpr) 
            expr.evaluate();

		return 0;
    }
}