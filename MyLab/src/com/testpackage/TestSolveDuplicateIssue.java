package com.testpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestSolveDuplicateIssue {

	public Map<String,Student> solveDuplicateIssue () {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.sameReference(st2);
		
		System.out.println(st2.getId()+" $$$$$ "+st2.getName());
		
		
		List<Student> stdlist = new ArrayList<>();
		stdlist.add(new Student("1","xxxx"));
		stdlist.add(new Student("1","yyyy"));
		
		
		Map<String,Student> map = stdlist.stream().collect(Collectors.toMap(Student::getId,
				Student -> Student,(Student1,Student2) -> Student1));
		for(Map.Entry<String, Student> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName()+""+entry.getValue().getId());
		}
		
return map;
	}

}
