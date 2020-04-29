package com.klab.designpatterns.singletonpattern;

public class SingletonPattern {
	
	private static SingletonPattern instance;
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		
		if(instance == null) {
			instance = new SingletonPattern();
		}
		
		return instance;
		
	}
	
	public void doSomething() {
		System.out.println("i am singleton");
	}

}
