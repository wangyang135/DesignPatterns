package cn.design.pattern2016032101SingletonPattern;

public class MainTest {

	public static void main(String[] args) {
		Singleton01 singleton01 = Singleton01.getInstance();
		
		Singleton02 singleton02 = Singleton02.getInstance();
		
		Singleton06.INSTANCE.print();
	}
}
