package com.singletonObject;

public class Singleton {
	private static Singleton singleInstance;
	private Singleton() {
		System.out.println("object created!");
	}
	
	public static Singleton getInstance() {
		
		if(singleInstance==null) {
			System.out.println("nothing existed.");
			singleInstance = new Singleton();
		}
		System.out.println("something");
		return singleInstance;
			
		
	}

}
