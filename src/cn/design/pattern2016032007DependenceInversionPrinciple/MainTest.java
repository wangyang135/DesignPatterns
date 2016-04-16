package cn.design.pattern2016032007DependenceInversionPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName MainTest
 * @Description 
 * 
 * 针对前面的反例，我们在这里进行了一个改进，
 * 1. 抽象出士兵和枪的接口，通过接口使得两者之间发生耦合，而不是具体实现细节之间发生。
 * 2. 低层的细节都依赖于上层的接口。
 * 
 * 这里士兵和枪抽象为接口，让其细节都实现这两个接口，接口与接口之间进行耦合，这样才能保证
 * 设计的稳定性。后面在提出需求的时候：我想换一个狙击步枪玩玩。那么我们只需要重新定义个狙
 * 击步枪的类实现Gun这个接口并实现其方法，这样在使用的时候直接将狙击步枪的实例交给WYSoldier
 * 就可以了。这个需求变更的过程中，我们改变了哪些？
 * 
 * 1. 创建了一个SniperRifle类。
 * 2. 在使用的地方创建一个SniperRifle的实例，交给实际的士兵对象去调用。
 * 
 * 从这几步你会发现，我们没有改变，WYSoldier这个实现“细节”类，也没有改变AK47Gun这个
 * 实现细节类。从测试的角度去看，也就是说，不再需要考虑之前士兵使用AK47Gun还可不可用的问题，
 * 因为在之前这个是经过了你的严格测试的。
 * 
 * CSDN博客：http://blog.csdn.net/wangyang1354/article/details/51167071
 * 
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		// 士兵想要用AK， 好给你一个AK可以直接用了。
		Gun ak = new AK47Gun();
		Soldier wySoldier = new WYSoldier();
		wySoldier.fireEnermy(ak);
		
		// 士兵想要用狙击步枪， 好给你一个狙击步枪
		Gun sniper = new SniperRifle();
		wySoldier.fireEnermy(sniper);
		
	}
}
