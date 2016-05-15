package cn.design.pattern20160515AdapterPattern2;

import java.util.HashMap;
import java.util.Map;

public class UserInfoFrom implements UserInfoFromInterface{

	@Override
	public Map<String, String> getUserInfo() {
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("wy", "wangyang");
		nameMap.put("w", "wang");
		return nameMap;
	}

	@Override
	public Map<String, String> getHomeAddress() {
		Map<String, String> addressMap = new HashMap<String, String>();
		addressMap.put("wy", "SH");
		addressMap.put("w", "S");
		return addressMap;
	}

}
