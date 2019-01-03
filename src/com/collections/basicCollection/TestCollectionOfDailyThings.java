/*Create classes for the below objects with the fields specified below.
Create three different instances for each type and add them to a collection.
Now, read from these collection and print each attribute in console.

Laptop : company, model, operatingSystem, processor
Car : make, model, year, price
Television : company, type (LCD, LED, Plasma), 3D enabled, price
CellPhone : company, model, description, operatingSstem, price
School : name, city, school district, greatSchoolRanking
 */

package com.collections.basicCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCollectionOfDailyThings {
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
		laptop2 = new Laptop("Toshiba", "Model 3", "Windows 10", "Intel");

		car = new Car("NANO", "Model 1", 2015, 140000);
		car1 = new Car("Sumo", "Model 2", 2000, 400000);
		car2 = new Car("Tiago", "Model 3", 2018, 500000);

		television = new Television("LG", "LCD", true, 20000);
		television1 = new Television("Sony", "LED", false, 30000);
		television2 = new Television("Videocon", "LCD", false, 22000);

		cellPhone = new CellPhone("Samsung", "Model 1", "12MegaPixels",
				"Android 7", 20000);
		cellPhone1 = new CellPhone("Moto", "Model 2", "16MegaPixels",
				"Android 8", 14000);
		cellPhone2 = new CellPhone("Apple", "Model 3", "12MegaPixels",
				"Android 7", 50000);

		school = new School("MGV", "Khed", "Pune ", 1);
		school1 = new School("HRM", "Khed", "Pune ", 2);
		school2 = new School("GPP", "Shivajinagar", "Pune ", 3);

	}

	@Test
	public void readListTest() {
		List<Object> list = new ArrayList<>();
		list.add(laptop);
		list.add(laptop1);
		list.add(laptop2);

		list.add(car);
		list.add(car1);
		list.add(car2);

		list.add(television);
		list.add(television1);
		list.add(television2);

		list.add(cellPhone);
		list.add(cellPhone1);
		list.add(cellPhone2);

		list.add(school);
		list.add(school1);
		list.add(school2);

		Iterator<Object> iterator = list.listIterator();
		for (Object o : list) {
			System.out.println(o);

		}

	}

}
