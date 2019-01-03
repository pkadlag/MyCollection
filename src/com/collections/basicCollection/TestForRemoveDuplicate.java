/*Observe that Set doesn’t accept duplicate objects by writing an ddisplaying the elements in collection.
 For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).


 Company and model  together define the equality for Laptop. If two laptops have same company and model then they are equal.
 Car : make and model together define equality
 Television : company, type (LCD, LED, Plasma) and price together define equality
 CellPhone : company, model and operatingSstem together define equality
 School : name, city and school district together define equality*/

package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestForRemoveDuplicate {

	private Laptop laptop, laptop1, laptop2;
	private Car car, car1, car2;
	private Television television, television1, television2;
	private CellPhone cellPhone, cellPhone1, cellPhone2;
	private School school, school1, school2;

	@Before
	public void SetUp() {

		laptop = new Laptop("Samsung", "Model 1", "Window", "Intel 3");
		laptop1 = new Laptop("Dell", "Model 2", "Windows 7",
				"Intel Celeron 336");
		laptop2 = new Laptop("Samsung", "Model 1", "Window", "Intel 3");

		car = new Car("NANO", "Model 1", 2015, 140000);
		car1 = new Car("Sumo", "Model 2", 2000, 400000);
		car2 = new Car("NANO", "Model 1", 2015, 140000);

		television = new Television("LG", "LCD", true, 20000);
		television1 = new Television("LG", "LCD", true, 20000);
		television2 = new Television("Videocon", "LCD", false, 22000);

		cellPhone = new CellPhone("Samsung", "Model 1", "12MegaPixels",
				"Android 7", 20000);
		cellPhone1 = new CellPhone("Samsung", "Model 1", "12MegaPixels",
				"Android 7", 20000);
		cellPhone2 = new CellPhone("Apple", "Model 3", "12MegaPixels",
				"Android 7", 50000);

		school = new School("MGV", "Khed", "Pune ", 1);
		school1 = new School("HRM", "Khed", "Pune ", 2);
		school2 = new School("HRM", "Khed", "Pune ", 2);
	}

	@Test
	public void TestForRemoveDuplicateFromLaptop() {
		HashSet<Object> set = new HashSet();
		set.add(laptop);
		set.add(laptop1);
		set.add(laptop2);
		System.out.println(set);

	}

	@Test
	public void TestForRemoveDuplicateFromCar() {
		HashSet<Object> set = new HashSet();
		set.add(car);
		set.add(car1);
		set.add(car2);
		System.out.println(set);

	}

	@Test
	public void TestForRemoveDuplicateFromTelevision() {
		HashSet<Object> set = new HashSet();
		set.add(television);
		set.add(television1);
		set.add(television2);
		System.out.println(set);

	}

	@Test
	public void TestForRemoveDuplicateFromCellPhone() {
		HashSet<Object> set = new HashSet();
		set.add(cellPhone);
		set.add(cellPhone1);
		set.add(cellPhone2);
		System.out.println(set);

	}

	@Test
	public void TestForRemoveDuplicateFromSchool() {
		HashSet<Object> set = new HashSet();
		set.add(school);
		set.add(school1);
		set.add(school2);
		System.out.println(set);

	}

}