package cn.design.pattern20160524BridgePattern;

public class HongQICompany implements CompanyImplementor {

	@Override
	public void produceCar() {
		System.out.println("生产汽车");
	}

	@Override
	public void sellCar() {
		System.out.println("出售汽车");
	}

	
}
