package com.klab.java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsFeature1 {
	
	//1. Integer Stream
	public static void integerStream() {
		IntStream
		.range(1, 11)
		.forEach(System.out::println);
	}
	
	//2. Integer Stream with skip
	public static void integerStreamWithSkip() {
		IntStream
		.range(1, 11)
		.skip(5)
		.forEach(System.out::println);
	}
	
	//3. Integer stream with sum
	public static void integerStreamWithSum() {
		System.out.println(IntStream
		.range(1, 11)
		.sum());
		
	}
	
	//4.Stream.of, sorted findFirst
	
	public static void sortAndFindFirst() {
		Stream.of("Ava","Aneri","Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
	}
	
	//5. Stream from Array, sort, filter and print
	
	public static void streamFromArray() {
		String[] names = {"Al","Aankit","Kushal","Brent","Sarika","amanda","Hans","Shivika","Sarah"};
		Arrays.stream(names)
		.filter(x -> x.startsWith("S") )
		.sorted()
		.forEach(x -> System.out.println(x));
	}
	
	// 6. average of squares of an int array
	public static void average() {
		Arrays.stream(new int[] {2,2,2})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
	}
	
	// 7. Stream from List, filter and print
	public static void streamFromList() {
		List<String> names = Arrays.asList("Al","Aankit","Kushal","Brent","Sarika","amanda","Hans","Shivika","Sarah");
		names.parallelStream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(x -> System.out.println(x));
	}
	
	// 8. Stream rows from text file, sort, filter, and print
	public static void fileReadingWithStreamOperations1() {
		try {
			Stream<String> bands = Files.lines(Paths.get("C://Users//kjayar15//MyLearning//MyLab//Resources//bands.txt"));
			bands.parallel()
			.sorted()
			.filter(x -> x.length() > 13)
			.forEach(x -> System.out.println(x));
			
			bands.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 9. Stream rows from text file and save to List
	public static void readFileAndSaveToList() {
		try {
			
			System.out.println("<==Stream rows from text file and save to List==>");
			List<String> bands = Files.lines(Paths.get("C://Users//kjayar15//MyLearning//MyLab//Resources//bands.txt"))
					.parallel()
					.filter(x -> x.contains("jit"))
					.collect(Collectors.toList());
			bands.forEach(x -> System.out.println(x));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 10. Stream rows from CSV file and count
	public static void readCsvFileAndCount() {
		try {
			System.out.println("<==10. Stream rows from CSV file and count==>");
			Stream<String> datas = Files.lines(Paths.get("C://Users//kjayar15//MyLearning//MyLab//Resources//data.csv"));
			int rowCount = (int) datas.parallel()
					.map(x -> x.split(","))
					.filter(x -> x.length == 3)
					.count();
			System.out.println(rowCount);
			datas.close();
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//11. Stream rows from CSV file, parse data from rows
	public static void parseDataFromCSV() {
		try {
			System.out.println("<==11. Stream rows from CSV file, parse data from rows==>");
			Stream<String> lines = Files.lines(Paths.get("C://Users//kjayar15//MyLearning//MyLab//Resources//data.csv"));
			
			lines.parallel()
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0]+","+x[1]+","+x[2]));
			
			lines.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 12. Stream rows from CSV file, store fields in HashMap
	public static void readCSVandStoreFieldsInHashMap() {
		try {
			Map<Integer,String> keyValuePair = new HashMap<>();
			Stream<String> lines = Files.lines(Paths.get("C://Users//kjayar15//MyLearning//MyLab//Resources//data.csv"));
			
			lines.parallel()
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(x -> Integer.parseInt(x[1]),x -> x[0] ))
			.forEach((k,v) -> System.out.println("Key ="+k+" Value ="+v));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//13.Reduction sumUsing
	public static void sumUsingReduction() {
		int total = Stream.of(2,2,2,2)
				.reduce(0,(a,b) -> a+b);
		System.out.println(total);
	}
	
	//14.Find longest string using Reduction
	
	public static void longestStringUsingRed() {
		System.out.println("<==14.Find longest string using Reduction==>");
		Optional<String> longestString = Stream.of("Al","Aankit","Kushal","Brent","Sarika","amanda","Hans","Shivika","Sarah")
				.reduce((word1,word2) -> word1.length() > word2.length() ? word1:word2);
		
		System.out.println(longestString);
	}
	
	
	
	
	public static void main(String[] args) {
		integerStream();
		
		integerStreamWithSkip();
		
		integerStreamWithSum();
		
		sortAndFindFirst();
		
		streamFromArray();
		
		average();
		
		streamFromList();
		
		fileReadingWithStreamOperations1();
		
		readFileAndSaveToList();
		
		readCsvFileAndCount();
		
		parseDataFromCSV();
		
		readCSVandStoreFieldsInHashMap();
		
		sumUsingReduction();
		
		longestStringUsingRed();
		
		longestStringUsingRed();
		
	}

}
