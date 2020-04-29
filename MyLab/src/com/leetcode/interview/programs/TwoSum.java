package com.leetcode.interview.programs;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {
	
	/*Approach 1: Brute Force
	The brute force approach is simple. Loop through each element X and find if there is another value that equals to target target − x.*/
	
	public int[] twoSumBruteForce(int[] array,int target) {
		for(int i=0; i<=array.length-1 ; i++) 
		{
			for(int j=0+i;j<=array.length-1;j++) {
				if((array[j] == target - array[i])) {
					return new int[] {i,j};
				}
			}
			}
		return array;
					
	}
	
public int[] twoSumMySolution(int[] inputArray,int target) {
		int[] result = {};
		
		for(int i=0; i<=inputArray.length-1;i++) {
			for(int j=i+1;j<=inputArray.length-1;j++) {
					if((inputArray[i]+inputArray[j]) == target){
						result = new int[] {i,j};
					}
				}
			}
		
		
		
		return result;
	}

}
