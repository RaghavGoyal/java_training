package com.singletonObject;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj;
		obj=Singleton.getInstance();
		System.out.println("creating other instance");
		obj=Singleton.getInstance();

	}

}
