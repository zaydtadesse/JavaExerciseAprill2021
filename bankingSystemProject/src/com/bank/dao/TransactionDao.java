package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.dbutil.MyConnectionManager;

public class TransactionDao {
	
	public boolean saveTransaction(int account_no, String transactionType, double amount) {
		
		boolean saveTransaction = false;
		int rowsInserted = 0;
		Connection connection = null;
		
		try {
			connection = MyConnectionManager.getMySqlConnection();
			
			String insertTransaction = "insert into transaction (transaction_type, amount, account_no) VALUES (?,?,?)";

			PreparedStatement predStmt = connection.prepareStatement(insertTransaction);
			predStmt.setString(1, transactionType);
			predStmt.setDouble(2, amount);
			predStmt.setInt(3, account_no);
			rowsInserted = predStmt.executeUpdate(); 
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		if (rowsInserted == 1) {
			saveTransaction = true;
		}
		return saveTransaction;
		
	}

}



