package com.klab.string.programs;

//This class contains many way of implementation to reverse string 

public class ReverseStringInDifferentWay {
	
	//using byte array reverse string
	public static void reverseString(String input) {
		
		System.out.println("using byte array reverse string**");
		byte[] stringAsbyteArray = input.getBytes();
		
		byte[] result = new byte[stringAsbyteArray.length];
		
		for(int i=0;i<stringAsbyteArray.length;i++) {
			result[i] = stringAsbyteArray[stringAsbyteArray.length-i-1];
		}
		
		System.out.println(new String(result));
	}
	
	//using reverse function 
	public static void reverseUsingReverseFunction(String input) {
		System.out.println("using reverse function **");
		StringBuilder reverse = new StringBuilder();
		reverse.append(input).reverse();
		System.out.println(reverse);
	}
	
	//using chararray convert string to charArray and reverse the string
	public static void reverseStringUsingToCharArray(String input) {
		System.out.println("using chararray convert string to charArray and reverse the string***");
		char[] charArray = input.toCharArray();
		StringBuilder reverse = new StringBuilder();
		
		System.out.println(charArray.);
		
		reverse.append(charArray.toString()).reverse();
		System.out.println(reverse.toString());
		
	}
	
	public static void main(String args[]) {
		//reverseString("reverse");
		//reverseUsingReverseFunction("reverse");
		reverseStringUsingToCharArray("reverse");
	}

}
