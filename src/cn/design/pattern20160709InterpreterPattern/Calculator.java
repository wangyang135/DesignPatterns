package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	private Expression expression;
	
	public Calculator(String expStr) {
		
		Stack<Expression> stack = new Stack<Expression>();
		
		char[] charArray = expStr.toCharArray();
		
		Expression left = null;
		Expression right = null;
		
		for(int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
				case '+':
					// 加法，取出左侧的值，获取到右侧的值相加并将结果放到栈中保存
					left = stack.pop();
					right = new VarExpression(String.valueOf(charArray[++i]));
					stack.push(new AddExpression(left, right));
					
					break;
				case '-':
					// 减法，取出左侧的值，获取到右侧的值相减并将结果放到栈中保存
					left = stack.pop();
					right = new VarExpression(String.valueOf(charArray[++i]));
					stack.push(new SubExpression(left, right));
					
					break;
	
				default:
					// 数字直接保存到栈中
					stack.push(new VarExpression(String.valueOf(charArray[i])));
					break;
			}
		}
		this.expression = stack.pop();
		
	}
	
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}
}
