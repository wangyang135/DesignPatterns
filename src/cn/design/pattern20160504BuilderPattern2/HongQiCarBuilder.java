package cn.design.pattern20160504BuilderPattern2;

import java.util.List;

public class HongQiCarBuilder extends CarBuilder{

	private HongQiCar hongQiCar = new HongQiCar();
	
	@Override
	public void setOrder(List<String> orderList) {
		this.hongQiCar.setOrder(orderList);
	}

	@Override
	public Car getCar() {
		
		return this.hongQiCar;
	}

}
