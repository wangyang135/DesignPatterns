package cn.design.pattern20160709MediatorPattern;

@SuppressWarnings("static-access")
public class CNAirPlane extends Airplane{

	@Override
	public void prepareLanded() {
		System.out.println("CNAirPlane--准备着陆！");
		this.mediator.setAirPlaneWaitingLoading(this);
	}

	@Override
	public synchronized boolean checkIsSafe() {
		return this.mediator.checkIsSafe();
	}

	@Override
	public synchronized void landing() {
		this.mediator.setStatus(0);
		System.out.println("CNAirPlane--正在着陆！");
		try {
			new Thread().sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.mediator.removeAirplane(this);
		System.out.println("CNAirPlane--着陆完成！");
		this.mediator.setStatus(1);
	}

	@Override
	public void continueToFly() {
		System.out.println("CNAirPlane--继续飞行！");
		while(true){
			if(this.mediator.checkIsSafe()){
				landing();
				break;
			}
		}
	}
	
}
