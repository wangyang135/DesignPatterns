package cn.design.pattern20160625CommandPatternTemplate;

public class Command1 extends Command {

	public Command1(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		this.receiver.doSomthing();
	}

}
