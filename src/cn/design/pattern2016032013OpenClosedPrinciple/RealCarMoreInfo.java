package cn.design.pattern2016032013OpenClosedPrinciple;

public class RealCarMoreInfo extends RealCar{

	private String color;

	public RealCarMoreInfo() {
		super();
	}

	public RealCarMoreInfo(String carName, String color) {
		super(carName);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
