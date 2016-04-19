package cn.design.pattern2016032101SingletonPattern;

public class Singleton02 {

	private static Singleton02 singleton = null;
	
	private Singleton02(){}
	
	public synchronized static Singleton02 getInstance(){
		
		if(singleton == null)
			singleton = new Singleton02();
		
		return singleton;
	}
}
