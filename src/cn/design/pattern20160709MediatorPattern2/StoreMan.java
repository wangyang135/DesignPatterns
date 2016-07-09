package cn.design.pattern20160709MediatorPattern2;

public class StoreMan extends AbstractEmployee {

	private int num = 100;
	
	public StoreMan() {
		
	}
	
	public StoreMan(AbstractMediator mediator) {
		super(mediator);
	}

	public void increaseStore(Integer num) {
		
		this.num += num;
	}

	public Integer getNum() {
		
		return this.num;
	}

	public void clearStore() {

		this.mediator.executor("sell", this.num);
	}

	public void decreaseStore(Integer num2) {

		this.num -= num2;
	}

}
