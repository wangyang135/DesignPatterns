package cn.design.pattern20160525CompositePattern;

public abstract class Corp {

	// 姓名
	private String name = "";
	// 职位
	private String position = "";
	// 薪水
	private int salary = 0;
	
	public Corp(String name, String position, int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getInfo(){
		return "姓名：" + this.name + "\t职位" + this.position + "\t薪水" + this.salary;
	}
}
