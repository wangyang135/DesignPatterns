package cn.design.pattern20160612StrategyPattern;

public class MainTest {

	public static void main(String[] args) {
		Context context = null;
		context = new Context(new RedLight());
		context.checkLight();
		
		context = new Context(new YellowLight());
		context.checkLight();
		
		context = new Context(new GreenLight());
		context.checkLight();
	}
}
