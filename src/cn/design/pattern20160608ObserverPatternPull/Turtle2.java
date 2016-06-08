package cn.design.pattern20160608ObserverPatternPull;

import java.util.ArrayList;
import java.util.List;

public class Turtle2 implements Observable2 {

	private List<Observer2> observerList = new ArrayList<Observer2>();
	
	public void hungry(){
		this.notifyObservers();
	}

	@Override
	public void addObserver(Observer2 observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer2 observer) {
		if(observerList != null && observerList.contains(observer)){
			observerList.remove(observer);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer2 observer : observerList) {
			observer.feed(this);
		}
	}

	@Override
	public boolean isNeedFeed() {
		return true;
	}
}
