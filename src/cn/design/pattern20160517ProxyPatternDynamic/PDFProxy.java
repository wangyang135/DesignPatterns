package cn.design.pattern20160517ProxyPatternDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PDFProxy {

	public static Object getProxy(final Object obj){
		
		return Proxy.newProxyInstance(obj.getClass().getClassLoader()
				, obj.getClass().getInterfaces(), new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						method.invoke(obj, args);
						return null;
					}
				});
	}
}
