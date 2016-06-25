package cn.design.pattern20160625CommandPattern1;

public class Boss {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand(){
		this.command.executeBossCommand();
	}
}
