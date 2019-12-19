package com.mylab.algorithem;

public class RecursionFlowUnderstand {
	
	public static void printFun(int test){
		if(test < 1) {
			return;
		}
		else {
			System.out.println(test);
			printFun(test-1);
			System.out.println(test);
			return;
		}
	}

	public static void main(String[] args) {
		printFun(3);
	}

}
