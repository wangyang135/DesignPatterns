package cn.design.pattern20160613StatePatternTrafficLight;

public class RedLight extends State {

	@Override
	public void pass() {
		// 不允许通过
	}

	@Override
	public void stop() {
		System.out.println("红灯停止");
		try {
			waiting();
			new Thread().sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.context.setCurrentState(Context.GREENLIGHT);
		super.context.pass();
	}

	@Override
	public void waiting() {
		System.out.println("等待1s钟");
	}
	
	
}
