package cn.design.pattern2016032101SingletonPattern;

public class Singleton05 {

	private static class Singleton{
		private static final Singleton05 instance = new Singleton05();
	}
	
	private Singleton05(){
	}
	
	public Singleton05 getInstance(){
		return Singleton.instance;
	}
}
