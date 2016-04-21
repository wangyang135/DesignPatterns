package cn.design.pattern2016032103FactoryMethodPattern;

public class BYDFactory implements Factory{

	@Override
	public Car createCar() {
		return new BYD();
	}

}
