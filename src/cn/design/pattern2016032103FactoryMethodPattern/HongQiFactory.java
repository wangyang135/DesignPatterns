package cn.design.pattern2016032103FactoryMethodPattern;

public class HongQiFactory implements Factory{

	@Override
	public Car createCar() {
		
		return new HongQi();
	}

}
