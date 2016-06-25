package cn.design.pattern20160625CommandPattern;

public class TravelHorseCommand extends Command {

	@Override
	public void executeBossCommand() {
		this.woman.travelWorld();
	}
	
}
