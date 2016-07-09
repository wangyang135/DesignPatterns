package cn.design.pattern20160709MediatorPattern2;

public class Mediator extends AbstractMediator {

	@Override
	public void executor(String exeStr, Object... obj) {
		// 购入
		if("buy".equals(exeStr)) {
			this.buySomething((Integer)obj[0]);
		}
		// 卖出
		else if("sell".equals(exeStr)) {
			this.sellSomething((Integer)obj[0]);
		}
		// 清仓
		else if("clear".equals(exeStr)) {
			this.clear();
		}
		// 打折促销
		else if("sale".equals(exeStr)) {
			this.sale((Integer)obj[0]);
		}
			
	}

	private void sale(int num) {
		System.out.println("便宜卖出" + num);
	}

	private void clear() {
		System.out.println("clear --- start");
		if(store.getNum() > 0) {
			System.out.println("清仓>>" + store.getNum());
			purchase.stopBuy();
			sale.sale(store.getNum());
			store.decreaseStore(store.getNum());
		}
		else {
			System.out.println("已经清仓");
		}
		System.out.println("clear --- stop");
	}

	private void sellSomething(Integer num) {
		
		System.out.println("sell ---- start");
		if(store.getNum() <= num) {
			
			System.out.println("买入" + (num - store.getNum()));
			System.out.println("清仓");
			purchase.buy(num - store.getNum());
			store.clearStore();
		}
		else {
			System.out.println("卖出" + num);
			store.decreaseStore(num);
		}
		System.out.println("sell ---- end");
	}

	private void buySomething(Integer num) {
		System.out.println("buy ---- start");
		if(sale.getStatus() > 100) {
			System.out.println("购入" + num);
			store.increaseStore(num);
		}
		else{
			System.out.println("购入" + num / 3);
			store.increaseStore(num / 3);
		}
		System.out.println("buy ---- end");
	}
	
	

}
