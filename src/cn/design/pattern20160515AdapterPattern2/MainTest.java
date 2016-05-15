package cn.design.pattern20160515AdapterPattern2;

public class MainTest {

	public static void main(String[] args) {
		UserInfoTransfer transfer = new UserInfoTransfer();
		UserInfoInto userInto = transfer.getUser();
		System.out.println(userInto.getUserName() + ">>" + userInto.getAddress() );
	}
}
