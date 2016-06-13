package cn.design.pattern20160613StatePattern;

public class Context {

	// 定义状态
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	// 当前状态
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	// 设置当前状态
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		currentState.setContext(this);
	}
	
	// 行为委托
	public void behave1(){
		this.currentState.behave1();
	}
	
	public void behave2(){
		this.currentState.behave2();
	}
}
