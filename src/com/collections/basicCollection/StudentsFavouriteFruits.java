/*Create a simple map to store all of our class students’ names and their favorite fruits. Try to get their favorite fruit by giving their name. Also, list all the names and their favorite fruits saperately.*/

package com.collections.basicCollection;

public class StudentsFavouriteFruits implements
		Comparable<StudentsFavouriteFruits> {
	private String name, fruits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public StudentsFavouriteFruits(String name, String fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}

	public StudentsFavouriteFruits() {
		super();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruits == null) ? 0 : fruits.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsFavouriteFruits other = (StudentsFavouriteFruits) obj;
		if (fruits == null) {
			if (other.fruits != null)
				return false;
		} else if (!fruits.equals(other.fruits))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(StudentsFavouriteFruits arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}

}
