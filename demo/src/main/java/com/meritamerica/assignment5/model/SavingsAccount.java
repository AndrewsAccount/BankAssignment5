package com.meritamerica.assignment5.model;

public class SavingsAccount {

	static double interestRate = 0.01;

	public SavingsAccount(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

}
