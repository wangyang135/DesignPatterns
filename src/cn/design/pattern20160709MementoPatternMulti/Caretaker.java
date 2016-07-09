package cn.design.pattern20160709MementoPatternMulti;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

	private Map<String, Memento> mementoMap = new HashMap<String, Memento>();

	public Map<String, Memento> getMementoMap() {
		return mementoMap;
	}

	public void setMementoMap(Map<String, Memento> mementoMap) {
		this.mementoMap = mementoMap;
	}
	
}
