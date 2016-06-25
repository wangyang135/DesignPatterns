package cn.design.pattern20160625CommandPattern1;

public class MainTest {

	public static void main(String[] args) {
		Boss boss = new Boss();
		ManCommand manCommand = new ManCommand();
		boss.setCommand(manCommand);
		boss.executeCommand();
		
		WomanCommand womanCommand = new WomanCommand();
		boss.setCommand(womanCommand);
		boss.executeCommand();
	}
}
