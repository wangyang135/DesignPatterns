package cn.design.pattern20160504BuilderPattern;

public class MainTest {

	public static void main(String[] args) {
		CarBuilder builder = new HongQICarBuilder();
		builder.setShape("流体形");
		builder.setAssemble("焊接");
		builder.setColor("黑色");
		
		Car car = builder.getCar();
		System.out.println(car.getShape());
		System.out.println(car.getAssemble());
		System.out.println(car.getColor());
	}
}
