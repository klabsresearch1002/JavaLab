package com.mylab.datastructure.array;

public class ArraySum {
	
	public static void sumOfarray(int[] array) {
		int total =0;
		for(int index = 0;index<array.length;index++) {
			total=total+array[index];
		}
		
		System.out.println("total "+total);
	}

	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		sumOfarray(array);
	}

}
