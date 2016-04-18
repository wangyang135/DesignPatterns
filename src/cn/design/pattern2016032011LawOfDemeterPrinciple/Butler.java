package cn.design.pattern2016032011LawOfDemeterPrinciple;

import java.util.ArrayList;
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

	public List<Maid> getMaidList(){
		List<Maid> maidList = new ArrayList<Maid>();
		for(int i = 0; i < 2; i++){
			maidList.add(new Maid("maid" + i));
		}
		return maidList;
	}
	
	public void cook(){
		List<Maid> maidList = getMaidList();
		for (Maid maid : maidList) {
			maid.cook();
		}
	}
}
