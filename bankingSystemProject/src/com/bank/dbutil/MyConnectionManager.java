package com.bank.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionManager {
	
	public static Connection getMySqlConnection() throws SQLException {
		
		Connection connection = null;
		
		String url = "jdbc:mysql://localhost:3306/bankingPro";
		String user = "root";
		String pwd = "zayd1214";
		
		connection = DriverManager.getConnection(url, user, pwd);
		
		return connection;
	}

}