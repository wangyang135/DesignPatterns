package cn.design.pattern2016032102SimpleFactoryPattern;

public class HongQi implements Car{

	@Override
	public void setCarName(String carName) {
		System.out.println("汽车名称：" + carName);
	}

	@Override
	public void setCarColor(String color) {
		System.out.println("汽车名称：" + color);
	}

}
