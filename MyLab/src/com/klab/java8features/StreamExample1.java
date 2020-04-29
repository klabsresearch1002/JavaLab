package com.klab.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import com.klab.javabean.Color;

public class StreamExample1 {
	
	//sequential stream & intermediate operation 
	// most of the operation non-interfering and stateless behaviors
	public void sequentialStream() {
	List<String> myList = Arrays.asList("a1","a2","a3","c1","c2");
	myList.stream().filter(e -> e.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
	
	}
	
	//Problem statement to sum particular color weight using java 8 feature filter-map-reduce
	public int problemIdentifyParticularColorWeight(List<Color> colors,String color) {
		
		return colors.stream()
				.filter(c -> c.getColorName().equalsIgnoreCase(color))
				.mapToInt(c -> c.getWeight())
				.sum();
	}

	public Object sumListOfNumbersBasedOnCriteria(List<Integer> inputNumbers) {
		
		return inputNumbers.stream().filter(e -> e > 4).mapToInt(e -> e).sum();
	}
	
	//Source https://www.journaldev.com/2774/java-8-stream
	public void createStream() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5});
		
		List<Integer> listE = new ArrayList<>();
		for(int i = 0;i<50;i++)
			listE.add(i);
		Stream<Integer> stream2 = listE.stream();
		Stream<Integer> parallelStream = listE.parallelStream();
		
		IntStream intStream = Arrays.stream(new int[] {1,2,3,4,5});
		
		LongStream longStream = Arrays.stream(new long[] {1,2,3,4,5});
		
		DoubleStream doubleStream = Arrays.stream(new double[] {1.5,1.6,1.7});
		
		Stream<String> stream3 = Stream.generate(() -> {return "afdajfkljflks";});
		/*List<String> collectedString = stream3.collect(Collectors.toList());
		System.out.println(collectedString);*/
		
		Stream<String> stream4 = Stream.iterate("abcdef",(i) -> i);
		
		IntStream stream5 = "abcdef".chars();
		
	}
	
	// convert stream to collection and array
	public void convertStreamToCollectionOrArray() {
		
		Stream<Integer> stream = Arrays.stream(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		
		List<Integer> lists = stream.collect(Collectors.toList());
		
		Map<Integer,Integer> maps = stream.collect(Collectors.toMap(i -> i, i -> i*10));
		
		Integer[] arrays = stream.toArray(Integer[]::new);
		
	}
	
	
	public static void main(String[] args) {
		Stream<String> stream3 = Stream.generate(() -> {return "afdajfkljflks";});
		List<String> collectedString = stream3.collect(Collectors.toList());
		System.out.println(collectedString);
	}
	

	
	

}
