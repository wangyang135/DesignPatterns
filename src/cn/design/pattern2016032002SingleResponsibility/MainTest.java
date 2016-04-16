package cn.design.pattern2016032002SingleResponsibility;

/**
 * 
 * @ProjectName DesignPatterns
 * @ClassName MainTest
 * @Description 
 * 本例为展示运用单一职责原则将不同的行为区分开来，实现职责的划分
 * CSDN:http://blog.csdn.net/wangyang1354/article/details/51136530
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		CarOperate car = new CarImpl();
		Car carSet = (Car) car;
		carSet.setCarName("HongQI");
		carSet.setCarColor("Black");
		
		CarAction carAction = (CarAction)car;
		carAction.startUp();
		carAction.run();
		carAction.stop();
	}
}
