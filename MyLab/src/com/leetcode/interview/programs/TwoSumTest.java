package com.leetcode.interview.programs;

import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;;

@RunWith(MockitoJUnitRunner.class)
public class TwoSumTest {
	
	private TwoSum tSum;
	@Before
	public void setUP() {
		tSum = new TwoSum ();
	}
	
	@Test
	public void twoSumBruteForceTest() {
		int[] inputArray = new int[] {1,2,3,4,5,6};
		int target = 11;
		int [] expectedResult = {4,5};
		int[] actualSolution = tSum.twoSumBruteForce(inputArray, target);
		
		assertEquals(expectedResult[0],actualSolution[0]);
		assertEquals(expectedResult[1],actualSolution[1]);
		
	}
	
	@Test
	public void twoSumMySolutionTest() {
		int[] inputArray = new int[] {1,2,3,4,5,6};
		int target = 11;
		int [] expectedResult = {4,5};
		int[] actualSolution = tSum.twoSumMySolution(inputArray, target);
		
		assertEquals(expectedResult[0],actualSolution[0]);
		assertEquals(expectedResult[1],actualSolution[1]);
		
	}
	
	@Test
	public void twoSumMySolutionTest1() {
		int[] inputArray = new int[] {3,3};
		int target = 6;
		int [] expectedResult = {0,1};
		int[] actualSolution = tSum.twoSumMySolution(inputArray, target);
		
		assertEquals(expectedResult[0],actualSolution[0]);
		assertEquals(expectedResult[1],actualSolution[1]);
		
	}

}
