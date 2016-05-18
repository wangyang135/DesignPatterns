package cn.design.pattern20160518DecoratorPattern;

public class MainTest {

	public static void main(String[] args) {
		Dao userDao = new UserDao();
		UserDaoDecorator decorator = new UserDaoDecorator(userDao);
		decorator.saveAll("wy", new String[]{"wyImage", "wangyangImage"});
	}
}
