package cn.design.pattern20160709MediatorPattern2;

public class MainTest {

	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		PurchaseMan purchase = new PurchaseMan(mediator);
		purchase.buy(100);
		
		SaleMan sale = new SaleMan(mediator);
		sale.sale(100);
		
		StoreMan store = new StoreMan(mediator);
		store.clearStore();
	}
}
