package com.testpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteINMemory {
	
	public static void writeFileINMemory() {
		try {
			File temp = File.createTempFile("opplan", ".csv");
			temp.deleteOnExit();
			 BufferedWriter br = new BufferedWriter(new FileWriter(temp));
			 br.write("header1 header2 header3");
			 br.close();
			 
			 BufferedReader reader = new BufferedReader(new FileReader(temp));
			 String line = null;
			 
			 while((line = reader.readLine()) != null) {
				 System.out.println(line);
			 }
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		FileWriteINMemory.writeFileINMemory();
	}

}
