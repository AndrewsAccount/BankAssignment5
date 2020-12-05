package com.meritamerica.assignment5.model;

import java.util.*;

public class AccountHolder {

	List<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
	List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
	List<CDAccount> cdAccounts = new ArrayList<CDAccount>();
	
	String firstName;
	String middleName;
	String lastName;
	String SSN;
	int id;
	static int nextId = 1;
	
	public AccountHolder() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.SSN = "";
		this.id = nextId ++;
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
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccounts.add(checkingAccount);
		return checkingAccount;
	}
	
	public List<CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;		
	}
	
	public List<SavingsAccount> addSavingsAccount(SavingsAccount savingsAccount){
		savingsAccounts.add(savingsAccount);
		return savingsAccounts;
	}
	
	public List<SavingsAccount> getSavingsAccounts(){
		return savingsAccounts;
	}
	
	public List<CDAccount> addCDAccount(CDAccount cdAccount){
		cdAccounts.add(cdAccount);
		return cdAccounts;
	}
	
	public List<CDAccount> getCDAccounts(){
		return cdAccounts;
	}
}
