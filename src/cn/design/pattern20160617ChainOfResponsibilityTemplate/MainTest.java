package cn.design.pattern20160617ChainOfResponsibilityTemplate;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;


public class MainTest {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		
		//Response response = handler1.handleMessage(new Request());
	}
}
