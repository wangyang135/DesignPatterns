package cn.design.pattern2016032001SingleResponsibility;

public class CarImpl implements Car {

	@Override
	public void setCarName(String carName) {
		System.out.println("名称：" + carName);
	}

	@Override
	public void setCarColor(String carColoe) {
		System.out.println("颜色：" + carColoe);
	}

	@Override
	public void startUp() {
		System.out.println("启动");
	}

	@Override
	public void run() {
		System.out.println("行驶");
	}

	@Override
	public void stop() {
		System.out.println("停止");
	}

}
