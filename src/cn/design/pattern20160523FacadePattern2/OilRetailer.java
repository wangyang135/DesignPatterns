package cn.design.pattern20160523FacadePattern2;

public class OilRetailer implements OilMerchant{

	private WholeSaler wholeSaler = new WholeSaler();
	
	public String getOil(){
		System.out.println(wholeSaler.getOil());
		return "OilRetailer-Oil";
	}
}
