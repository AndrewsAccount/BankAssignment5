package com.meritamerica.assignment5.model;

import java.time.LocalDate;

public class CDOffering {
	int term; 
	int interestRate; 
	
	public CDOffering() {
		this.term = term; 
		this.interestRate = interestRate;

	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}


}
