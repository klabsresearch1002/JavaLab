package com.mylab.algorithem;

public class SelectionSort {
	private static void selectionSort(int[] inputArray) {
		int al = inputArray.length;
		
		for(int i=0;i<al;i++) {
			int minIndex = i;
			for(int j=i+1;j<al;j++) { 
				if(inputArray[j]<inputArray[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = inputArray[i];
			inputArray[i]=inputArray[minIndex];
			inputArray[minIndex]=temp;
	}
		for(int k=0;k<al;k++)
			System.out.println(inputArray[k]);
}

	public static void main(String[] args) {
		int[] inputArray = new int[] {4,6,2,1,10};
		selectionSort(inputArray);

	}

}
