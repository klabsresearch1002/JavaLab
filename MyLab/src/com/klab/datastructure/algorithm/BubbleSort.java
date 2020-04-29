package com.klab.datastructure.algorithm;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] array) {
		for(int lastunSortedArrayLenth = array.length - 1; lastunSortedArrayLenth > 0;lastunSortedArrayLenth--) {
			for(int  i= 0; i<lastunSortedArrayLenth ; i++) {
				if(array[i]>array[i+1]) {
					swap(array,i,i+1);
				}
			}
		}
		
		return array;
	}
	
	
	
	private static void swap(int array[],int i,int j) {
		
		if(i==j) {
			return;
		}
		int temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
