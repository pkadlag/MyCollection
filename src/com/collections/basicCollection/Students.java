/*Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.*/

package com.collections.basicCollection;

public class Students implements Comparable<Students> {
	private String name;

	public String getName() {
		return name;
	}

	public Students(String name) {
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
		Students other = (Students) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Students arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}

}
