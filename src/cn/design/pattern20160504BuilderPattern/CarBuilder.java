package cn.design.pattern20160504BuilderPattern;

public abstract class CarBuilder {

	protected Car car = new Car();
	
	public abstract void setShape(String shape);
	
	public abstract void setAssemble(String assemble);
	
	public abstract void setColor(String color);
	
	public Car getCar(){
		return this.car;
	}
}
