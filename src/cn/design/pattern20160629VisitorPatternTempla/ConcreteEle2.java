package cn.design.pattern20160629VisitorPatternTempla;

public class ConcreteEle2 extends Element {

	@Override
	public void doSomething() {
		System.out.println("2...Eat Food!");
	}

	@Override
	public void accept(Vistor vistor) {
		vistor.vist(this);
	}


}
