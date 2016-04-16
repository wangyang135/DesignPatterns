package cn.design.pattern2016032007DependenceInversionPrinciple;

public class WYSoldier implements Soldier{

	@Override
	public void fireEnermy(Gun gun) {
		gun.shoot();
	}
}
