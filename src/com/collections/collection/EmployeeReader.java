/*Create an employee class with id, name and salary.
Create a class with main() write a code to persist the object in the file.
Create another class with main() write code to read the object from the file.
run the first main(), this should write the object in file succesfullky.
now run the second main(), this should read the object from the file and display it on the console screen.
HINT:- Use Serialization and Deserialization*/
		
package com.collections.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeReader {
	public String displayEmployee(FileReader fw) throws IOException {
		String line = "";
		String newLine = "";
		BufferedReader br = new BufferedReader(fw);
		while ((newLine = br.readLine()) != null) {
			line += newLine;
		}
		return line;
	}
}
