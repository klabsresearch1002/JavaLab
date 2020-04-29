package com.klab.mockito.junittest;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.klab.java8features.StreamExample1;
import com.klab.javabean.Color;

@RunWith(MockitoJUnitRunner.class)
public class StreamExample1Test {
	@InjectMocks
	private StreamExample1 streamExample1;
	private List<Color> inputArgument1;
	private List<Integer> inputNumbers;
	
	@Before
	public void setUP() {
		Color sourceElement1 = new Color();
		sourceElement1.setWeight(10);
		sourceElement1.setColorName("Red");
		
		Color sourceElement2 = new Color();
		sourceElement2.setWeight(10);
		sourceElement2.setColorName("Red");
		
		Color sourceElement3 = new Color();
		sourceElement3.setWeight(30);
		sourceElement3.setColorName("Orange");
		
		inputArgument1 = Arrays.asList(sourceElement1,sourceElement2,sourceElement3);
		
		inputNumbers = Arrays.asList(5,5,5,5,5,5);
		
	}
	
	@Test
	public void sequentialStreamTest() {
		streamExample1.sequentialStream();
	}
	
	@Test
	public void problemIdentifyParticularColorWeight() {
		int expectedResult = 20;
		String inputArgument2 = "Red";
		int actualResult = streamExample1.problemIdentifyParticularColorWeight(inputArgument1, inputArgument2);
		
		assertEquals(expectedResult,actualResult);
		
	}	
	
	@Test
	public void sumListOfNumbersBasedOnCriteria() {
		assertEquals(30,streamExample1.sumListOfNumbersBasedOnCriteria(inputNumbers));
	}
	
	@Test
	public void createStreamTest() {
		streamExample1.createStream();
	}
	
	

}
