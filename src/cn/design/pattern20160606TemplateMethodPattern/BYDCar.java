package cn.design.pattern20160606TemplateMethodPattern;

public class BYDCar extends Car{

	@Override
	public void startUp() {
		System.out.println("BYDCar 启动！");
	}

	@Override
	public void run() {
		System.out.println("BYDCar 跑起来！");
	}

	@Override
	public void stop() {
		System.out.println("BYDCar 停止！");
	}

}
