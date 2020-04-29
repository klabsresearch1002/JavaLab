package com.klab.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative {
	
	static void imperativeWayImplementation(List<Person> people,Enum e) {
		
		List<Person> malePeople = new ArrayList<>();
		for(Person p : people) {
			if(p.gender.equalsIgnoreCase(e.name())) {
				malePeople.add(p);
			}
		}
		
		System.out.println("////imperative");
		
		for(Person mp : malePeople) {
			System.out.println(mp);
		}
 		
		
	}
	
	static void declarativeWayImplementationJava8(List<Person> people,Enum e) {
		
		System.out.println("////declarative");
		
		people.stream().filter(person -> e.name().equalsIgnoreCase(person.gender)).forEach(System.out::println);
		
		System.out.println("Collecting Person as list");
		
		List<Person> mp = people.stream().filter(person -> e.name().equalsIgnoreCase(person.gender)).collect(Collectors.toList());
		mp.forEach(System.out::println);
	}
	
	static class Person{
		String name;
		String gender;
		
		public Person(String name,String gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
		
	}
	
	 enum Gender{
		FEMALE,MALE
	}
	 
	 public static void main(String[] args) {
		 List<Person> people = new ArrayList<>();
		 people.add(new Person("kumar","MALE"));
		 people.add(new Person("Anand","MALE"));
		 people.add(new Person("Anbu","MALE"));
		 people.add(new Person("Mokshi","FEMALE"));
		 
		 imperativeWayImplementation(people,Gender.MALE);
		 declarativeWayImplementationJava8(people,Gender.MALE);
			 
		 }
	 

}
