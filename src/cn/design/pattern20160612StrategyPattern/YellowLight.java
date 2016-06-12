package cn.design.pattern20160612StrategyPattern;

public class YellowLight implements TrafficLight {

	@Override
	public void checkLight() {
		System.out.println("等一等");
	}
	
}
