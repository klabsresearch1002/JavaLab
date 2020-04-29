package com.klab.mockito.junittest;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.testpackage.Student;
import com.testpackage.TestSolveDuplicateIssue;


@RunWith(MockitoJUnitRunner.class)
public class SolveDuplicateIssueTest {
	
	@InjectMocks
	private TestSolveDuplicateIssue testSolveDuplicateIssue;
	private Map<String,Student> expectedResult;
	
	@Before
	public void setUP() {
		expectedResult = new HashMap<>();
		expectedResult.put("1", new Student("1","xxxx"));
		
	}
	
	@Test
	public void solveDuplicateIssueTest() {
		Map<String,Student> actualResult = testSolveDuplicateIssue.solveDuplicateIssue();
		assertEquals(expectedResult.get("1").getName(), actualResult.get("1").getName());
		
	}

}
