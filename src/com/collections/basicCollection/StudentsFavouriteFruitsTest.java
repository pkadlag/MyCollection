package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class StudentsFavouriteFruitsTest {
	@Test
	public void testTogetFavouriteFruitsByGivingName() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Punam", "Mango");
		map.put("Akshay", "Banana");
		map.put("Shital", "PineApple");
		map.put("Ashvini", "Strawberry");
		map.put("Minu", "orange");
		map.put("Praji", "Apple");

		String expected = "{Praji=Apple, Akshay=Banana, Shital=PineApple, Ashvini=Strawberry, Minu=orange, Punam=Mango}";
		assertEquals(expected, map.toString());
	}

	@Test
	public void testT0FindGivenName() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Punam", "Mango");
		map.put("Akshay", "Banana");
		map.put("Shital", "PineApple");
		map.put("Ashvini", "Strawberry");
		map.put("Minu", "orange");
		map.put("Praji", "Apple");

		String expected = "Mango";
		assertEquals(expected, map.get("Punam").toString());
	}
}
