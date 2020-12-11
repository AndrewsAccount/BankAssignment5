package com.meritamerica.assignment5.model;

import java.util.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.assignments.assignment5.models.BankAccount;
import com.assignments.assignment5.models.CDAccount;
import com.assignments.assignment5.models.CheckingAccount;
import com.assignments.assignment5.models.SavingsAccount;

public class AccountHolder {

	List<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
	List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
	List<CDAccount> cdAccounts = new ArrayList<CDAccount>();

	@NotNull(message = "First Name can not be null")
	@NotBlank(message = "First Name can not be blank")
	String firstName;
	@NotNull(message = "Middle Name can not be null")
	@NotBlank(message = "Middle Name can not be blank")
	String middleName;
	@NotNull(message = "Last Name can not be null")
	@NotBlank(message = "Last Name can not be blank")
	String lastName;
	@NotNull(message = "SSN can not be null")
	@NotBlank(message = "SSN can not be blank")
	String SSN;

	int id;
	static int nextId = 1;

	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.SSN = "";
		this.id = nextId++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BankAccount addCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccounts.add(checkingAccount);
		return checkingAccount;
	}

	public List<CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;
	}

	public BankAccount addSavingAccount(SavingsAccount savingsAccount) {
		savingsAccounts.add(savingsAccount);
		return savingsAccount;
	}

	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}

	public BankAccount addCDAccount(CDAccount cdAccount) {
		cdAccounts.add(cdAccount);
		return cdAccount;
	}

	public List<CDAccount> getCDAccounts() {
		return cdAccounts;
	}

	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.size();
	}

	public int getCombinedCheckingBalance() {
		int combinedCheckingBalance = 0;
		for (BankAccount checkAcct : checkingAccounts) {
			combinedCheckingBalance += checkAcct.getBalance();
		}
		return combinedCheckingBalance;
	}

	public int getCombinedSavingsBalance() {
		int combinedSavingsBalance = 0;
		for (BankAccount savAcct : checkingAccounts) {
			combinedSavingsBalance += savAcct.getBalance();
		}
		return combinedSavingsBalance;
	}

	public int getCombinedBalances() {
		return getCombinedSavingsBalance() + getCombinedCheckingBalance();
	}
}
