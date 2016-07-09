package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;

public abstract class Expression {

	public abstract int interpreter(HashMap<String, Integer> var);
}
