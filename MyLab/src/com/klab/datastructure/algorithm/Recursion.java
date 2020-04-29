package com.klab.datastructure.algorithm;

public class Recursion {
	
	//Recursion by implementing Factorial program
	// Factorial 3!
	// 1! = 1 * 0! = 1
	// 2! = 2 * 1  = 2 * 1!
	// 3! = 3 * 2 * 1 = 3 * 2!
	
	// n * (n-1)
	
	// if do not stop execution explicitly then it will generate stack overflow exception
	
	public static int factorial(int num) {
		if(num == 0)
			return 1;
		return num * factorial(num - 1);
	}

}
