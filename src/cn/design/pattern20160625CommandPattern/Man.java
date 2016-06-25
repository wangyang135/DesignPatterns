package cn.design.pattern20160625CommandPattern;

public class Man implements Person{

	@Override
	public void chopping() {
		System.out.println("Man --- chopping");
	}

	@Override
	public void makeFood() {
		System.out.println("Man --- makeFood");
	}

	@Override
	public void feedHorse() {
		System.out.println("Man --- feedHorse");
	}

	@Override
	public void travelWorld() {
		System.out.println("Man --- travelWorld");
	}

}
