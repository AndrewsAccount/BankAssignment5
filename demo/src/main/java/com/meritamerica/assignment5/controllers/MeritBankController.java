package com.meritamerica.assignment5.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meritamerica.assignment5.model.AccountHolder;

@RestController
public class MeritBankController {
	List <AccountHolder> accountHolders = new ArrayList<AccountHolder>();
	
	@PostMapping(value = "/accountholders")
	public AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder) {
		accountHolders.add(accountHolder);
		return accountHolder;
		
	}
	
	@GetMapping(value = "/accountholders")
	public List<AccountHolder> getAccountHolders(){
		return accountHolders;
	}

}

