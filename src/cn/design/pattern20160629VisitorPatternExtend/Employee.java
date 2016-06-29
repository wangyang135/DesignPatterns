package cn.design.pattern20160629VisitorPatternExtend;

public abstract class Employee {

	private String name;
	
	private int salary;
	
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public abstract void accept(Visitor visitor);
}
