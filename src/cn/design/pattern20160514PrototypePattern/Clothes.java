package cn.design.pattern20160514PrototypePattern;

public class Clothes implements Cloneable{

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Clothes [color=" + color + "]";
	}

	@Override
	protected Clothes clone() throws CloneNotSupportedException {
		Clothes cloth = null;
		try {
			cloth = (Clothes) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloth;
	}
	
}
