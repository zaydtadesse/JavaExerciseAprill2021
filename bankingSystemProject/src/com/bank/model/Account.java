package com.bank.model;

public class Account {

	private int accountNum;
	private String firstName;
	private String lastName;
	private double balance;

	public Account(String firstName, String lastName, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	public Account() {

	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNum = " + accountNum + ", firstName = " + firstName + ", lastName = " + lastName
				+ ", balance = " + balance + "]";
	}

}
