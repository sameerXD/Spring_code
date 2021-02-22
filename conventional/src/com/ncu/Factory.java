package com.ncu;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class Factory {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");
    private Factory(){};
    
    static Iworker getObject() {
    	Object object = null;
    	String className = rb.getString("classname");
    	try {
			object = Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return (Iworker)object;
    };
    		
}
