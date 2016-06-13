package cn.design.pattern20160613StatePatternTrafficLight;

public class GreenLight extends State {

	@Override
	public void pass() {
		System.out.println("通过路口");
	}

	@Override
	public void stop() {
		// 不需要
	}

	@Override
	public void waiting() {
		// 不需要
	}
	
	
}
