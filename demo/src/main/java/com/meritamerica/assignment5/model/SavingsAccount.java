package com.meritamerica.assignment5.model;

public class SavingsAccount {

	long accountNumber;
	double balance;
	String dateOpened;
	double interestRate = 0.01;
	
	public SavingsAccount() {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateOpened = dateOpened;
		this.interestRate = interestRate;
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
}
