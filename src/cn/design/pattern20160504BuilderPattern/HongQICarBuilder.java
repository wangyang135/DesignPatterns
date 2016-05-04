package cn.design.pattern20160504BuilderPattern;


public class HongQICarBuilder extends CarBuilder{

	@Override
	public void setShape(String shape) {
		this.car.setShape(shape);
	}

	@Override
	public void setAssemble(String assemble) {
		this.car.setAssemble(assemble);
	}

	@Override
	public void setColor(String color) {
		this.car.setColor(color);
	}

}
