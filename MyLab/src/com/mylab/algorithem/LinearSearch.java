package com.mylab.algorithem;

public class LinearSearch {

	private static int search(int i) {
		
		int[] elements= {10,20,80,30,60,50,110,100,130,170};
		
		for(int j=0;j <= elements.length-1; j++) {
			if(i == elements[j]) {
				return j;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Search element"+ LinearSearch.search(170));
		
	}

}
