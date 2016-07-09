package cn.design.pattern20160709MementoPatternMulti;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	public static HashMap<String, Object> store(Object obj) {
		
		HashMap<String, Object> stateMap = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] properties = beanInfo.getPropertyDescriptors();
			
			for (PropertyDescriptor proper : properties) {
				
				String propertyName = proper.getName();
				
				Method readMethod = proper.getReadMethod();
				
				Object filedValue = readMethod.invoke(obj, new Object[]{});
				
				if(!propertyName.equalsIgnoreCase("class"))
					stateMap.put(propertyName, filedValue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stateMap;
	}

	public static void back(Object obj, HashMap<String, Object> stateMap) {
		
		try {
			
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propers = beanInfo.getPropertyDescriptors();
			
			for (PropertyDescriptor proper : propers) {
				
				String properName = proper.getName();
				Method method = proper.getWriteMethod();
				if(stateMap.containsKey(properName)) {
					method.invoke(obj, stateMap.get(properName));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
