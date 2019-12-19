package com.mylab.algorithem;

public class RecursiveFactorial {
	public static int factorial(int n) {
		/*termination condition*/
		if(n<=1)
			return 1;
		/*body recursive expansion*/
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		int n=10;
		int result = factorial(n);
		System.out.println(result); 
	}

}
