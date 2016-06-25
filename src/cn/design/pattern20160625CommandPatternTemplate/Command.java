package cn.design.pattern20160625CommandPatternTemplate;

public abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
