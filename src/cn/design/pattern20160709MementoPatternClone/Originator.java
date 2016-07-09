package cn.design.pattern20160709MementoPatternClone;

public class Originator implements Cloneable {

	private Originator orignator;
	
	private String state = "";
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void createMemento() {
		orignator = this.clone();
	}
	
	public void backState() {
		this.setState(orignator.getState());
	}

	@Override
	protected Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
