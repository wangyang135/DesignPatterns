package cn.design.pattern20160612StrategyPatternCalculator1;

public class MainTest {

	public static void main(String[] args) {
		Context context = null;
		
		context = new Context(new Add());
		System.out.println(context.cal(1, 2));
		
		context = new Context(new Sub());
		System.out.println(context.cal(1, 2));
	}
}
