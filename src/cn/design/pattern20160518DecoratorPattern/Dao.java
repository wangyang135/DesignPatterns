package cn.design.pattern20160518DecoratorPattern;

public interface Dao {

	public void saveUser(String user);
	
	public void saveHeadImages(String[] images);
	
	public void saveAll(String user, String[] images);
}
