package com.mylab.algorithem;

public class Fibonacci {
	public static int fibonacii(int n) {
		if(n<=1)
			return n;
		return fibonacii(n-1)+fibonacii(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fibonacii(10));
	}

}
