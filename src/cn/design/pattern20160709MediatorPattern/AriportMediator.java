package cn.design.pattern20160709MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class AriportMediator {

	// 记录飞机申请着陆的序列
	private static List<Object> airPlaneWaitingLoading = new ArrayList<Object>();
	// 飞机着陆状态0：表示不可以着陆，1表示可以着陆。
	private static int airPlaneLoadingStatus = 1;
	
	public static List<Object> getAirPlaneWaitingLoading() {
		return airPlaneWaitingLoading;
	}

	public static synchronized void setAirPlaneWaitingLoading(Object airPlane) {
		airPlaneWaitingLoading.add(airPlane);
		// System.out.println(airPlaneWaitingLoading);
	}
	
	public static synchronized void removeAirplane(Object airPlane) {
		airPlaneWaitingLoading.remove(airPlane);
		// System.out.println(airPlaneWaitingLoading);
	}
	
	public synchronized boolean checkIsSafe() {
		// 正在准备着陆的飞机
		if(airPlaneWaitingLoading != null && airPlaneWaitingLoading.size() > 1 || airPlaneLoadingStatus == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public synchronized void setStatus(int status){
		airPlaneLoadingStatus = status;
		// System.out.println("状态：" + airPlaneLoadingStatus);
	}
	public int getStatus(){
		return airPlaneLoadingStatus;
	}
	
	
}
