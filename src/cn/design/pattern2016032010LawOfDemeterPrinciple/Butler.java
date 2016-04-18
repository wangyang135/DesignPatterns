package cn.design.pattern2016032010LawOfDemeterPrinciple;

import java.util.List;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Butler
 * @Description 雇佣的管家
 * @author wy
 * @date 2016-4-18
 *
 */
public class Butler {

	public void cook(List<Maid> maidList){
		for (Maid maid : maidList) {
			maid.cook();
		}
	}
}
