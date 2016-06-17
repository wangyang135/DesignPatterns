package cn.design.pattern20160617ChainOfResponsibility;

public class SecondHandler extends Handler {

	public SecondHandler() {
		super();
		this.domain.put("www.tecent.com", "183.60.38.45");
	}
	
	@Override
	public String response(String domain) {
		
		return this.domain.get(domain);
	}

}
