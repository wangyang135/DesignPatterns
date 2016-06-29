package cn.design.pattern20160629VisitorPatternExtend;

public class CommonEmployee extends Employee {

	private String job;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
