package cn.design.pattern20160625CommandPattern1;

public class WomanCommand extends Command{

	/**
	 * 让女人干点做饭和周游世界的事
	 */
	@Override
	public void executeBossCommand() {
		this.woman.makeFood();
		this.woman.travelWorld();
	}

}
