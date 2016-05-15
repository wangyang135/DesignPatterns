package cn.design.pattern20160515AdapterPattern2;

import java.util.Map;

public class UserInfoTransfer extends UserInfoFrom implements UserInfoIntoInterface{

	private Map<String, String> nameInfo = super.getUserInfo();
	private Map<String, String> addressInfo = super.getHomeAddress();
	
	@Override
	public UserInfoInto getUser() {
		UserInfoInto into = new UserInfoInto();
		into.setUserName(nameInfo.get("wy"));
		into.setAddress(addressInfo.get("wy"));
		
		return into;
	}
	
}
