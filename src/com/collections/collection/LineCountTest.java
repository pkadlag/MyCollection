package com.collections.collection;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	private LineCount countlinesNumber;

	@Before
	public void setUp() {
		countlinesNumber = new LineCount();
	}

	@Test
	public void testForToCheckNumberOfLines() {
		try {
			int actual = LineCount.display("C:/Collections/CountFile.txt");
			assertEquals(3, actual);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
