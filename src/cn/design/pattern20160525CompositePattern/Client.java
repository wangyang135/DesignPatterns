package cn.design.pattern20160525CompositePattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		Branch root = new Branch("wy", "root", 888888);
		
		Branch it = new Branch("it1", "研发", 88888);
		Branch market = new Branch("market1", "市场", 88888);
		
		Leaf leaf_it = new Leaf("wangyang", "it", 8888);
		Leaf leaf_it2 = new Leaf("wangy", "it", 8888);
		
		Leaf leaf_market1 = new Leaf("wanan", "市场", 8888);
		Leaf leaf_market2 = new Leaf("wany", "市场", 8888);
		
		root.addSubordinate(it);
		root.addSubordinate(market);
		
		it.addSubordinate(leaf_it);
		it.addSubordinate(leaf_it2);
		
		market.addSubordinate(leaf_market1);
		market.addSubordinate(leaf_market2);
		
		String info = getTreeInfo(root);
		System.out.println(root.getInfo());
		System.out.println(info);
	}
	
	public static String getTreeInfo(Branch root){
		
		ArrayList<Corp> subList = root.getSubordinate();
		String info = "";
		
		for (Corp corp : subList) {
			if(corp instanceof Leaf){
				info = info + corp.getInfo() + "\n";
			}
			else{
				info = info + corp.getInfo() + "\n" + getTreeInfo((Branch)corp);
			}
		}
		return info;
	}
}
