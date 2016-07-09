package cn.design.pattern20160709InterpreterPattern;

public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;
	
	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
