package com.testpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileRead {

	public static void main(String[] args) {
		File path = new File("C:\\Users\\kjayar15\\Documents\\Iteration\\Iteration_7.8.2\\MF_NA_UM_CMMSORDERS.txt");
		try(final InputStreamReader isreader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8);
				final BufferedReader reader = new BufferedReader(isreader)) {
			final String fileSequenceNumberFromHeader = reader.readLine();
			System.out.println(fileSequenceNumberFromHeader);
			if (fileSequenceNumberFromHeader != null) {
				String header = fileSequenceNumberFromHeader.substring(34, 38);
				System.out.println(header);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
