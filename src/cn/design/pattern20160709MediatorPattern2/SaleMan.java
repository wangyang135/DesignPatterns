package cn.design.pattern20160709MediatorPattern2;

import java.util.Random;

public class SaleMan extends AbstractEmployee {

	public SaleMan(){}
	
	public SaleMan(AbstractMediator mediator) {
		super(mediator);
	}
	
	public int getStatus() {
		Random random = new Random();
		int num = random.nextInt(120);
		return num;
	}

	public void sale(Integer num) {
		this.mediator.executor("sale", num);
	}
}
