package com.mylab.datastructure.array;

public class ArrayRotation {
	
	private static int[] arrayRotation(int[] array,int n,int d) {
			
		for(int i=0;i<d;i++) {
			int temp = array[0];
			int j;
			for(j = 0;j<n-1;j++) {
				array[j] = array[j+1];
			}
			array[j] = temp;	
		}
		
		return array;
	}
	
	private static void printRotatedArray(int[] array, int n) {
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void main (String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		int d = 2;
		int n = array.length;
		
		array = ArrayRotation.arrayRotation(array, n, d);
		ArrayRotation.printRotatedArray(array,n);
		
	}

}
