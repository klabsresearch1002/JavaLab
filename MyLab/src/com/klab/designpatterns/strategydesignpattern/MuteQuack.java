package com.klab.designpatterns.strategydesignpattern;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("<<silence>>");
	}

}
