package com.collections.collection;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class GrepTest {
	private Grep grep;

	@Test
	public void test() throws IOException {
		grep = new Grep();
		grep.findingString("C:/Collections/grepFile.txt", "Punam");
	}

}
