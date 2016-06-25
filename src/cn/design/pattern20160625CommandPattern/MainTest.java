package cn.design.pattern20160625CommandPattern;

public class MainTest {

	public static void main(String[] args) {
		Boss boss = new Boss();
		Command command1 = new ChoppingCommand();
		boss.setCommand(command1);
		boss.executeCommand();
		
		Command command2 = new MakeFoodCommand();
		boss.setCommand(command2);
		boss.executeCommand();
	}
}
