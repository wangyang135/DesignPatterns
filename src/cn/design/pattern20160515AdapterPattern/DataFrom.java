package cn.design.pattern20160515AdapterPattern;

public class DataFrom {

	private int id;
	
	private int x;
	
	private int y;

	public DataFrom() {
		super();
	}

	public DataFrom(int id, int x, int y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
