package cn.design.pattern2016032104AbstractFactoryPattern;

public class SecondGenerFactory extends AbstractCarFactory{

	@Override
	public HongQI createHongQiCar() {
		
		return new HongQiSecondGenerCar();
	}

	@Override
	public BYD createBYDCar() {
		return new BYDSecondGenerCar();
	}

}
