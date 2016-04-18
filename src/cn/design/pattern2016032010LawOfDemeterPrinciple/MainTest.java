package cn.design.pattern2016032010LawOfDemeterPrinciple;

public class MainTest {

	public static void main(String[] args) {
		Master master = new Master();
		Butler butler = new Butler();
		
		master.cookCommand(butler);
	}
}
