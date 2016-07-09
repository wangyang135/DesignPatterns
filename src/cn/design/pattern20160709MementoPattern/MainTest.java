package cn.design.pattern20160709MementoPattern;

public class MainTest {

	public static void main(String[] args) {
		Originator orig = new Originator();
		orig.setState("很好");
		System.out.println(orig.getState());
		
		CareTaker taker = new CareTaker();
		taker.setMemento(orig.createMemento());
		
		orig.setState("不好");
		System.out.println(orig.getState());
		
		orig.backState(taker.getMemento());
		System.out.println(orig.getState());
	}
}
