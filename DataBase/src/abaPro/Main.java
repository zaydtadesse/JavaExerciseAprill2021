	package abaPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		PreparedStatement prdStmt = null;

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbaPro", "root", "zayd1214");
			
			//Create Statement
			myStmt = myConn.createStatement();
			
			//create three objects
			Account Object1 = new Account(2001, "John", "Doe", 2500.00);
			Account Object2 = new Account(2002, "Tesfay", "Kiros", 1250.00);
			Account Object3 = new Account(2004, "Hadgu", "Kindeya", 5000.30);
			
			String mySql = "Insert into account (account_no, first_name, last_name, balance) VALUES (?,?,?,?)";
			
			prdStmt = myConn.prepareStatement(mySql);
			
			System.out.println(Object1);
			prdStmt.setInt(1, Object1.getAccountNum());
			prdStmt.setString(2, Object1.getFirstName());
			prdStmt.setString(3, Object1.getFirstName());
			prdStmt.setDouble(4, Object1.getBalance());
			Object1.deposit(1000);
			Object1.withdraw(500);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(Object2);
			prdStmt.setInt(1, Object2.getAccountNum());
			prdStmt.setString(2, Object2.getFirstName());
			prdStmt.setString(3, Object2.getFirstName());
			prdStmt.setDouble(4, Object2.getBalance());
			Object2.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(Object3);
			prdStmt.setInt(1, Object3.getAccountNum());
			prdStmt.setString(2, Object3.getFirstName());
			prdStmt.setString(3, Object3.getFirstName());
			prdStmt.setDouble(4, Object3.getBalance());
			Object3.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			System.out.println("Data successfully inserted into account table ");
			
			System.out.println();
			
			String sqlUpdate = "UPDATE Bankdb1.account SET balance = ? WHERE account_no = ?";
			prdStmt = myConn.prepareStatement(sqlUpdate);
		    
			prdStmt.setDouble(1, Object1.getBalance());
			prdStmt.setDouble(2, Object1.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, Object2.getBalance());
			prdStmt.setDouble(2, Object2.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, Object3.getBalance());
			prdStmt.setDouble(2, Object3.getAccountNum());
			prdStmt.execute();
			
			
			
			System.out.println("Data updated ");
			
			//Transaction table
			Transaction transactionObject1 = new Transaction(101, "deposit", 1000, Object1.getAccountNum());
			Transaction transactionObject2 = new Transaction(102, "withdraw", 500, Object1.getAccountNum());
			
			//transfer transaction
			//Transfer transactionObjectC = new Transfer (501, 2004, 2002, 750,ObjectC.getReason());

			String mySql2 = "Insert into transaction (transaction_id, transaction_type, amount, account_no) VALUES (?,?,?,?)";
			prdStmt = myConn.prepareStatement(mySql2);
			
			System.out.println();
			
			System.out.println(transactionObject1);
			prdStmt.setInt(1, transactionObject1.getTransactionId());
			prdStmt.setString(2, transactionObject1.getTransactiontype());
			prdStmt.setDouble(3, transactionObject1.getAmount());
			prdStmt.setInt(4, transactionObject1.getAccountNum());
			prdStmt.execute();
			
			
			System.out.println(transactionObject2);
			prdStmt.setInt(1, transactionObject2.getTransactionId());
			prdStmt.setString(2, transactionObject2.getTransactiontype());
			prdStmt.setDouble(3, transactionObject2.getAmount());
			prdStmt.setInt(4, transactionObject2.getAccountNum());
			prdStmt.execute();
			
			System.out.println();
			System.out.println("Data successfully inserted into transaction table ");
			


			//method to deposit money
			
		} catch (Exception exc) {
			exc.printStackTrace();

		}

	}

}