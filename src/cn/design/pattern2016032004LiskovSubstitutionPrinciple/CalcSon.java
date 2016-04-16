package cn.design.pattern2016032004LiskovSubstitutionPrinciple;

public class CalcSon extends Calc{

	/*public void calc(int a, int b) {
		// a+b = ?
		System.out.println(a + " + " + b + " = " + (a + b));
	}*/
	
	// other method
	public void addThem(int a, int b) {
		System.out.println(a + b);
	}
}
