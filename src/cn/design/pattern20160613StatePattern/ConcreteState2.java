package cn.design.pattern20160613StatePattern;

public class ConcreteState2 extends State {

	@Override
	public void behave1() {
		super.context.setCurrentState(Context.STATE1);
		super.context.behave1();
	}

	@Override
	public void behave2() {
		System.out.println("状态2");
	}

}
