package cn.design.pattern20160612StrategyPatternCalculator1;

public class Context {

	private Calculator cal;
	
	public Context() {
	}

	public Context(Calculator cal) {
		super();
		this.cal = cal;
	}
	
	public int cal(int a, int b){
		return this.cal.cal(a, b);
	}
}
