/*Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection keeps these elements in a natural order.*/

package com.collections.basicCollection;

public class StudentsNamesNaturalOrder implements
		Comparable<StudentsNamesNaturalOrder> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentsNamesNaturalOrder [name=" + name + "]";
	}

	public StudentsNamesNaturalOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentsNamesNaturalOrder(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		StudentsNamesNaturalOrder other = (StudentsNamesNaturalOrder) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(StudentsNamesNaturalOrder arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}

}
