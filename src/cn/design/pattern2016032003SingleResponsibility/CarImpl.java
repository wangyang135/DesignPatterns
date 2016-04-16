package cn.design.pattern2016032003SingleResponsibility;

public class CarImpl implements Car{

	private String carName;
	private String carColor;
	
	@Override
	public void setCarName(String carName) {
		this.carName = carName;
		System.out.println("名称：" + carName);
	}

	@Override
	public void setCarColor(String carColoe) {
		this.carColor = carColoe;
		System.out.println("颜色：" + carColoe);
	}

	@Override
	public String getCarName() {
		return this.carName;
	}

	@Override
	public String getCarColor() {
		return this.carColor;
	}

}
