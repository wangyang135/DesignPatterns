package cn.design.pattern2016032004LiskovSubstitutionPrinciple;

/**
 * 
 * @ProjectName DesignPatterns
 * @ClassName MainTest
 * @Description 里氏替换原则违背的情况
 * CSDN博客:http://blog.csdn.net/wangyang1354/article/details/51164514
 * @author wy
 * @date 2016-4-16
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.calc(10, 20);
		
		/**
		 * 根据里氏替换原则，当父类替换为子类的时候，使用父类的时候的行为不应该
		 * 发生变化，那么下面的这段代码，显然发生了变化，这样显然违反了里氏替换
		 * 原则。
		 */
		CalcSon calcSon = new CalcSon();
		calcSon.calc(10, 20);
	}
}
