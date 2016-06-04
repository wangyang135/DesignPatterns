package cn.design.pattern20160604FlyWeightPattern;

import java.util.HashMap;

public class SignUpFactory {

	private static HashMap<String, ExamRoom> pool = new HashMap<String, ExamRoom>();
	
	// 获取考场信息
	public static ExamRoom getExamRoomInfo(String key){
		
		ExamRoom room = null;
		
		if(!pool.containsKey(key)){
			room = new ExamRoom(key);
			pool.put(key, room);
			System.out.println("新建对象放入池中" + key);
		}else{
			room = pool.get(key);
			System.out.println("从pool中读取" + key);
		}
		return room;
	}
}
