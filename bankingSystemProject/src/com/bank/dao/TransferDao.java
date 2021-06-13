package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bank.dbutil.MyConnectionManager;

public class TransferDao {
	
	public boolean saveTransfer(int fromAccount, int toAccount, double amount, String reason) {
		boolean saveTransfer = false;
		int rowsInserted = 0;
		Connection connection = null;
		
		try {
			connection = MyConnectionManager.getMySqlConnection();
			
			String insertTransfer = "insert into transfer (from_account, to_account, amount, reason) VALUES (?,?,?,?)";

			PreparedStatement predStmt = connection.prepareStatement(insertTransfer);
			predStmt.setInt(1, fromAccount);
			predStmt.setInt(2, toAccount);
			predStmt.setDouble(3, amount);
			predStmt.setString(4, reason);
			rowsInserted = predStmt.executeUpdate(); //returns number of rows inserted
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		if (rowsInserted == 1) {
			saveTransfer = true;
		}
		return saveTransfer;
		
	}

}


