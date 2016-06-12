package cn.design.pattern20160612StrategyPattern;

public class GreenLight implements TrafficLight {

	@Override
	public void checkLight() {
		System.out.println("行");
	}
	
}
