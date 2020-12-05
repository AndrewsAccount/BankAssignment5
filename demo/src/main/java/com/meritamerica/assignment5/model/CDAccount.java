package com.meritamerica.assignment5.model;

public class CDAccount {
	long accountNumber;
	double balance;
	String dateOpened;
	double interestRate = 0.025;
	int term;
	
	public CDAccount() {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateOpened = dateOpened;
		this.interestRate = interestRate;
		this.term = term;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

}
