package cn.design.pattern20160612StrategyPatternCalculator2Enum;

public class MainTest {

	public static void main(String[] args) {
		Context context = new Context();
		
		context.cal(1, "+", 2);
		
		context.cal(1, "-", 2);
		
	}
}
