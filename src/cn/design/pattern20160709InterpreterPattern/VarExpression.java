package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;

public class VarExpression extends Expression {

	private String key;
	
	public VarExpression(String key){
		this.key = key;
	}
	
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		
		int value = var.get(key);
		return value;
	}
}
