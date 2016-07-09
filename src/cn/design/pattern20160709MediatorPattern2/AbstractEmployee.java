package cn.design.pattern20160709MediatorPattern2;

public abstract class AbstractEmployee {

	protected AbstractMediator mediator;
	
	public AbstractEmployee(){}
	
	public AbstractEmployee(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
