package com.leetcode.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
	
	
	public List<List<Integer>>  threeSum(int[] nums,int target){
		Arrays.sort(nums);
		List<List<Integer>> solutionSet = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if((nums[i]+nums[j]+nums[k]) == target ) {
						List<Integer> set = new ArrayList<>();
						set.add(nums[i]);
						set.add(nums[j]);
						set.add(nums[k]);
						
						if(solutionSet.isEmpty()) {
							solutionSet.add(set);
						}else  {
							if(!solutionSet.contains(set)) {
								solutionSet.add(set);
							}
						}
						
					}
						
						
				}
			}
		}
		System.out.println(solutionSet.toString());
		return solutionSet;
	}
	
}
