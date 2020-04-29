package com.klab.designpatterns.strategydesignpattern;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("RubberDuck");
	}

}
