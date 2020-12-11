package com.meritamerica.assignment5.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;

public class BankAccount {
	
	long accountNumber;
	static long nextAccountNumber = 1;
	
	@Min(value = 0, message = "Cannot have negative balance.")	
	double balance;	
	@DecimalMin(value = "0.00", inclusive = false, message = "Interest rate must be more than 0.00")
	@DecimalMax(value = "1.00", inclusive = false, message = "Interest rate must be less than 1.00")
	double interestRate;
	LocalDate dateOpened;
	
	BankAccount(){
		this.accountNumber = nextAccountNumber ++;
		this.balance = balance;
		this.interestRate = interestRate;
		this.dateOpened = LocalDate.now();
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static long getNextAccountNumber() {
		return nextAccountNumber;
	}

	public static void setNextAccountNumber(long nextAccountNumber) {
		BankAccount.nextAccountNumber = nextAccountNumber;
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

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public LocalDate getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(LocalDate dateOpened) {
		this.dateOpened = dateOpened;
	}
}
