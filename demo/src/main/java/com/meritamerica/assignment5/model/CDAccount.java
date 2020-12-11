package com.meritamerica.assignment5.model;

public class CDAccount extends BankAccount{
	int term;
	double interestRate;
	
	public CDAccount() {
		this.accountNumber = accountNumber ;
		this.balance = balance;
		this.dateOpened = dateOpened;
		this.interestRate = interestRate;
		this.term = term;
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
