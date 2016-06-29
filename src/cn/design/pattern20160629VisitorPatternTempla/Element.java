package cn.design.pattern20160629VisitorPatternTempla;

public abstract class Element {

	// 定义方法
	public abstract void doSomething();

	// 定义接收的观察者
	public abstract void accept(Vistor vistor);
}
