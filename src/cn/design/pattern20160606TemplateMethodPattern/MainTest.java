package cn.design.pattern20160606TemplateMethodPattern;

public class MainTest {

	public static void main(String[] args) {
		HongQiCar hongQiCar = new HongQiCar();
		BYDCar byd = new BYDCar();
		hongQiCar.templateMethod();
		byd.templateMethod();
	}
}
