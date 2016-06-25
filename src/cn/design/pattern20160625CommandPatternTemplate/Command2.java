package cn.design.pattern20160625CommandPatternTemplate;

public class Command2 extends Command {

	public Command2(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		this.receiver.doSomthing();
	}

}
