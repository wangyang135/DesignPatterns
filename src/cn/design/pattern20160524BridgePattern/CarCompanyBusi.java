package cn.design.pattern20160524BridgePattern;

public abstract class CarCompanyBusi {

	protected CompanyImplementor carCompany;
	
	public CarCompanyBusi(CompanyImplementor carCompany){
		this.carCompany = carCompany;
	}
	
	public abstract void getMoney();
}
