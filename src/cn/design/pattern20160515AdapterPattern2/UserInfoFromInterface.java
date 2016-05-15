package cn.design.pattern20160515AdapterPattern2;

import java.util.Map;

public interface UserInfoFromInterface {

	public Map<String, String> getUserInfo();
	
	public Map<String, String> getHomeAddress();
}
