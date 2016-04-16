package cn.design.pattern2016032005LiskovSubstitutionPrincipleAbstract;

public class CalcSon extends Calculator{

	public void calc(int a, int b) {
		// a+b = ?
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	// other method
	public void addThem(int a, int b) {
		System.out.println(a + b);
	}
}
