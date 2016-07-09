package cn.design.pattern20160709MediatorPattern2;

public class PurchaseMan extends AbstractEmployee {

	public PurchaseMan(){
		
	}
	
	public PurchaseMan(AbstractMediator mediator) {
		super(mediator);
	}

	public void buy(int i) {
		this.mediator.executor("buy", i);
	}

	public void stopBuy() {
		System.out.println("停止购买");
	}
	
}
