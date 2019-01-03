package com.collections.advancedCollection.employeeData.employeeTest;

/**
 * Employee_information object
 *         and MMASaving_Account object belongs to a same entity assuming there
 *         are more than 5 entities how will you store the objects preserving
 *         the relation between them.
 */

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.collections.advancedCollection.employeeData.EmployeesAccountRelation;
import com.collections.advancedCollection.employeeData.EmployeeInformation;
import com.collections.advancedCollection.employeeData.MMASavingsAccount;

public class EmployeeInformationTest {

	private EmployeeInformation employeeInformation1;
	private EmployeeInformation employeeInformation2;
	private EmployeeInformation employeeInformation3;
	private EmployeeInformation employeeInformation4;
	private EmployeeInformation employeeInformation5;

	private MMASavingsAccount mmASavingsAccount1;
	private MMASavingsAccount mmASavingsAccount2;
	private MMASavingsAccount mmASavingsAccount3;
	private MMASavingsAccount mmASavingsAccount4;
	private MMASavingsAccount mmASavingsAccount5;

	@Before
	public void setUp() {
		employeeInformation1 = new EmployeeInformation(101, "Punam",
				"Developer", 24000, 1000);
		employeeInformation2 = new EmployeeInformation(102, "Minal",
				"Software Tester", 34000, 0);
		employeeInformation3 = new EmployeeInformation(103, "Akshay",
				"Engineer", 38000, 500);
		employeeInformation4 = new EmployeeInformation(104, "Praji", "Teacher",
				20000, 0);
		employeeInformation5 = new EmployeeInformation(105, "Aboli", "IPS",
				60000, 1500);

		mmASavingsAccount1 = new MMASavingsAccount(21000, "Punam", 30000, true);
		mmASavingsAccount2 = new MMASavingsAccount(23000, "Minal", 50000, true);
		mmASavingsAccount3 = new MMASavingsAccount(25000, "Akshay", 80000, true);
		mmASavingsAccount4 = new MMASavingsAccount(27000, "Praji", 24000, true);
		mmASavingsAccount5 = new MMASavingsAccount(29000, "Aboli", 100000, true);

	}

	@Test
	public void testForCheckRelationBetweenEmployeeAndBank() {
		HashMap<String, EmployeesAccountRelation> hashMap = new HashMap<String, EmployeesAccountRelation>();
		hashMap.put("Punam", new EmployeesAccountRelation(employeeInformation1,
				mmASavingsAccount1));
		hashMap.put("Minal", new EmployeesAccountRelation(employeeInformation2,
				mmASavingsAccount2));
		hashMap.put("Akshay", new EmployeesAccountRelation(
				employeeInformation3, mmASavingsAccount3));
		hashMap.put("Praji", new EmployeesAccountRelation(employeeInformation4,
				mmASavingsAccount4));
		hashMap.put("Aboli", new EmployeesAccountRelation(employeeInformation5,
				mmASavingsAccount5));

		String actual = hashMap.get("Punam").toString();
		String expected = "EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeID=101, employeeName=Punam, employeeDesignation=Developer, salary=24000.0, commission=1000.0], mmSavingsAccount=MMSavingsAccount [accountID=21000, accountHolderName=Punam, accountBalance=30000.0, isSalary=true]]";
		assertEquals(expected, actual);
	}

}
