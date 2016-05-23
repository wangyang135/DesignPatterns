package cn.design.pattern20160523FacadePattern;

public class PorkRetailer {

	private WholeSaler wholeSaler = new WholeSaler();
	
	public String getPork(){
		System.out.println(wholeSaler.getProk());
		return "PorkRetailer-Pork";
	}
}
