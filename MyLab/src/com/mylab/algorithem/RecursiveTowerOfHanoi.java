package com.mylab.algorithem;

public class RecursiveTowerOfHanoi {
	
	public static void towerOfHano(int num,char source,char temp,char desti) {
		if(num <= 1)
			return;
		towerOfHano(num-1,source,temp,desti);
		System.out.println("move"+num+"disk from peg"+source+"to beg"+ desti);
		towerOfHano(num-1,source,temp,desti);
		
	}

	public static void main(String[] args) {
		towerOfHano(4,'A','C','B');
	}

}
