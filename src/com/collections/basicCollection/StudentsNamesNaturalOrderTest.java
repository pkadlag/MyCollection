package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class StudentsNamesNaturalOrderTest {

	@Test
	public void test() {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(new StudentsNamesNaturalOrder("Punam"));
		set.add(new StudentsNamesNaturalOrder("Shital"));
		set.add(new StudentsNamesNaturalOrder("ganu"));
		set.add(new StudentsNamesNaturalOrder("Vinayak"));
		set.add(new StudentsNamesNaturalOrder("Tushar"));
		set.add(new StudentsNamesNaturalOrder("Tejas"));

		String expected = "[StudentsNamesNaturalOrder [name=Punam],"
				+ " StudentsNamesNaturalOrder [name=Shital],"
				+ " StudentsNamesNaturalOrder [name=Tejas],"
				+ " StudentsNamesNaturalOrder [name=Tushar],"
				+ " StudentsNamesNaturalOrder [name=Vinayak],"
				+ " StudentsNamesNaturalOrder [name=ganu]]";
		System.out.println(set);
		assertEquals(expected, set.toString());
	}

}
