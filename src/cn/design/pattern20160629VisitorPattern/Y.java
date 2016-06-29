package cn.design.pattern20160629VisitorPattern;

public class Y extends Animal {

	@Override
	public void eatFood() {
		System.out.println("Y...Eat Food!");
	}

	@Override
	public void accept(Vistor vistor) {
		vistor.vist(this);
	}


}
