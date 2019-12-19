package com.mylab.datastructure.array;

public class Array4X2Dimension {
	public static void create4X2DimensionArray() {
		int[] [] array = new int [4] [2];
		int count = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				array[i][j] = count++;	
			}
		}
		
		print2Darray(array,4,2);
	}
	
	public static void print2Darray(int[][] arr,int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(" " + arr[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		create4X2DimensionArray();

	}

}
