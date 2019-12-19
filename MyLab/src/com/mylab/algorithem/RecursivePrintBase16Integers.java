package com.mylab.algorithem;

public class RecursivePrintBase16Integers {
	public static void printBase16Integers(int n,int base) {
		String conversion = "0123456789ABCDEF";
		char digit = (char) (n % base );
		n = n/base;
		if(n != 0) {
			printBase16Integers(n,base);
			System.out.println(" "+ conversion.charAt(digit));
		}
	}

	public static void main(String[] args) {
		int n = 666;
		int base = 16;
		printBase16Integers(n,base);
	}

}
