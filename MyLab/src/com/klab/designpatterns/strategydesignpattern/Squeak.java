package com.klab.designpatterns.strategydesignpattern;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
