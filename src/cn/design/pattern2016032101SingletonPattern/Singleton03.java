package cn.design.pattern2016032101SingletonPattern;

public class Singleton03 {

	private volatile static Singleton03 singleton = null;
	
	private Singleton03(){}
	
	public static Singleton03 getInstance(){
		
		if(singleton == null)
			synchronized (Singleton03.class) {
				
				if(singleton == null){
					singleton = new Singleton03();
				}
			}		
		
		return singleton;
	}
}
