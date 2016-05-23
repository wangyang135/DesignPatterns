package cn.design.pattern20160523FacadePattern2;

public class WholeSaler implements PorkMerchant, OilMerchant{

	public String getPork(){
		return "WholeSaler-Prok";
	}
	
	public String getOil(){
		return "WholeSaler-Oil";
	}

}
