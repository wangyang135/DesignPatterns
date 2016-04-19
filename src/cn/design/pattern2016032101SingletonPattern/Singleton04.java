package cn.design.pattern2016032101SingletonPattern;

public class Singleton04 {

	private static final Singleton04 singleton = new Singleton04();
	
	private Singleton04(){
	}
	
	public static Singleton04 getInstance(){
		return singleton;
	}
}
