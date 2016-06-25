package cn.design.pattern20160625CommandPattern1;

public class ManCommand extends Command{

	/**
	 * 让男人干点劈柴喂马的事
	 */
	@Override
	public void executeBossCommand() {
		this.man.chopping();
		this.man.feedHorse();
	}

}
