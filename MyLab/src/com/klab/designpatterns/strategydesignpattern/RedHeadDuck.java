package com.klab.designpatterns.strategydesignpattern;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I am RedHeadDuck");
	}

}
