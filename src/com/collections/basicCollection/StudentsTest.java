package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Test;

public class StudentsTest {

	@Test
	public void test() {
		LinkedHashSet<Students> set = new LinkedHashSet<Students>();
		set.add(new Students("Punam"));
		set.add(new Students("Shital"));
		set.add(new Students("ganu"));
		set.add(new Students("Tushar"));
		set.add(new Students("Tejas"));
		set.add(new Students("Vinayak"));

		System.out.println(set);
		String expected = "[Students [name=Punam],"
				+ " Students [name=Shital]," + " Students [name=ganu],"
				+ " Students [name=Tushar]," + " Students [name=Tejas],"
				+ " Students [name=Vinayak]]";
		assertEquals(expected, set.toString());
	}

}
