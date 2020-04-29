package com.klab.datastructure.algorithm;

public class InsertionSort {
	public static int[] insertionSort(int[] sourceArray) {
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < sourceArray.length; firstUnsortedIndex++) {
			int newElement = sourceArray[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i>0 && sourceArray[i-1] > newElement;i--) {
				sourceArray[i] = sourceArray[i-1];
			}
			sourceArray[i] = newElement;
		}
		
		
		
		return sourceArray;
	}

}
