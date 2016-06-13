package cn.design.pattern20160613StatePatternTrafficLight;

public class Context {

	public final static State REDLIGHT = new RedLight();
	public final static State GREENLIGHT = new GreenLight();
	public final static State YELLOWLIGHT = new YellowLight();
	
	// 当前状态
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}
	
	public void pass() {
		this.currentState.pass();
	}
	
	public void stop() {
		this.currentState.stop();
	}
	
	public void waiting() {
		this.currentState.waiting();
	}
	
	
}
