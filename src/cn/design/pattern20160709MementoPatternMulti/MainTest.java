package cn.design.pattern20160709MementoPatternMulti;

import java.util.HashMap;

public class MainTest {

	public static void main(String[] args) {
		
		Originator orig = new Originator();
		orig.setState1("很好");
		orig.setState2("很不好");
		orig.setState3("很好");
		
		HashMap<String, Memento> mementoMap = new HashMap<String, Memento>();
		
		Caretaker taker = new Caretaker();
		
		mementoMap.put("001", orig.createMemento());
		
		orig.setState1("很好");
		orig.setState2("很好");
		orig.setState3("很好");
		
		mementoMap.put("002", orig.createMemento());
		
		taker.setMementoMap(mementoMap);
		
		orig.backState(taker.getMementoMap().get("001"));
		System.out.println(orig);
		
		orig.backState(taker.getMementoMap().get("002"));
		System.out.println(orig);
	}
}
