package cn.design.pattern20160608ObserverPatternPush;

public interface Observable {

	// 添加观察者
	public void addObserver(Observer observer);
	// 删除观察者
	public void removeObserver(Observer observer);
	// 通知观察者
	public void notifyObservers(String info);
}
