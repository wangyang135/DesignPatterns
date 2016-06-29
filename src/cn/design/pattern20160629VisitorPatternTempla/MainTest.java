package cn.design.pattern20160629VisitorPatternTempla;

public class MainTest {

	public static void main(String[] args) {
		
		Element y = new ConcreteEle1();
		Element x = new ConcreteEle2();
		
		Vistor vistor = new ConcreteVistor1();
		y.accept(vistor);
		
		x.accept(vistor);
	}
}
