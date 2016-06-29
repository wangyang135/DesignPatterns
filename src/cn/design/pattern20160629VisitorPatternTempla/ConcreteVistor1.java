package cn.design.pattern20160629VisitorPatternTempla;

public class ConcreteVistor1 implements Vistor {

	@Override
	public void vist(Element ele) {
		ele.doSomething();
	}
	
}
