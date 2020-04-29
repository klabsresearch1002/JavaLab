package com.klab.java8features;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;


public class FuntionOfJava8 {
	
	// without java 8 function
	static int increment(int num) {
		return num + 1;
	}
	//Using java 8 feature
	static Function<Integer,Integer> incrementByOne = num -> num + 1;
	
	static Function<Integer,Integer> multiplyBy10 = num -> num *10;
	
	//FunctionChaining
	
	static Function<Integer,Integer>  incrementByOneandMultiplyBy10 = 
			incrementByOne.andThen(multiplyBy10);
	
	static Function<List<Integer>,Map<Integer,Integer>> converTPair = 
			fruits -> fruits.stream().collect(Collectors.toMap(i ->i, i -> i*10));
			
	static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = 
			(numberToincrement,numberToMultiply) -> (numberToincrement + 1) * numberToMultiply;
	
	
	public static void main(String[] args) {
		System.out.println(increment(1));
		
		int increment = incrementByOne.apply(1);
		System.out.println(increment);
		
		int multiply = multiplyBy10.apply(increment);
		
		System.out.println(multiply);
		
		System.out.println(incrementByOneandMultiplyBy10.apply(1));
		
		List<Integer> elements = Arrays.asList(1,2,3,4,5);
		
		System.out.println(converTPair.apply(elements));
		
		int resultOfBiFunction = incrementByOneAndMultiplyBiFunction.apply(1, 10);
		System.out.println("resultOfBiFunction"+resultOfBiFunction);
		
		
	}

}
