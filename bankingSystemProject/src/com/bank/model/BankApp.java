
package com.bank.model;

import java.sql.SQLException;

import com.bank.service.AccountService;



public class BankApp {

	public static void main(String[] args) throws SQLException {

		// create three objects
		Account john = new Account("John", "Doe", 2500.00);
		Account tesfay = new Account("Tesfay", "Kiros", 1250.00);
		Account hadgu = new Account("Hadgu", "Kindeya", 5000.30);
		
		//Initialize the service
		AccountService accountService = new AccountService();
		accountService.saveAccount(john);
		accountService.saveAccount(tesfay);		
		accountService.saveAccount(hadgu);
		
		accountService.deposit(john, 1000);
		accountService.deposit(tesfay, 1000);
		accountService.deposit(hadgu, 1000);
		
		accountService.withdraw(john, 500);
	 
		System.out.println(john);
		System.out.println(tesfay);
		System.out.println(hadgu);
		
		accountService.Transfer(john, 750);

	}
}
		
		
		
		
		
		
		
	
