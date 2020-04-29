package com.testpackage;

import java.util.ArrayList;
import java.util.List;

import com.klab.javabean.Color;

public class GeneralImpl {
	
	

	public static void main(String[] args) {
		extracted();
		
	
	}

	private static void extracted() {
		List<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		System.out.println("hhhhhhhh");
		
		c.add("four");
		c.add("five");
		c.add("six");
		c.add("seven");
		c.add("eight");
		
		for(String item : c) {
			System.out.println(item);
		}
		System.out.println(c);
		
		String col = "Blue";
		
		Color color = new Color();
		//color.setColorName("Red");
		
		System.out.println("!!!!"+Integer.valueOf(col.hashCode()));
		
		color.setColorName(col);
		
		System.out.println("****"+color.getColorName());
		
		col = "Red";
		
		System.out.println("@@@@@"+Integer.valueOf(col.hashCode()));
		
		System.out.println("----"+color.getColorName());
		
		col = "Blue";
		
		System.out.println("!!!!"+Integer.valueOf(col.hashCode()));
		
		
		if(color != null) {
		
		color.getColorName();
		}
		
		
		
	}
}
