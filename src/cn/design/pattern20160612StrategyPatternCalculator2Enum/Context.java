package cn.design.pattern20160612StrategyPatternCalculator2Enum;

public class Context {

	public void cal(int a,String operator, int b){
		if("+".equals(operator)){
			System.out.println(Calculator.ADD.cal(a, b));
		}else if("-".equals(operator)){
			System.out.println(Calculator.SUB.cal(a, b));
		}
	}
}
