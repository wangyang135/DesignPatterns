package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// 左右两个表达式的值相加
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
