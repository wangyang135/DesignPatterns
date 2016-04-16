package cn.design.pattern2016032003SingleResponsibility;

public interface CarAction {

	/** 启动*/
	public void startUp();
	
	/** 行驶*/
	public void run();
	
	/** 停止*/
	public void stop();
}
