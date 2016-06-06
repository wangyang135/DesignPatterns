package cn.design.pattern20160606TemplateMethodPattern;

public class HongQiCar extends Car{

	@Override
	public void startUp() {
		System.out.println("HongQiCar 启动！");
	}

	@Override
	public void run() {
		System.out.println("HongQiCar 跑起来！");
	}

	@Override
	public void stop() {
		System.out.println("HongQiCar 停止！");
	}

}
