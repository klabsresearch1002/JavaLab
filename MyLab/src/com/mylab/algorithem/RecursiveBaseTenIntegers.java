package com.mylab.algorithem;

public class RecursiveBaseTenIntegers {
	public static void printInt1(int n) {
		char digit = (char) (n % 10 + '0' );
		n = n /10;
		if(n != 0)
			printInt1(n);
		System.out.println(" "+ digit);
	}

	public static void main(String[] args) {
		int n = 16666;
		printInt1(n);
	}

}
