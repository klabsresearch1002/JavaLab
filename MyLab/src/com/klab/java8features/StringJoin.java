package com.klab.java8features;

import java.util.ArrayList;
import java.util.List;

public class StringJoin {
	public String attachDeleminatorWithString(String deleminator,List<String> elements) {
		
		return String.join(deleminator, elements);
	}
	
	public static void main(String[] args) {
		StringJoin sj = new StringJoin();
		
		List<String> elements = new ArrayList<>();
		elements.add("apple");
		elements.add("orange");
		System.out.println(sj.attachDeleminatorWithString(",", elements));
	}


}
