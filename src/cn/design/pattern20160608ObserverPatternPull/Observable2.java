package cn.design.pattern20160608ObserverPatternPull;

public interface Observable2 {

	// 添加观察者
	public void addObserver(Observer2 observer);
	// 删除观察者
	public void removeObserver(Observer2 observer);
	// 通知观察者
	public void notifyObservers();
	// 要喂食
	public boolean isNeedFeed();
}
