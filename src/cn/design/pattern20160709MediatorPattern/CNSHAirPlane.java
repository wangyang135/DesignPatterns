package cn.design.pattern20160709MediatorPattern;

@SuppressWarnings("static-access")
public class CNSHAirPlane extends Airplane{

	@Override
	public void prepareLanded() {
		System.out.println("CNSHAirPlane--准备着陆！");
		this.mediator.setAirPlaneWaitingLoading(this);
	}

	@Override
	public boolean checkIsSafe() {
		return this.mediator.checkIsSafe();
	}

	@Override
	public synchronized void landing() {
		System.out.println("CNSHAirPlane--正在着陆！");
		try {
			new Thread().sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.mediator.setStatus(0);
		this.mediator.removeAirplane(this);
		System.out.println("CNSHAirPlane--着陆完成！");
	}

	@Override
	public void continueToFly() {
		System.out.println("CNSHAirPlane--继续飞行！");
		while(true){
			if(this.mediator.checkIsSafe()){
				landing();
				break;
			}
		}
	}
}
