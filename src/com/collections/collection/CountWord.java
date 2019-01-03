/*A Java LineCount Application:
accept the complete path of a file from user and count the number of lines in that file and print it on the console.*/

package com.collections.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWord {
	int a = 0;
	int b = 0;

	public int getWordsCount() {
		FileReader fr = null;
		try {
			fr = new FileReader("C:/Collections/wordCount.txt");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		BufferedReader br = new BufferedReader(fr);

		String line = "", str = "";
		try {
			while ((line = br.readLine()) != null) {
				str += line + " ";
				b++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			a++;

		}
		System.out.println("File has " + a + "Words in the file");
		return a;

	}
}
