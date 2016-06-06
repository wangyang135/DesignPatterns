package cn.design.pattern20160606TemplateMethodPattern;

public abstract class Car {

	public abstract void startUp();
	public abstract void run();
	public abstract void stop();
	
	public void templateMethod(){
		this.startUp();
		this.run();
		this.stop();
	}
}
