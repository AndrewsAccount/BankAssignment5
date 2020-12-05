package com.meritamerica.assignment5.model;

public class CheckingAccount {
	long accountNumber;
	double balance;
	String dateOpened;
	double interestRate = 0.0001;
	
	public CheckingAccount() {
		this.balance = 0;
		this.dateOpened = "11111111";
		this.interestRate = .000001;
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

	public String getDate() {
		return dateOpened;
	}

	public void setDate(String date) {
		this.dateOpened = date;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}


}
