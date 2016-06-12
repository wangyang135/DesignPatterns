package cn.design.pattern20160612StrategyPatternCalculator1;

public class Add implements Calculator {

	@Override
	public int cal(int a, int b) {
		
		return a + b;
	}

}
