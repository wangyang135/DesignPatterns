package cn.design.pattern20160523FacadePattern;

public class OilRetailer {

	private WholeSaler wholeSaler = new WholeSaler();
	
	public String getOil(){
		System.out.println(wholeSaler.getOil());
		return "OilRetailer-Oil";
	}
}
