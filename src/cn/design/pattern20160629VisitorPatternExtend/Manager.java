package cn.design.pattern20160629VisitorPatternExtend;

public class Manager extends Employee {

	private String perform;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getPerform() {
		return perform;
	}

	public void setPerform(String perform) {
		this.perform = perform;
	}

}
