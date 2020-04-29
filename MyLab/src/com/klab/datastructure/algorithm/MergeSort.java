package com.klab.datastructure.algorithm;

public class MergeSort {

	public void mergeSort(int[] input,int start,int end) {
		if(end - start < 2) {
			return;
		}
		
		int mid = (start + end)/2;
		
		mergeSort(input,start,mid);//left side sort
		
		mergeSort(input,mid,end);//right side sort
		
		merge(input,start,mid,end);
	}

	private void merge(int[] input, int start, int mid, int end) {
		
		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		while(i < mid && j < end) {
			temp[tempIndex] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		System.arraycopy(input, i,input, start+tempIndex, mid-1);
		System.arraycopy(temp,0,input,start,tempIndex);
		
		
	}
}
