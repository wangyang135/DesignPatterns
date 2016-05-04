package cn.design.pattern20160504BuilderPattern2;

import java.util.List;

public abstract class CarBuilder {

	public abstract void setOrder(List<String> orderList);
	public abstract Car getCar();
	
}
