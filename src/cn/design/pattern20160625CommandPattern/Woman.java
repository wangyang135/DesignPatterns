package cn.design.pattern20160625CommandPattern;

public class Woman implements Person{

	@Override
	public void chopping() {
		System.out.println("Woman --- chopping");
	}

	@Override
	public void makeFood() {
		System.out.println("Woman --- makeFood");
	}

	@Override
	public void feedHorse() {
		System.out.println("Woman --- feedHorse");
	}

	@Override
	public void travelWorld() {
		System.out.println("Woman --- travelWorld");
	}


}
