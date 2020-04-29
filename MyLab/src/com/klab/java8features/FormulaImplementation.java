package com.klab.java8features;

public class FormulaImplementation implements Formula {
	@Override
	public double calculate(int a) {
		return Math.sqrt(a);
	}
}
