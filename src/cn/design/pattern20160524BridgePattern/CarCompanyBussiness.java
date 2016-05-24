package cn.design.pattern20160524BridgePattern;

public class CarCompanyBussiness extends CarCompanyBusi{
	
	public CarCompanyBussiness(CompanyImplementor company){
		super(company);
		this.carCompany = company;
	}
	
	@Override
	public void getMoney() {
		this.carCompany.produceCar();
		this.carCompany.sellCar();
	}
}
