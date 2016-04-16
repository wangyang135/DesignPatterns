package cn.design.pattern2016032003SingleResponsibility;

public class CarActionImpl implements CarAction{

	private Car car;
	
	public CarActionImpl(Car car){
		this.car = car;
	}
	
	@Override
	public void startUp() {
		System.out.println("启动>>" + car.getCarName());
	}

	@Override
	public void run() {
		System.out.println("行驶");
	}

	@Override
	public void stop() {
		System.out.println("停止>>" + car.getCarName());
	}
}
