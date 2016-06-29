package cn.design.pattern20160629VisitorPattern;

public class MainTest {

	public static void main(String[] args) {
		
		Animal y = new Y();
		Animal x = new X();
		
		Vistor vistor = new WY();
		y.accept(vistor);
		
		x.accept(vistor);
	}
}
