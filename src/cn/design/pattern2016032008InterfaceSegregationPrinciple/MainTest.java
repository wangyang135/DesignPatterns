package cn.design.pattern2016032008InterfaceSegregationPrinciple;

public class MainTest {

	public static void main(String[] args) {
		Common dog = new Dog();
		dog.eatFood();
		dog.run();
		
		Common bird = new Bird();
		bird.eatFood();
		bird.sing();
		bird.fly();
		
	}
}
