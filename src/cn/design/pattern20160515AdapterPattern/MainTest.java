package cn.design.pattern20160515AdapterPattern;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		DataFrom from = new DataFrom(1, 2, 3);
		List<DataInto> dataIntoList = Transfer.getTransferData(from);
		for (DataInto dataInto : dataIntoList) {
			System.out.println(dataInto.getId() + ">>>" + dataInto.getNum());
		}
		
	}
}
