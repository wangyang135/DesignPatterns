package cn.design.pattern20160629VisitorPatternExtend;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	static List<Employee> empList = new ArrayList<Employee>();
	
	static {
		
		CommonEmployee commonEmp = new CommonEmployee();
		commonEmp.setName("wy");
		commonEmp.setSalary(1000);
		commonEmp.setSex("man");
		commonEmp.setJob("IT");
		empList.add(commonEmp);
		
		CommonEmployee commonEmp2 = new CommonEmployee();
		commonEmp2.setName("w");
		commonEmp2.setSalary(2000);
		commonEmp2.setSex("man");
		commonEmp2.setJob("code");
		empList.add(commonEmp2);
		
		CommonEmployee commonEmp3 = new CommonEmployee();
		commonEmp3.setName("wang");
		commonEmp3.setSalary(5000);
		commonEmp3.setSex("woman");
		commonEmp3.setJob("销售");
		empList.add(commonEmp3);
		
		Manager manager = new Manager();
		manager.setName("wyy");
		manager.setPerform("好");
		manager.setSalary(10000);
		manager.setSex("man");
		empList.add(manager);
		
		Manager manager2 = new Manager();
		manager2.setName("wangyang");
		manager2.setPerform("优秀");
		manager2.setSalary(20000);
		manager2.setSex("man");
		empList.add(manager2);
		
	}
	
	public static void main(String[] args) {
		
		for (Employee emp : empList) {
			emp.accept(new ConcreteVisitor());
		}
	}
}
