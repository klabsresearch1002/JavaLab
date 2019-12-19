package com.mylab.algorithem;

public class GCD {
	public static int gCD(int m,int n) {
		if(m<n)
			return (gCD(n,m));
		if(m%n == 0)
			return (n);
		return (gCD(n,m%n));
	}

	public static void main(String[] args) {
		int gcd = gCD(6,12);
		System.out.println(gcd);

	}

}
