package cn.design.pattern20160608ObserverPatternPull;

public class XX implements Observer2 {

	@Override
	public void feed(Observable2 observer) {
		if(observer.isNeedFeed()){
			System.out.println("喂食");
		}
	}

	
}
