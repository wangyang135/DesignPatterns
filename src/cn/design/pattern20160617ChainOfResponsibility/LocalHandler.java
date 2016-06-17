package cn.design.pattern20160617ChainOfResponsibility;

public class LocalHandler extends Handler {

	public LocalHandler() {
		super();
		this.domain.put("www.baidu.com", "115.239.210.27");
	}

	@Override
	public String response(String domain) {
		return this.domain.get(domain);
	}

}
