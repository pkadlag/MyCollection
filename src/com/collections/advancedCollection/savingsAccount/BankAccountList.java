package com.collections.advancedCollection.savingsAccount;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public Set<SavingsAccount> addAccounts(List<SavingsAccount> arrayList) {
		Set<SavingsAccount> set = new TreeSet<SavingsAccount>(arrayList);
		return set;
	}

}
