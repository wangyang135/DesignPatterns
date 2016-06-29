package cn.design.pattern20160629VisitorPatternExtend;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(CommonEmployee commonEmp) {
		System.out.println(this.getCommonEmpInfo(commonEmp));
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}
	
	public String getBasicInfo(Employee employee) {
		String info = "姓名：" + employee.getName() + "    ";
		info += "工资：" + employee.getSalary() + "    ";
		info += "性别：" + employee.getSex() + "    ";
		return info;
	}
	
	public String getCommonEmpInfo(CommonEmployee commonEmp) {
		String baseInfo = getBasicInfo(commonEmp);
		String otherInfo = commonEmp.getJob();
		return baseInfo + otherInfo;
	}
	
	public String getManagerInfo(Manager manager) {
		String baseInfo = getBasicInfo(manager);
		String otherInfo = manager.getPerform();
		return baseInfo + otherInfo;
	}

}
