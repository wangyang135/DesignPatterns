package cn.design.pattern20160709MediatorPattern;

public class MainTest {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Airplane airPlane = new CNAirPlane();
				airPlane.landingMethod();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Airplane airPlane2 = new CNSHAirPlane();
				airPlane2.landingMethod();
			}
		}).start();
		
	}
}
