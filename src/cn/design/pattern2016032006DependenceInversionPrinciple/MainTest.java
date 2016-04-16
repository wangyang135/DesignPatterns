package cn.design.pattern2016032006DependenceInversionPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName MainTest
 * @Description 
 * 本例为展示违背了依赖倒置原则后导致的设计的不稳定性。
 * 
 * 1. 玩过CS的都知道，开始的时候需要自己选择用什么枪，那么这里先举这样的一个
 * 例子，一个士兵用AK47这个枪，遇到敌人的时候开枪射击，然后Game over !
 * 
 * 2. 如果这个士兵一直使用AK47的话不需要更改什么（"需求"不变），但是当某一天
 * 他觉得这个不好用，想换一个玩法，你会发现，这个设计太糟糕了，需要去手动的改
 * 变Soldier这个类中的具体方法，在士兵与这个AK枪之间是强耦合关系，这样降
 * 低了系统的可维护性。
 * 
 * CSDN博客：http://blog.csdn.net/wangyang1354/article/details/51167071
 * 
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Soldier soldier = new Soldier();
		AK47Gun akGun = new AK47Gun();
		soldier.fireEnermy(akGun);
	}
}
