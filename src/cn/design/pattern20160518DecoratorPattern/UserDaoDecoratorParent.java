package cn.design.pattern20160518DecoratorPattern;

public abstract class UserDaoDecoratorParent implements Dao {

	protected Dao userDao;

	public UserDaoDecoratorParent(Dao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public abstract void startTranscation();
	
	public abstract void stopTranscation();
	
}
