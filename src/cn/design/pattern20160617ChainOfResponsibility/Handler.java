package cn.design.pattern20160617ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public abstract class Handler {

	private Handler nextHandler;
	// key-->domain; value-->ip
	protected Map<String, String> domain = new HashMap<String, String>();
	
	public final String handlerMessage(String domain) {
		// 当前的节点存在该DNS的映射的话直接返回
		if(this.domain != null && this.domain.containsKey(domain))
			return this.domain.get(domain);
		// 切换到下一个节点处理
		else{
			return this.nextHandler.handlerMessage(domain);
		}
	}
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void setDomain(Map<String, String> domain) {
		this.domain = domain;
	}
	
	// 返回的信息
	public abstract String response(String domain);
	
}
