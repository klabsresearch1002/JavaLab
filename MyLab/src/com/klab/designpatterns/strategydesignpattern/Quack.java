package com.klab.designpatterns.strategydesignpattern;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("quack");
	}
}
