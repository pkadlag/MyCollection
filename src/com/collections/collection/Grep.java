/*A Java grep Application: 
There is a useful utility in Unix called grep. You can use grep to list the lines in a text file that contain a certain strings. 
Here, In this assignment, You will write the Java version of grep The user will input from the command line the search string and file name The output of your program will be the line numbers AND the lines in which the string occurs. If it does not find the string then a message is displayed to show that the string was not found.*/

package com.collections.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public String findingString(String string, String word) throws IOException {
		FileReader fileReader = new FileReader(string);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = "";
		String newLine = "";
		int count = 0;
		while ((line = bufferedReader.readLine()) != null) {
			count++;
			String[] splitWord = line.split(" ");
			for (int i = 0; i < splitWord.length; i++) {
				if (splitWord[i].equals(word)) {
					newLine += count + " " + line + "\n";
				}
			}
		}
		System.out.println(newLine);
		return newLine;
	}
}
