package cn.design.pattern2016032003SingleResponsibility;

public interface Car {

	/** 设置名称 */
	public void setCarName(String carName);
	/** 名称 */
	public String getCarName();
	
	/** 设置颜色*/
	public void setCarColor(String carColoe);
	/** 颜色 */
	public String getCarColor();
}
