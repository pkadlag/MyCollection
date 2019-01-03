package com.collections.collection;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeWriterTest {
	private EmployeeWriter employee;

	@Before
	public void setUp() {
		employee = new EmployeeWriter(21, "Punam", 21000);

	}

	@Test
	public void writerTest() throws IOException {
		String details = employee.toString();
		FileWriter fw = new FileWriter(
				"C:/Collections/textfile/EmployeeFile.txt");
		fw.write(details);
		fw.close();

	}

}
