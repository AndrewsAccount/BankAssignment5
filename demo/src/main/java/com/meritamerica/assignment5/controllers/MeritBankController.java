package com.meritamerica.assignment5.controllers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.meritamerica.assignment5.model.AccountHolder;
import com.meritamerica.assignment5.model.CDAccount;
import com.meritamerica.assignment5.model.CDOffering;
import com.meritamerica.assignment5.model.CheckingAccount;
import com.meritamerica.assignment5.model.SavingsAccount;

import Exceptions.AccountNotFoundException;
import Exceptions.NegativeBalanceException;
import Exceptions.ExceedsCombinedBalanceLimitException;
import Exceptions.InterestRateOutOfBoundsException;

@RestController
public class MeritBankController {
	List <AccountHolder> accountHolders = new ArrayList<AccountHolder>();
	List <CDOffering> cdOfferings = new ArrayList<CDOffering>();
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/AccountHolders")
//	@NotBlank(message = "Missing account holder information")
	public AccountHolder postAccountHolder(@Valid @RequestBody AccountHolder accountHolder) {
		accountHolders.add(accountHolder);
		return accountHolder;
		
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/AccountHolders")
	public List<AccountHolder> getAccountHolders(){
		return accountHolders;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/AccountHolders/{id}")
	public AccountHolder getAccountHolderById(@PathVariable int id) throws AccountNotFoundException {
		if (id > accountHolders.size() || id == 0) {
			throw new AccountNotFoundException("Account id not found");
		}
		return accountHolders.get(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/AccountHolders/{id}/CheckingAccounts")
//	@NotBlank(message = "Missing checking account information")
	public CheckingAccount postCheckingAccount(@Valid @RequestBody CheckingAccount checkingAccount, @PathVariable int id) throws NegativeBalanceException, ExceedsCombinedBalanceLimitException {
		if(checkingAccount.getBalance()< 0) {
			throw new NegativeBalanceException("Balance can not be less 0");
		}
		if(checkingAccount.getBalance() > 250000) {
			throw new ExceedsCombinedBalanceLimitException("Balance exceeds limit");
		}
		accountHolders.get(id).addCheckingAccount(checkingAccount);
		return checkingAccount;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/AccountHolders/{id}/CheckingAccounts")
	public List<CheckingAccount> getCheckingAccountsById(@PathVariable int id) throws AccountNotFoundException {
		if (id > accountHolders.size() ) {
			throw new AccountNotFoundException("Account id not found");
		}
		return accountHolders.get(id).getCheckingAccounts();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/AccountHolders/{id}/SavingsAccounts")
//	@NotBlank(message = "Missing saving account information")
	public SavingsAccount postSavingsAccount(@Valid @RequestBody SavingsAccount savingsAccount, @PathVariable int id) throws NegativeBalanceException, ExceedsCombinedBalanceLimitException {
		if(savingsAccount.getBalance()< 0) {
			throw new NegativeBalanceException("Balance can not be less 0");
		}
		if(savingsAccount.getBalance() > 250000) {
			throw new ExceedsCombinedBalanceLimitException("Balance exceeds limit");
		}
		accountHolders.get(id).addSavingsAccount(savingsAccount);
		return savingsAccount;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/AccountHolders/{id}/SavingsAccounts")
	public List<SavingsAccount> getSavingsAccountsById(@PathVariable int id) throws AccountNotFoundException{
		if (id-1 > accountHolders.size() ) {
			throw new AccountNotFoundException("Account id not found");
		}
		return accountHolders.get(id).getSavingsAccounts();				
	}
	
	@PostMapping(value = "/AccountHolders/{id}/CDAccounts")
//	@NotBlank(message = "Missing CD account information")
	public CDAccount postCDAccoutnt(@Valid @RequestBody CDAccount cdAccount, @PathVariable int id) throws NegativeBalanceException, ExceedsCombinedBalanceLimitException, InterestRateOutOfBoundsException {
		if(cdAccount.getBalance()<0){
			throw new NegativeBalanceException("Balance can not be less than 0");
		}
		if(cdAccount.getInterestRate() <= 0 || cdAccount.getInterestRate() >=1) {
			throw new InterestRateOutOfBoundsException("Interest rate must be greater than 0 and less than 1");
		}		
		accountHolders.get(id).addCDAccount(cdAccount);
		return cdAccount;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping(value = "/AccountHolders/{id}/CDAccounts")
	public List<CDAccount> getCDAccountsbyId(@PathVariable int id){
		return accountHolders.get(id).getCDAccounts();
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = " /CDOfferings")
	public CDOffering postCDOffering(@Valid @RequestBody CDOffering cdOffering) {
		return cdOffering;
		
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/CDOfferings")
	public List<CDOffering> getCDOfferings(){
		return cdOfferings;
	}	
}

