package com.bank.service;

import java.sql.SQLException;

import com.bank.dao.AccountDao;
import com.bank.dao.TransactionDao;
import com.bank.dao.TransferDao;
import com.bank.model.Account;

public class AccountService {

	AccountDao accountDao = new AccountDao();
	TransactionDao transactionDao = new TransactionDao();
	TransferDao transferDao = new TransferDao();
	
	public void saveAccount(Account account) throws SQLException {
		accountDao.createAccount(account);
	
		
	}
	
	public void deposit(Account account, double amount) {

		int account_no = account.getAccountNum();
		boolean success = transactionDao.saveTransaction(account_no, "Deposit", amount);
		if (success) {
			//Update balance
			System.out.println("Transaction created successfully");
			accountDao.updateBalance(account_no, amount);
			System.out.println("Account updated successfully");
		}
		
	}
	public void withdraw(Account account, double amount) {
		//Deposit logic
		//Transaction create
		int account_no = account.getAccountNum();
		double negative_amount = -1 * amount;
		boolean success = transactionDao.saveTransaction(account_no, "Withdraw", amount);
		if (success) {
			//Update balance
			System.out.println("Transaction created successfully");
			accountDao.updateBalance(account_no, negative_amount);
			System.out.println("Account updated successfully");
		}
		
	}
	public void Transfer(Account account, double amount) {
		int account_no = account.getAccountNum();
		double negative_amount = (-1 * amount);
		double positive_amount = amount;
		
		boolean success = transferDao.saveTransfer(account_no, account_no + 1, amount, "For Trip");
		if (success) {
			//Update balance
			
			accountDao.updateBalance(account_no, negative_amount);
			accountDao.updateBalance(account_no + 1, positive_amount);
			System.out.println("Transfer table  updated successfully");
		}
		
	}

}