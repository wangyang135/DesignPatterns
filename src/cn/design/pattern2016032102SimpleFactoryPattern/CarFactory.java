package cn.design.pattern2016032102SimpleFactoryPattern;

public class CarFactory implements Factory{

	@Override
	public Car createCar(String carName) {
		Car car = null;
		if("HongQI".equals(carName)){
			car = new HongQi();
		}else if("BYD".equals(carName)){
			car = new BYD();
		}
		
		return car;
	}

}
