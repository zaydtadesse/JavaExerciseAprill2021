

package com.bank.model;

public class Transaction {
	
	private int transactionId;
	private String transactionType;
	private double amount;
	private int accountNum;
	
	public Transaction(String transactionType, double amount, int accountNum) {
		super();
		this.transactionType = transactionType;
		this.amount = amount;
		this.accountNum = accountNum;
	}
	
	public Transaction() {
		
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactiontype) {
		this.transactionType = transactiontype;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionType=" + transactionType + ", amount="
				+ amount + ", accountNum=" + accountNum + "]";
	}
}
