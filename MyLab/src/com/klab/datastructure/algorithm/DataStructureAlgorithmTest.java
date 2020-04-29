package com.klab.datastructure.algorithm;

import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class DataStructureAlgorithmTest {
		
	@Before
	public void setUP() {
		
	}
	
	@Test
	public void testBubbleSort() {
		int[] expectedResult = {-15,3,15,25,30};
		int[] array = {25,-15,30,3,15};
		int[] actualResult = BubbleSort.bubbleSort(array);
		
		assertArrayEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testSelectionSort() {
		int[] sourceArray = {30,-15,30,3,15};
		int[] expectedResult = {-15,3,15,30,30};
		int[] actualResult = SelectionSort.selectionSort(sourceArray);
		
		assertArrayEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testInsertionSort() {
		int[] sourceArray = {6,5,8,2,7,9,1};
		int[] expectedResult = {1,2,5,6,7,8,9};
		int[] actualResult = InsertionSort.insertionSort(sourceArray);
		
		assertArrayEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testRecursionFactorial() {
		int expectedResult = 6;
		int sourceValue = 3;
		int actualResult = Recursion.factorial(sourceValue);
		
		assertEquals(expectedResult,actualResult);
	}

}
