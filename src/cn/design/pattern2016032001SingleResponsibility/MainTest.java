package cn.design.pattern2016032001SingleResponsibility;
/**
 * 
 * @ProjectName DesignPatterns
 * @ClassName MainTest
 * @Description 
 * 本例子为了展示我们将多种操作都封装在一个类中，违反了单一职责原则的情况
 * CSDN:http://blog.csdn.net/wangyang1354/article/details/51136530
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Car car = new CarImpl();
		car.setCarName("HongQi");
		car.setCarColor("Black");
		
		car.startUp();
		car.run();
		car.stop();
	}
}
