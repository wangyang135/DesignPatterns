package cn.design.pattern2016032009InterfaceSegregationPrinciple;

public class MainTest {

	public static void main(String[] args) {
		DogInter dog = new Dog();
		dog.eatFood();
		dog.run();
		
		BirdInter bird = new Bird();
		bird.eatFood();
		bird.sing();
		bird.fly();
	}
}
