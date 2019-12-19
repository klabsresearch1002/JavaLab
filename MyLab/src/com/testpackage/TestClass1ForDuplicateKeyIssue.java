package com.testpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass1ForDuplicateKeyIssue {

	public static void main(String[] args) {
		List<Student> stdlist = new ArrayList<>();
		stdlist.add(new Student("1","xxxx"));
		stdlist.add(new Student("1","xxxx"));
		
		
		Map<String,Student> map = stdlist.stream().collect(Collectors.toMap(Student::getId, Student -> Student));
		for(Map.Entry<String, Student> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName()+""+entry.getValue().getId());
		}
		
		
		
		
		
		
		
	}

}
