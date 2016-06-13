package cn.design.pattern20160613StatePatternTrafficLight;

public class YellowLight extends State {

	@Override
	public void pass() {
		// 不需要
	}

	@Override
	public void stop() {
		System.out.println("停止");
	}

	@Override
	public void waiting() {
		System.out.println("黄灯等待");
		stop();
		try {
			new Thread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.context.setCurrentState(Context.GREENLIGHT);
		this.context.pass();
		
	}
	
	
}
