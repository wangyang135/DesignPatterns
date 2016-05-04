package cn.design.pattern20160504BuilderPattern2;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		List<String> orderList = new ArrayList<String>();
		orderList.add("startUp");
		orderList.add("run");
		orderList.add("stop");
		
		HongQiCar hongQi = new HongQiCar();
		hongQi.setOrder(orderList);
		hongQi.templateMethod();
	}
}
