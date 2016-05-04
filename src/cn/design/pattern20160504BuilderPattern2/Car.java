package cn.design.pattern20160504BuilderPattern2;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

	private List<String> exeOrderList = new ArrayList<String>();
	public abstract void startUp();
	public abstract void run();
	public abstract void stop();
	
	public final void templateMethod(){
		for (String exeOrder : exeOrderList) {
			if("startUp".equals(exeOrder)){
				this.startUp();
			}else if("run".equals(exeOrder)){
				this.run();
			}else if("stop".equals(exeOrder)){
				this.stop();
			}
		}
	}
	
	public final void setOrder(List<String> exeOrderList){
		this.exeOrderList = exeOrderList;
	}
	
}
