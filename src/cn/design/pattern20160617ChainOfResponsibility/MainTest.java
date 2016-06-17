package cn.design.pattern20160617ChainOfResponsibility;

public class MainTest {

	public static void main(String[] args) {
		Handler local = new LocalHandler();
		Handler first = new FirstHandler();
		Handler second = new SecondHandler();
		
		local.setNextHandler(first);
		first.setNextHandler(second);
		
		String ip = local.handlerMessage("www.alibaba.com");
		System.out.println(ip);
	}
}
