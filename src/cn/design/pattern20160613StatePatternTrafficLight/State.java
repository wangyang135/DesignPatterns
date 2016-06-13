package cn.design.pattern20160613StatePatternTrafficLight;

public abstract class State {

	// 设置环境角色
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}
	
	public abstract void pass();
	
	public abstract void stop();
	
	public abstract void waiting();
	
}
