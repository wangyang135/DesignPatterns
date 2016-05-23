package cn.design.pattern20160523FacadePattern2;

public class PorkRetailer implements PorkMerchant {

	private WholeSaler wholeSaler = new WholeSaler();
	
	public String getPork(){
		System.out.println(wholeSaler.getPork());
		return "PorkRetailer-Pork";
	}
}
