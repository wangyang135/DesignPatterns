package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// 把左右两个表达式的值相减
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
