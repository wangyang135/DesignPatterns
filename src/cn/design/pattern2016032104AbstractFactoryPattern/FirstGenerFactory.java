package cn.design.pattern2016032104AbstractFactoryPattern;

public class FirstGenerFactory extends AbstractCarFactory{

	@Override
	public HongQI createHongQiCar() {
		
		return new HongQiFirstGenerCar();
	}

	@Override
	public BYD createBYDCar() {
		return new BYDFirstGenerCar();
	}

}
