 package com.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.dbutil.MyConnectionManager;
import com.bank.model.Account;

public class AccountDao {
	
	public boolean createAccount(Account account) throws SQLException {
		
		Connection myConn = null;
		PreparedStatement prdStmt = null;
		
		
		try {
			myConn = MyConnectionManager.getMySqlConnection();
			
			String mySql = "Insert into account (first_name, last_name, balance) VALUES (?,?,?)";
			
			prdStmt = myConn.prepareStatement(mySql, Statement.RETURN_GENERATED_KEYS);
			
			prdStmt.setString(1, account.getFirstName());
			prdStmt.setString(2, account.getLastName());
			prdStmt.setDouble(3, account.getBalance());
			prdStmt.execute();
			
			try(ResultSet rs = prdStmt.getGeneratedKeys()){
				if (rs.next()) {
					account.setAccountNum(rs.getInt(1));
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			myConn.close();
		}
		return false;
		
		
	}
	public void updateBalance(int account_no, double amount) {
		Connection myConn = null;

		try {
			myConn = MyConnectionManager.getMySqlConnection();

			String updateBalnce = "update account set balance = balance + ? where account_no = ?";
			PreparedStatement predStmt = myConn.prepareStatement(updateBalnce, Statement.RETURN_GENERATED_KEYS);

			predStmt.setDouble(1, amount);
			predStmt.setInt(2, account_no);
			predStmt.executeUpdate();

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
	public void updateBalance(int account_no, int account_no1, double amount) {
		Connection myConn = null;

		try {
			myConn = MyConnectionManager.getMySqlConnection();

			String updateBalnce = "update account set balance = balance + ? where account_no = ?";
			PreparedStatement predStmt = myConn.prepareStatement(updateBalnce, Statement.RETURN_GENERATED_KEYS);

			predStmt.setDouble(1, amount);
			predStmt.setInt(2, account_no);
			predStmt.executeUpdate();

		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}
}