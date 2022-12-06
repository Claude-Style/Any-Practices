package com.claude.style.tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.claude.style.classes.Computer;

public class MainTest1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//reflection 1
		Computer com = new Computer();
		Class c1 = com.getClass();
		System.out.println(c1);
		//reflection 2
		
		Class c2 = Computer.class;
		System.out.println(c2);
		
		//same Class object
		System.out.println(c1==c2); // return true here
		
		
		//reflection 3  by static method forName
		Class c3 = Class.forName("com.claude.style.classes.Computer");
		System.out.println(c3);
		//reflection 4   by class loader
		ClassLoader loader = MainTest1.class.getClassLoader();
		Class c4 = loader.loadClass("com.claude.style.classes.Computer");
		System.out.println(c4);
		
		/**
		 * operations
		 */
		Object o = c1.newInstance();
		Method method_turnOn = c1.getMethod("turnOn");
		method_turnOn.invoke(o);
		
	}

}
