package cn.design.pattern20160629VisitorPattern;

public class WY implements Vistor {

	@Override
	public void vist(Animal animal) {
		animal.eatFood();
	}

	
}
