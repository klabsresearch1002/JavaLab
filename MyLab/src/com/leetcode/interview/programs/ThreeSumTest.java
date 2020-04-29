package com.leetcode.interview.programs;

import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class ThreeSumTest {
	
	@InjectMocks
	ThreeSum threeSum;
	
	@Test
	public void testThreesum() {
		int[] input = new int[] {-1,0,1,2,-1,-4};
		int target = 0;
		
		List<List<Integer>> expectedResult = new ArrayList<>();
		List<Integer> es1 = new ArrayList<>();
		es1.add(-1);
		es1.add(0);
		es1.add(1);
		
		List<Integer> es2 = new ArrayList<>();
		es2.add(-1);
		es2.add(-1);
		es2.add(2);
		
		expectedResult.add(es1);
		expectedResult.add(es2);
		
		List<List<Integer>> actualResult = threeSum.threeSum(input, target);
		assertEquals(expectedResult, actualResult);
	}

}
