package com.collections.collection;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReaderTest {

	private EmployeeReader employeeReader;

	@Before
	public void setUp() {
		employeeReader = new EmployeeReader();

	}

	@Test
	public void TestReader() throws IOException {
		FileReader fw = new FileReader(
				"C:/Collections/textfile/EmployeeFile.txt");
		String actual = employeeReader.displayEmployee(fw);
		String expected = "Employee [id=21, Name=Punam, salary=21000.0]";
		assertEquals(expected, actual);

	}

}
