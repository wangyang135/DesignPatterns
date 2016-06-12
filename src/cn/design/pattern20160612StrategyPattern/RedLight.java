package cn.design.pattern20160612StrategyPattern;

public class RedLight implements TrafficLight {

	@Override
	public void checkLight() {
		System.out.println("停");
	}
	
}
