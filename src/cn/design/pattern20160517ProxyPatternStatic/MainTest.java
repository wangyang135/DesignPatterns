package cn.design.pattern20160517ProxyPatternStatic;

public class MainTest {

	public static void main(String[] args) {
		PDFProxy proxy = new PDFProxy();
		proxy.openFile();
	}
}
