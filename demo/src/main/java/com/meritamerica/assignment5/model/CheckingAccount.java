package com.meritamerica.assignment5.model;

public class CheckingAccount {
	long checkingAccountNumber;
	static long nextCheckingAccountNumber = 1;
	double balance;	
	double interestRate;
	String dateOpened;
	
	public CheckingAccount() {
		this.checkingAccountNumber = nextCheckingAccountNumber++;
		this.balance = 0;
		this.interestRate = .0001;
		this.dateOpened = "";	
		
	}
		
	public long getAccountNumber() {
		return checkingAccountNumber;
	}

	public void setAccountNumber(long checkingAccountNumber) {
		this.checkingAccountNumber = checkingAccountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getDate() {
		return dateOpened;
	}

	public void setDate(String date) {
		this.dateOpened = date;
	}
}
