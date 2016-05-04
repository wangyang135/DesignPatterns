package cn.design.pattern20160504BuilderPattern2;

public class HongQiCar extends Car{

	@Override
	public void startUp() {
		System.out.println("红旗车启动");
	}

	@Override
	public void run() {
		System.out.println("红旗车行驶中");
		
	}

	@Override
	public void stop() {
		System.out.println("红旗车停止");
		
	}

}
