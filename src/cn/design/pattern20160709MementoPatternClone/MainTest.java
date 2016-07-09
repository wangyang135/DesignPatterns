package cn.design.pattern20160709MementoPatternClone;

public class MainTest {

	public static void main(String[] args) {
		Originator orig = new Originator();
		orig.setState("很好");
		System.out.println(orig.getState());
		orig.createMemento();
		
		orig.setState("不好");
		System.out.println(orig.getState());
		
		orig.backState();
		System.out.println(orig.getState());
	}
}
