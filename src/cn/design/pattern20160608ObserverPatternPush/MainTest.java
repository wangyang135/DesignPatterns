package cn.design.pattern20160608ObserverPatternPush;

public class MainTest {

	public static void main(String[] args) {
		// 观察者
		Observer wy = new WY();
		Observer xx = new XX();
		
		// 被观察者
		Observable turtle = new Turtle();
		
		turtle.addObserver(wy);
		turtle.addObserver(xx);
		
		turtle.notifyObservers("吃饭");
	}
}
