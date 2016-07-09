package cn.design.pattern20160709MediatorPattern2;

public abstract class AbstractMediator {

	protected static PurchaseMan purchase = new PurchaseMan();
	protected static SaleMan sale = new SaleMan();
	protected static StoreMan store = new StoreMan();
	
	public abstract void executor(String exeStr, Object...obj);
}
