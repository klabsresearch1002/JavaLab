package com.mylab.algorithem;

public class InsertionSort {
	
	public static void insertionSort(int[] list) {
		int i,j,key,temp;
		for(i=1;i<list.length;i++) {
			key = list[i];
			j=i-1;
			while(j>=0 && key<list[j]) {
				temp = list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
				j--;
				
			}
			
		}
		
		for(int k=0;k<list.length;k++) {
			System.out.println(list[k]);
		}
		
	}

	public static void main(String[] args) {
		int[] inputArray = new int[] {5,8,1,3,9,6};
		insertionSort(inputArray);

	}

}
