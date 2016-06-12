package cn.design.pattern20160612StrategyPattern;

public class Context {

	private TrafficLight light;

	public Context() {
		super();
	}

	public Context(TrafficLight light) {
		super();
		this.light = light;
	}
	
	public void checkLight(){
		this.light.checkLight();
	}
}
