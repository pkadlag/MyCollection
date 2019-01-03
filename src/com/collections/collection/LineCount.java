/*A Java LineCount Application:
accept the complete path of a file from user and count the number of lines in that file and print it on the console.*/

package com.collections.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	public static int display(String string) throws IOException {

		File file = new File(string);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int count = 0;
		while (bufferedReader.readLine() != null) {
			count++;
		}
		return count;
	}
}
