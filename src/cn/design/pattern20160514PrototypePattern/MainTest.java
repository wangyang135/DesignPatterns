package cn.design.pattern20160514PrototypePattern;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Clothes cloth = new Clothes();
		cloth.setColor("Red");
		ArrayList<Clothes> clthList = new ArrayList<Clothes>();
		clthList.add(cloth);
		
		WangYang wy = new WangYang();
		wy.setAddress("SH");
		wy.setName("wy");
		wy.setClothesList(clthList);
		wy.setCloth(cloth);
		
		WangYang wangyang = wy.clone();
		
		System.out.println(wangyang == wy);
		System.out.println(wangyang.getClothesList() == wy.getClothesList());
		System.out.println(wangyang.getCloth() == wy.getCloth());
		System.out.println(wangyang);
	}
}
