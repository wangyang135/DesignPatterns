package cn.design.pattern20160613StatePatternTrafficLight;

public class WY {

	public static void main(String[] args) {
		Context context = new Context();
		// 红灯
		context.setCurrentState(new RedLight());
		context.stop();
		System.out.println("==================");
		
		// 绿灯
		context.setCurrentState(new GreenLight());
		context.pass();
		
		System.out.println("==================");
		// 黄灯
		context.setCurrentState(new YellowLight());
		context.waiting();
	}
}
