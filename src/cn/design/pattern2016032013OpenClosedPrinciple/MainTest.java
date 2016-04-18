package cn.design.pattern2016032013OpenClosedPrinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName MainTest
 * @Description 假如需求变更了，需要可以查看颜色，怎么办？去修改Car接口？
 * NO!!不要去修改，因为你怎么知道他在别的地方有没有被用到过，
 * 一个小的项目中或许你说你知道，但是一个大项目里面，你和别人
 * 共同在做这一块东西，那就不确定了吧，那么这里按照开放关闭原
 * 则改下设计。该例子对原实例进行适当更改，体会开放关闭原则。
 * @author wy
 * @date 2016-4-18
 *
 */
public class MainTest {

	private static List<RealCar> carList = new ArrayList<RealCar>();
	
	static {
		carList.add(new RealCar("HongQI"));
		carList.add(new RealCar("BYD"));
	}
	
	public static void main(String[] args) {
		for (RealCar car : carList) {
			System.out.println(car.getCarName());
		}
	}
}
