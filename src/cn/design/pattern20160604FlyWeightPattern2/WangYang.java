package cn.design.pattern20160604FlyWeightPattern2;

import java.util.Date;

public class WangYang {

	public void gotoSchool(){
		Bus bus = BusFactory.getBus(new Date());
		System.out.println(bus);
	}
	
}
