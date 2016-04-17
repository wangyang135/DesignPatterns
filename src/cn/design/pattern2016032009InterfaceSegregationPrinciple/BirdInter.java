package cn.design.pattern2016032009InterfaceSegregationPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Dog
 * @Description 对于小鸟来说，他具有的特性是eatFood和sing以及fly
 * @author wy
 * @date 2016-4-17
 *
 */
public interface BirdInter extends Common{

	public void sing();
	
	public void fly();

}
