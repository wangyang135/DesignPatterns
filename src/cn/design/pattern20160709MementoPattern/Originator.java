package cn.design.pattern20160709MementoPattern;

public class Originator {

	private String state = "";
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		
		return new Memento(this.state);
	}
	
	public void backState(Memento memento) {
		this.setState(memento.getState());
	}
}
