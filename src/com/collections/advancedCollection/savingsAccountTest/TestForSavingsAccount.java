package com.collections.advancedCollection.savingsAccountTest;

/**
 * 1)	Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
 a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount’s object one by one.
 b.	Now save the ArrayList which contains SavingAccount’s object into a file and read the file and display all savingAccount Object one by one.
 c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
 */
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.collections.advancedCollection.savingsAccount.BankAccountList;
import com.collections.advancedCollection.savingsAccount.SavingsAccount;

public class TestForSavingsAccount {
	private SavingsAccount savingsAccount1;
	private SavingsAccount savingsAccount2;
	private SavingsAccount savingsAccount3;
	private SavingsAccount savingsAccount4;
	private SavingsAccount savingsAccount5;
	private BankAccountList bankAccountList;
	List<SavingsAccount> arrayList = new ArrayList<SavingsAccount>();

	@Before
	public void setUp() {
		arrayList.add(new SavingsAccount(101, "Punam", 20000, true));
		arrayList.add(new SavingsAccount(102, "Shital", 40000, false));
		arrayList.add(new SavingsAccount(103, "Vinayak", 60000, true));
		arrayList.add(new SavingsAccount(104, "Tushar", 80000, false));
		arrayList.add(new SavingsAccount(105, "Tejas", 5000, true));

	}

	@Test
	public void testToPrintObjectsInFileFromArrayList()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		for (SavingsAccount savingsAccount : arrayList) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(
							"C:/Collections/textfile/Advanced collection text files/AccountList.txt"));
			objectOutputStream.writeObject(savingsAccount);
			objectOutputStream.close();
		}
		for (SavingsAccount savingsAccount : arrayList) {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream(
							"C:/Collections/textfile/Advanced collection text files/AccountList.txt"));
			SavingsAccount savingAccount = (SavingsAccount) objectInputStream
					.readObject();
			objectInputStream.close();
		}
	}

	@Test
	public void testTocheckObjectsThroughArrayList()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		bankAccountList = new BankAccountList();
		Set<SavingsAccount> set = bankAccountList.addAccounts(arrayList);
		String expected = "[SavingsAccount [accountBalance=20000.0, accountId=101, accountHolderName=Punam, salaried=true], "
				+ "SavingsAccount [accountBalance=40000.0, accountId=102, accountHolderName=Shital, salaried=false], "
				+ "SavingsAccount [accountBalance=60000.0, accountId=103, accountHolderName=Vinayak, salaried=true], "
				+ "SavingsAccount [accountBalance=80000.0, accountId=104, accountHolderName=Tushar, salaried=false], "
				+ "SavingsAccount [accountBalance=5000.0, accountId=105, accountHolderName=Tejas, salaried=true]]";
		String actual = set.toString();
		assertEquals(expected, actual);
	}
}
