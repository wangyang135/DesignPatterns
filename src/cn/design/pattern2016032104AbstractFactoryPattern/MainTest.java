package cn.design.pattern2016032104AbstractFactoryPattern;

public class MainTest {

	public static void main(String[] args) {
		
		FirstGenerFactory firstGenerFactory = new FirstGenerFactory();
		HongQI  hongQiFirstGener = firstGenerFactory.createHongQiCar();
		hongQiFirstGener.printCarName();
		
		BYD bydFirstGener = firstGenerFactory.createBYDCar();
		bydFirstGener.printCarName();
		
		SecondGenerFactory secondGenerFactory = new SecondGenerFactory();
		HongQI hongQiSecondGenerCar = secondGenerFactory.createHongQiCar();
		hongQiSecondGenerCar.printCarName();
		BYD bydSecondGenerCar = secondGenerFactory.createBYDCar();
		bydSecondGenerCar.printCarName();
	}
}
