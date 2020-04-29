package com.klab.designpatterns.singletonpattern;

import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class SingletonPatternTest {
	
	@Before
	public void setUP() {
		
	}
	
	@Test
	public void testSingletonPattern() {
		SingletonPattern  sp = SingletonPattern.getInstance();
		SingletonPattern sp1 = SingletonPattern.getInstance();
		
		if(sp==sp1) {
			sp.doSomething();
		}
		
		
		assertEquals(sp,sp1);
		
	}
	

}
