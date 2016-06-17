package cn.design.pattern20160617ChainOfResponsibility;

public class FirstHandler extends Handler {

	public FirstHandler() {
		super();
		this.domain.put("www.alibaba.com", "140.205.94.232");
	}
	
	@Override
	public String response(String domain) {
		return this.domain.get(domain);
	}

}
