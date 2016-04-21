package cn.design.pattern2016032103FactoryMethodPattern;


public class MainTest {

	public static void main(String[] args) {
		Factory bydFactory = new BYDFactory();
		Car byd = bydFactory.createCar();
		byd.setCarName("BYD1系");
		byd.setCarColor("Red!");
		
		Factory hongQiFactory = new HongQiFactory();
		Car hongQi = hongQiFactory.createCar();
		hongQi.setCarName("HongQi1系");
		hongQi.setCarColor("black!");
	}
}
