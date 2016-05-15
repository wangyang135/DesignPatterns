package cn.design.pattern20160515AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Transfer {

	private static List<DataInto> dataIntoList = new ArrayList<DataInto>();
	
	public static List<DataInto> getTransferData(DataFrom dataFrom){
		if(dataIntoList != null && dataIntoList.size() > 0)
			dataIntoList.clear();
		
		DataInto dataIntoForX = new DataInto();
		dataIntoForX.setId(dataFrom.getId() + "_x");
		dataIntoForX.setNum(dataFrom.getX());
		dataIntoList.add(dataIntoForX);
		
		DataInto dataIntoForY = new DataInto();
		dataIntoForY.setId(dataFrom.getId() + "_y");
		dataIntoForY.setNum(dataFrom.getY());
		
		dataIntoList.add(dataIntoForY);
		return dataIntoList;
	}
	
	
}
