package com.klab.designpatterns.strategydesignpattern;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I am flying like Rocket");
	}

}
