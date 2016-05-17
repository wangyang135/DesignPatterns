package cn.design.pattern20160517ProxyPatternDynamic;

public class PDFFile implements File {

	@Override
	public void openFile() {
		System.out.println("打开PDF!...");
	}

}
