package cn.design.pattern20160524BridgePattern;

public class MainTest {

	public static void main(String[] args) {
		HongQICompany hq = new HongQICompany();
		CarCompanyBusi companyBusi = new CarCompanyBussiness(hq);
		companyBusi.getMoney();
		
		BYDCompany byd = new BYDCompany();
		companyBusi = new CarCompanyBussiness(byd);
		companyBusi.getMoney();
		
	}
}
