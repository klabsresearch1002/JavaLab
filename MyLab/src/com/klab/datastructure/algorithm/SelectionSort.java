package com.klab.datastructure.algorithm;

public class SelectionSort {
	
	public static int[] selectionSort(int[] sourceArray) {
		for(int largestIndex = sourceArray.length - 1; largestIndex > 0 ; largestIndex --) {
			int indexOfLargestValue = 0;
			for(int i = indexOfLargestValue + 1; i <= largestIndex; i++) {
				if(sourceArray[i] > sourceArray[indexOfLargestValue]) {
					indexOfLargestValue = i;
				}
			}
			swap(indexOfLargestValue,largestIndex,sourceArray);
		}
		return sourceArray;
	}
	
	private static void swap(int swapElement1,int swapElement2,int[] sourceArray) {
		
		int temp = sourceArray[swapElement1];
		sourceArray[swapElement1] = sourceArray[swapElement2];
		sourceArray[swapElement2] = temp;
	}
}
