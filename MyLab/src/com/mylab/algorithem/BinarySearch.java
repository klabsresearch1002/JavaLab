package com.mylab.algorithem;

public class BinarySearch {
	
	private static int search(int[] array,int l,int r,int x) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			
			if(array[mid] == x) {
				return mid;
			}
			
			if(array[mid] > x) {
				return search(array,l,mid-1,x);
			}
			
			return search(array,mid+1,r,x);
		}
		
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,20,45,75,85,95,100};
		int r = array.length-1;
		int x = 45;
		int l = 0;
		System.out.println("search element"+BinarySearch.search(array, l, r, x));
	}

}
