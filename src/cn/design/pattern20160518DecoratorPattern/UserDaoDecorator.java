package cn.design.pattern20160518DecoratorPattern;

public class UserDaoDecorator extends UserDaoDecoratorParent {

	public UserDaoDecorator(Dao userDao) {
		super(userDao);
	}

	@Override
	public void saveUser(String user) {
		userDao.saveUser(user);
	}

	@Override
	public void saveHeadImages(String[] images) {
		userDao.saveHeadImages(images);
	}

	@Override
	public void saveAll(String user, String[] images) {
		// 开启事务
		this.startTranscation();
		
		this.saveUser(user);
		this.saveHeadImages(images);
		
		// 结束事务
		this.stopTranscation();
	}

	@Override
	public void startTranscation() {
		System.out.println("开启事务..");
	}

	@Override
	public void stopTranscation() {
		System.out.println("关闭事务..");
	}

	
}
