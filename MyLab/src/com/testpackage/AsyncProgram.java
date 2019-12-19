package com.testpackage;

import java.util.concurrent.*;

public class AsyncProgram {
	
	public static void asynExecute() {
		int i = 0;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		System.out.println("completed");
		
	}
	
	public static String asyncTest() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		try {
		es.submit(() -> asynExecute());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			es.shutdown();
		}
		return "async process started";
	}
	
	public static void main (String[] args) {
		
		String msg = asyncTest();
		System.out.println(msg);
	
	}
	

}
