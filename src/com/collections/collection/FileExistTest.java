package com.collections.collection;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileExistTest {

	@Test
	public void testToCheckFileExists() {
		FileExist fileCheck = new FileExist("C:/Collections/File_Punam.txt");
		boolean expected = fileCheck.isFileExists(fileCheck);
		boolean actual = true;
		assertTrue(expected == actual);

	}

	@Test
	public void testToCheckFileDoesNotExists() {
		FileExist fileCheck = new FileExist("C:/Collections/FilePunam.txt");
		boolean expected = fileCheck.isFileExists(fileCheck);
		boolean actual = false;
		assertFalse(expected == actual);
	}
}
