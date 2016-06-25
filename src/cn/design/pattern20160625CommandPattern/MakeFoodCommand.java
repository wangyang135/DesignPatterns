package cn.design.pattern20160625CommandPattern;

public class MakeFoodCommand extends Command {

	@Override
	public void executeBossCommand() {
		this.woman.makeFood();
	}
	
}
