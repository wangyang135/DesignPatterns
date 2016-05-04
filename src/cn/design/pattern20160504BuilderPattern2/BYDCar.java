package cn.design.pattern20160504BuilderPattern2;

public class BYDCar extends Car{

	@Override
	public void startUp() {
		System.out.println("BYD启动");
	}

	@Override
	public void run() {
		System.out.println("BYD行驶中");
		
	}

	@Override
	public void stop() {
		System.out.println("BYD停止");
		
	}

}
