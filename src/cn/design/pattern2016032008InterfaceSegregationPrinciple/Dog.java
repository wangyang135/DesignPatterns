package cn.design.pattern2016032008InterfaceSegregationPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Dog
 * @Description 对于狗来说，他具有的特性是eatFood和run
 * @author wy
 * @date 2016-4-17
 *
 */
public class Dog implements Common{

	@Override
	public void eatFood() {
		System.out.println("Dog 吃狗粮！");
	}

	@Override
	public void run() {
		System.out.println("Dog 逮老鼠！");
	}

	// 下面这两个接口不是狗的特性不需要实现，这里注意体会下这样的一个架构的不合理性。
	@Override
	public void sing() {
		
	}

	@Override
	public void fly() {
		
	}

}
