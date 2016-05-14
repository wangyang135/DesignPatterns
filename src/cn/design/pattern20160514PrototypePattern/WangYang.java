package cn.design.pattern20160514PrototypePattern;

import java.util.ArrayList;

public class WangYang implements Cloneable{

	private String name;
	
	private String address;

	// 测试对象能不能进行拷贝
	private Clothes cloth;
	
	// 测试集合能不能进行拷贝
	private ArrayList<Clothes> clothesList = new ArrayList<Clothes>();
	
	
	public Clothes getCloth() {
		return cloth;
	}

	public void setCloth(Clothes cloth) {
		this.cloth = cloth;
	}

	public ArrayList<Clothes> getClothesList() {
		return clothesList;
	}

	public void setClothesList(ArrayList<Clothes> clothesList) {
		this.clothesList = clothesList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	protected WangYang clone() {
		// 浅拷贝
		/*
		
		WangYang wy = null;
		try {
			wy = (WangYang) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return wy;
		
		*/
		// 深拷贝
		WangYang wy = null;
		try {
			wy = (WangYang) super.clone();
			cloth = this.cloth.clone();
			clothesList = (ArrayList<Clothes>) this.clothesList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return wy;
	}

	@Override
	public String toString() {
		return "WangYang [name=" + name + ", address=" + address + ", cloth="
				+ cloth + ", clothesList=" + clothesList + "]";
	}

}
