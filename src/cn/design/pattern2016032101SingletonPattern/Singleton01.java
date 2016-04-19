package cn.design.pattern2016032101SingletonPattern;

public class Singleton01 {

	private static Singleton01 singleton = null;
	
	private Singleton01(){}
	
	public static Singleton01 getInstance(){
		
		if(singleton == null)
			singleton = new Singleton01();
		
		return singleton;
	}
}
