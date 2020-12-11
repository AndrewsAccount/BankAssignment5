package com.meritamerica.assignment5.model;

public class CheckingAccount extends BankAccount{
	
	static double interestRate = 0.0001;
	
	public CheckingAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
}
