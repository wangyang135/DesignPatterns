package cn.design.pattern20160608ObserverPatternPush;

import java.util.ArrayList;
import java.util.List;

public class Turtle implements Observable{

	private List<Observer> observerList = new ArrayList<Observer>();
	
	public void hungry(){
		this.notifyObservers("我饿了！");
	}

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observerList != null && observerList.contains(observer)){
			observerList.remove(observer);
		}
	}
	
	@Override
	public void notifyObservers(String info) {
		for (Observer observer : observerList) {
			observer.feed(info);
		}
	}
}
