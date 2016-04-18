package cn.design.pattern2016032013OpenClosedPrinciple;

public class RealCar implements Car{

	private String carName;
	
	public RealCar() {
		super();
	}

	public RealCar(String carName) {
		super();
		this.carName = carName;
	}

	@Override
	public String getCarName() {
		return carName;
	}

}
