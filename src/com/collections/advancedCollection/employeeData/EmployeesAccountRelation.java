package com.collections.advancedCollection.employeeData;

public class EmployeesAccountRelation {

	private EmployeeInformation employeeInformation;
	private MMASavingsAccount mmASavingsAccount;
	
	public EmployeesAccountRelation(EmployeeInformation employeeInformation,
			MMASavingsAccount mmASavingsAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmASavingsAccount = mmASavingsAccount;
	}

	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public void setEmployeeInformation(EmployeeInformation employeeInformation) {
		this.employeeInformation = employeeInformation;
	}

	public MMASavingsAccount getMmSavingsAccount() {
		return mmASavingsAccount;
	}

	public void setMmSavingsAccount(MMASavingsAccount mmSavingsAccount) {
		this.mmASavingsAccount = mmSavingsAccount;
	}

	@Override
	public String toString() {
		return "EmployeeAccountRelation [employeeInformation="
				+ employeeInformation + ", mmSavingsAccount="
				+ mmASavingsAccount + "]";
	}
	
	
	
	
	
}