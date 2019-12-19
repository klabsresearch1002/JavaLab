package com.mylab.algorithem;

public class BubbleSort {
	private static void bubbleSort(int a[]) {
		int al = a.length;
		for(int i=0;i<al-1;i++) {
			for(int j=0;j<al-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<al;k++) {
			System.out.println(a[k]);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] {5,8,7,3,2,1};// output to be {1,2,3,5,7,8}

		bubbleSort(array);

	}

}
