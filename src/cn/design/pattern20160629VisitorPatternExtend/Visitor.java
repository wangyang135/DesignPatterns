package cn.design.pattern20160629VisitorPatternExtend;

public interface Visitor {

	public void visit(CommonEmployee commonEmp);
	
	public void visit(Manager manager);
}
