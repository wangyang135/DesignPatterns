package cn.design.pattern20160625CommandPattern;

public class FeedHorseCommand extends Command {

	@Override
	public void executeBossCommand() {
		this.man.feedHorse();
	}
	
}
