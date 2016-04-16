package cn.design.pattern2016032003SingleResponsibility;
/**
 * 
 * @ProjectName DesignPatterns
 * @ClassName MainTest
 * @Description 
 * 本例根据自己的想法进行行为的划分，将不同的行为分到不同的接口中，
 * 不过类与类之间的耦合较大。不过较好的展示了单一职责模式这个原则。
 * CSDN:http://blog.csdn.net/wangyang1354/article/details/51136530
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Car car = new CarImpl();
		CarAction carAction = new CarActionImpl(car);
		CarOperate carOper = new CarOperate(car, carAction);
		/**
		 * 如果在Action中需要得到Car中的属性可以通过构造函数进行设置
		 */
		carOper.getCar().setCarColor("Black");
		carOper.getCar().setCarName("HongQI");
		
		carOper.getCarAction().startUp();
		carOper.getCarAction().stop();
	}
}
