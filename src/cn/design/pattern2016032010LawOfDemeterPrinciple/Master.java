package cn.design.pattern2016032010LawOfDemeterPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Master {

	public void cookCommand(Butler butler){
		List<Maid> maidList = new ArrayList<Maid>();
		for(int i = 0; i < 2; i++){
			maidList.add(new Maid("maid" + i));
		}
		
		butler.cook(maidList);
	}
}
