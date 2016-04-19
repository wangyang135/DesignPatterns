package cn.design.pattern2016032101SingletonPattern;

public enum Singleton06 {

	INSTANCE;
	
	private Singleton06(){
	}
	
	public void print(){
		System.out.println("Enum Singleton!");
	}
}
