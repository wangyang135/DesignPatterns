package cn.design.pattern20160617ChainOfResponsibilityTemplate;

import java.util.logging.Level;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;

public class ConcreteHandler3 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		return null;
	}

	@Override
	protected Response echo(Request requst) {
		return null;
	}

}
