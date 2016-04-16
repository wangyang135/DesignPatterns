package cn.design.pattern2016032001SingleResponsibility;

public interface Car {

	/** 设置名称 */
	public void setCarName(String carName);
	
	/** 设置颜色*/
	public void setCarColor(String carColoe);
	
	/** 启动*/
	public void startUp();
	
	/** 行驶*/
	public void run();
	
	/** 停止*/
	public void stop();
	
}
