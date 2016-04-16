package cn.design.pattern2016032007DependenceInversionPrinciple;

public class SniperRifle implements Gun{

	@Override
	public void shoot() {
		System.out.println("SniperRefle Fire!!");
	}
}
