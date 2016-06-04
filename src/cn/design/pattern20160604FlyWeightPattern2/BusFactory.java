package cn.design.pattern20160604FlyWeightPattern2;

import java.util.Date;
import java.util.HashMap;

public class BusFactory {

	private static HashMap<String, Bus> busPool = new HashMap<String, Bus>();
	
	static {
		busPool.put("10588:00SH100002", new Bus("1058", "8:00", "SH100002"));
		busPool.put("10589:00SH100003", new Bus("1058", "9:00", "SH100003"));
		busPool.put("105810:00SH100002", new Bus("1058", "10:00", "SH100002"));
		busPool.put("105811:00SH100003", new Bus("1058", "11:00", "SH100003"));
		busPool.put("105812:00SH100002", new Bus("1058", "12:00", "SH100002"));
	}
	
	public static Bus getBus(Date date){
		Bus bus = null;
		String driverId = null;
		String dateTime = null;
		
		// 下面这一段进行判断乘客在获取(date)的时候属于哪一个车次以及其信息
		// 假设1058路公交车,这里只模拟一下,这里应该是需要数据库进行查询的
		if(! date.after(new Date(new Date().getTime() + 10000))){
			driverId = "SH100002";
			dateTime = "8:00";
		}
		// 合并该车次的基本信息作为唯一标识
		String key = "1058" + dateTime + driverId;
		
		// 如果对象池中存在的话
		if(!busPool.containsKey(key)){
			// 其实这里可以更加简化的，也可以只用key构造bus对象
			bus = new Bus("1058", dateTime, driverId);
			busPool.put(key, bus);
			System.out.println("新增车次");
		}
		// 如果不存在
		else{
			System.out.println("从pool中获取");
			bus = busPool.get(key);
		}
		return bus;
	}
}
