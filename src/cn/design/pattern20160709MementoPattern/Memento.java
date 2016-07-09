package cn.design.pattern20160709MementoPattern;

public class Memento {

	private String state = "";

	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
