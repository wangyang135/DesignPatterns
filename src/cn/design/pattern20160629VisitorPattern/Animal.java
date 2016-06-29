package cn.design.pattern20160629VisitorPattern;

public abstract class Animal {

	// 定义吃饭的方法
	public abstract void eatFood();

	// 定义接收的观察者
	public abstract void accept(Vistor vistor);
}
