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

public class Laptop {
	private String company, model, operatingSystem, processor;

	public Laptop(String company, String model, String operatingSystem,
			String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		return true;
	}

}
