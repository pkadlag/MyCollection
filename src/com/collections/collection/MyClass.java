/*create a class "MyClass".
create 5 different objects of it.
add them in an arraylist.
store arraylist in file.
Now open a file, read arraylist and display all objects.
HINT:- Use Serialization and Desrialization with Collection*/

package com.collections.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;

	public MyClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public MyClass() {

	}

	public void check(ArrayList<MyClass> classList)
			throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:/myclass/Myclass.txt"));
		oos.writeObject(classList);
		oos.close();

	}

	public ArrayList<MyClass> read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"C:/myclass/Myclass.txt"));
		ArrayList<MyClass> mc = (ArrayList<MyClass>) ois.readObject();
		ois.close();
		return mc;

	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
