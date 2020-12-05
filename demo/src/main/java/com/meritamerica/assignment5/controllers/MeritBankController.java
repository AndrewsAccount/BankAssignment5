package com.meritamerica.assignment5.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meritamerica.assignment5.model.AccountHolder;
import com.meritamerica.assignment5.model.CDAccount;
import com.meritamerica.assignment5.model.CDOffering;
import com.meritamerica.assignment5.model.CheckingAccount;
import com.meritamerica.assignment5.model.SavingsAccount;

@RestController
public class MeritBankController {
	List <AccountHolder> accountHolders = new ArrayList<AccountHolder>();
	List <CDOffering> cdOfferings = new ArrayList<CDOffering>();
	
	@PostMapping(value = "/AccountHolders")
	public AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder) {
		accountHolders.add(accountHolder);
		return accountHolder;
		
	}
	
	@GetMapping(value = "/AccountHolders")
	public List<AccountHolder> getAccountHolders(){
		return accountHolders;
	}

	@GetMapping(value = "/AccountHolders/{id}")
	public AccountHolder getAccountHolderById(@PathVariable int id) {
		return accountHolders.get(id-1);
	}
	
	@PostMapping(value = "/AccountHolders/{id}/CheckingAccounts")
	public CheckingAccount postCheckingAccount(@RequestBody CheckingAccount checkingAccount, @PathVariable int id) {
		accountHolders.get(id-1).addCheckingAccount(checkingAccount);
		return checkingAccount;
	}
	
	@GetMapping(value = "/AccountHolders/{id}/CheckingAccounts")
	public List<CheckingAccount> getCheckingAccountsById(@PathVariable int id) {
		return accountHolders.get(id-1).getCheckingAccounts();
	}
	
	@PostMapping(value = "/AccountHolders/{id}/SavingsAccounts")
	public SavingsAccount postSavingsAccount(@RequestBody SavingsAccount savingsAccount, @PathVariable int id) {
		accountHolders.get(id-1).addSavingsAccount(savingsAccount);
		return savingsAccount;
	}
	
	@GetMapping(value = "/AccountHolders/{id}/SavingsAccounts")
	public List<SavingsAccount> getSavingsAccountsById(@PathVariable int id){
		return accountHolders.get(id-1).getSavingsAccounts();
				
	}
	
	@PostMapping(value = "/AccountHolders/{id}/CDAccounts")
	public CDAccount postCDAccoutnt(@RequestBody CDAccount cdAccount, @PathVariable int id) {
		accountHolders.get(id-1).addCDAccount(cdAccount);
		return cdAccount;
	}
	
	@GetMapping(value = "/AccountHolders/{id}/CDAccounts")
	public List<CDAccount> getCDAccountsbyId(@PathVariable int id){
		return accountHolders.get(id-1).getCDAccounts();
	}
	
	@PostMapping(value = " /CDOfferings")
	public CDOffering postCDOffering(@RequestBody CDOffering cdOffering) {
		return cdOffering;
	}
	
	@GetMapping(value = "/CDOfferings")
	public List<CDOffering> getCDOfferings(){
		return cdOfferings;
	}
}

