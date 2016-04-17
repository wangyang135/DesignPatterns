package cn.design.pattern2016032009InterfaceSegregationPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Dog
 * @Description 对于狗来说，他具有的特性是eatFood和run
 * @author wy
 * @date 2016-4-17
 *
 */
public class Dog implements DogInter{

	@Override
	public void eatFood() {
		System.out.println("Dog 吃狗粮！");
	}

	@Override
	public void run() {
		System.out.println("Dog 逮老鼠！");
	}
}
