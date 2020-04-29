package com.klab.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListDS {
	
	class Employee{
		String name;
		
		public Employee(String name) {
			this.name = name;
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayListDS.Employee emp1 = new ArrayListDS().new Employee("jone");
		ArrayListDS.Employee emp2 = new ArrayListDS().new Employee("alex");
		
		List<Employee> list = new ArrayList<>();
		
		list.add(emp1);
		
		
		
		
	}

}
