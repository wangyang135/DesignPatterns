package cn.design.pattern20160629VisitorPattern;

public class X extends Animal {

	@Override
	public void eatFood() {
		System.out.println("X...Eat Food!");
	}

	@Override
	public void accept(Vistor vistor) {
		vistor.vist(this);
	}

}
