package cn.design.pattern2016032011LawOfDemeterPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Maid
 * @Description 雇佣的佣人
 * @author wy
 * @date 2016-4-18
 *
 */
public class Maid {

	private String maidName;
	
	public Maid() {
		super();
	}

	public Maid(String maidName) {
		super();
		this.maidName = maidName;
	}

	public void cook(){
		System.out.println(this.maidName + ">>做饭！");
	}
	
}
