package cn.design.pattern2016032003SingleResponsibility;

public class CarOperate {

	private Car car ;
	private CarAction carAction ;
	
	public CarOperate(Car car, CarAction carAction){
		this.car = car;
		this.carAction = carAction;
	}

	public Car getCar() {
		return car;
	}

	public CarAction getCarAction() {
		return carAction;
	}
	
	
}
