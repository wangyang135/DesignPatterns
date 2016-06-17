package cn.design.pattern20160617ChainOfResponsibilityTemplate;

import java.util.logging.Level;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;

public abstract class Handler {

	// 下一个节点
	private Handler nextHandler;
	/**
	public final Response handleMessage(Request requst) {
		Response response = null;
		// 判断是否是自己的处理级别
		if(this.getHandlerLevel().equals(requst.getRequestLevel())) {
			response = this.echo(requst);
		}else {
			if(this.nextHandler != null) {
				response = this.nextHandler.handleMessage(requst);
			}
			else{
				// 自行处理
			}
		}
		return response;
	}
	*/
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	// 处理的级别
	protected abstract Level getHandlerLevel();
	
	// 处理者实现的处理任务
	protected abstract Response echo(Request requst);
	
}
