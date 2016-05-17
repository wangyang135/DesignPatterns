package cn.design.pattern20160517ProxyPatternDynamic;

public class MainTest {

	public static void main(String[] args) {
		PDFFile pdf = new PDFFile();
		File proxy = (File) PDFProxy.getProxy(pdf);
		proxy.openFile();
	}
}
