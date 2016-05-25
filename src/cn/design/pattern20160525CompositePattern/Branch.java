package cn.design.pattern20160525CompositePattern;

import java.util.ArrayList;

public class Branch extends Corp {

	ArrayList<Corp> subList = new ArrayList<Corp>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void addSubordinate(Corp corp){
		this.subList.add(corp);
	}
	
	public ArrayList<Corp> getSubordinate(){
		return this.subList;
	}
}
