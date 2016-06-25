package cn.design.pattern20160625CommandPatternTemplate;

public class Invoker {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		this.command.execute();
	}
}
