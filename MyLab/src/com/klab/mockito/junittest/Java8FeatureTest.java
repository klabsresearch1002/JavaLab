package com.klab.mockito.junittest;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.klab.java8features.Formula;
import com.klab.java8features.FormulaImplementation;
import com.klab.java8features.LambdaExpressions;

@RunWith(MockitoJUnitRunner.class)
public class Java8FeatureTest {
	
	@InjectMocks
	private LambdaExpressions lambdaExpressions;
	
	
	@Before
	public void setUP() {
	}
	
	@Test
	public void newInterfaceFeatureTest() {
		Formula formulaInterface = new FormulaImplementation();
		double actualResult = formulaInterface.calculate(9);
		assertEquals(Double.doubleToLongBits(3),Double.doubleToLongBits(actualResult));
		
		double actualResult1 = formulaInterface.sqrt(25);
		assertEquals(Double.doubleToLongBits(5),Double.doubleToLongBits(actualResult1));
		
	}


}
