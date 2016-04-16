package cn.design.pattern2016032006DependenceInversionPrinciple;

public class Soldier {
	/** 向着敌人开火 */
	public void fireEnermy(AK47Gun ak){
		ak.shoot();
	}
}
