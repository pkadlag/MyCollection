package com.collections.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountWordTest {

	@Test
	public void testForToCheckNumberOfWordsInLine() {
		CountWord words = new CountWord();
		int actual = words.getWordsCount();
		assertEquals(6, actual, 0);
	}

}
