package com.mylab.datastructure.array;

public class ArrayRotationA {
	
	public static void rotateArray(int[] a,int d,int len) {
		int[] rotateArray = new int [len];
		int rotateValueIndex = len - d;
		int index = 0;
		for(int i = d;i<=(len-1);i++) {
			rotateArray[index] = a[i];
			index++;
		}
		
		for(int j=0;j<d;j++) {
			rotateArray[rotateValueIndex] = a[j];
			rotateValueIndex++;
		}
		
		for(int k=0;k<len;k++) {
			System.out.println(rotateArray[k] + "index" + k);
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int r = 2;
		int len = array.length;
		rotateArray(array,r,len);

	}

}
