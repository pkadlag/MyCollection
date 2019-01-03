package com.collections.collection;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
	private MyClass myclass, myclass1, myclass2, myclass3, myclass4;
	private ArrayList<MyClass> classList;

	@Before
	public void setUp() {
		myclass = new MyClass(21, "Punam", 50000);
		myclass1 = new MyClass(22, "Minu", 51000);
		myclass2 = new MyClass(201, "Shital", 50200);
		myclass3 = new MyClass(24, "Aboli", 50030);
		myclass4 = new MyClass(212, "Praji", 50004);

		classList = new ArrayList<MyClass>();
		classList.add(myclass);
		classList.add(myclass1);
		classList.add(myclass2);
		classList.add(myclass3);
		classList.add(myclass4);

	}

	@Test
	public void testToCheckFile() throws FileNotFoundException, IOException {
		MyClass file = new MyClass();
		file.check(classList);
	}

	@Test
	public void testToCheckClass() throws ClassNotFoundException, IOException {
		MyClass classCheck = new MyClass();
		ArrayList<MyClass> class1 = classCheck.read();
		System.out.println(class1);

	}

}
