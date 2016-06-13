package cn.design.pattern20160613StatePattern;

public class ConcreteState1 extends State {

	@Override
	public void behave1() {
		System.out.println("状态1");
	}

	@Override
	public void behave2() {
		super.context.setCurrentState(Context.STATE2);
		super.context.behave2();
	}

	
}
