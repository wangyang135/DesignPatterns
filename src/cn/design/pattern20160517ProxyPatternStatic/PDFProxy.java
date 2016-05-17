package cn.design.pattern20160517ProxyPatternStatic;

public class PDFProxy implements File{

	private File file = null;

	@Override
	public void openFile() {
		if(file == null){
			file = new PDFFile();
		}
		file.openFile();
	}

}
