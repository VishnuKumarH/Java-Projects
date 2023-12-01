package com.java.vishnu;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		Employee vis = new Employee();
		
		Class<? extends Employee> c = vis.getClass();
		Method [] methods = c.getMethods();
		
		for(Method method:methods) {
			if(Modifier.isPublic(method.getModifiers()))  // to get public methods
			System.out.println(method.getName());
			
		}
				

	}

}
//if(!Modifier.isPublic(method.getModifiers()))---to get non public or private methods
