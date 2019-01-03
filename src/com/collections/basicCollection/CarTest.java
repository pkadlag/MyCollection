/*Create few instances of Car and add them to a collection. Have Car implements Comparable interface and override compareTo() to order them by ascending order of make of the Car.*/

package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(new Car("Sumo", "Model 2", 2000, 400000.0));
		set.add(new Car("NANO", "Model 1", 2015, 140000.0));
		set.add(new Car("Tiago", "Model 3", 2018, 500000.0));
		System.out.println(set);
		String expected = "[Car [make=NANO, model=Model 1, year=2015, price=140000.0], "
				+ "Car [make=Sumo, model=Model 2, year=2000, price=400000.0], "
				+ "Car [make=Tiago, model=Model 3, year=2018, price=500000.0]]";
		System.out.println(set);
		assertEquals(expected, set.toString());

	}

}
