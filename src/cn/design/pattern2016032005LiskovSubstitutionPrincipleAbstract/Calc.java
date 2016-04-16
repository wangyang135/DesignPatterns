package cn.design.pattern2016032005LiskovSubstitutionPrincipleAbstract;

public class Calc extends Calculator{

	public void calc(int a, int b) {
		// a-b = ?
		System.out.println(a + " - " + b + " = " + (a - b));
		
	}
}
