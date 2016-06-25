package cn.design.pattern20160625CommandPatternTemplate;

public class Test {

	public static void main(String[] args) {
		// 调用者
		Invoker invoker = new Invoker();
		
		// 接收者
		Receiver receiver = new Receiver1();
		
		// 命令角色
		Command command = new Command1(receiver);
		
		invoker.setCommand(command);
		invoker.action();
	}
}
