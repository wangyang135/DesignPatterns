package cn.design.pattern20160625CommandPattern;

public class ChoppingCommand extends Command {

	@Override
	public void executeBossCommand() {
		this.man.chopping();
	}
	
}
