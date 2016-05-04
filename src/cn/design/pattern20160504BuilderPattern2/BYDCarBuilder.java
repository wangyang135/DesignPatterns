package cn.design.pattern20160504BuilderPattern2;

import java.util.List;

public class BYDCarBuilder extends CarBuilder{

	private BYDCar bydCar = new BYDCar();
	
	@Override
	public void setOrder(List<String> orderList) {
		this.bydCar.setOrder(orderList);
	}

	@Override
	public Car getCar() {
		
		return this.bydCar;
	}

}
