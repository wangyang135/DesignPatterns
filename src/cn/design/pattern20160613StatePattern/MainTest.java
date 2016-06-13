package cn.design.pattern20160613StatePattern;

public class MainTest {

	public static void main(String[] args) {
		// 定义环境角色
		Context context = new Context();
		
		// 初始化状态
		context.setCurrentState(new ConcreteState1());
		
		// 执行行为
		context.behave1();
		context.behave2();
	}
}
