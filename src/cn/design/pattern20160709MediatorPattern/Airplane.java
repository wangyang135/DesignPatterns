package cn.design.pattern20160709MediatorPattern;

public abstract class Airplane {

	protected static AriportMediator mediator = new AriportMediator();
	/**
	 * 准备降落
	 */
	public abstract  void prepareLanded();
	
	/**
	 * 检查是否安全
	 */
	public abstract boolean checkIsSafe();
	
	/**
	 * 着陆
	 */
	public abstract void landing();
	
	/**
	 * 继续飞行，直到确认安全为止
	 */
	public abstract void continueToFly();
	
	public void landingMethod(){
		this.prepareLanded();
		if(this.checkIsSafe()){
			landing();
		}else{
			continueToFly();
		}
		
	}
}
