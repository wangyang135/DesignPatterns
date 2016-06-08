package cn.design.pattern20160608ObserverPatternPull;

public class MainTest {

	public static void main(String[] args) {
		// 观察者
		Observer2 wy = new WY();
		Observer2 xx = new XX();
		
		// 被观察者
		Observable2 turtle = new Turtle2();
		
		turtle.addObserver(wy);
		turtle.addObserver(xx);
		
		turtle.notifyObservers();
	}
}
