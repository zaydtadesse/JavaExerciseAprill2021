package abaPro;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.sun.jdi.connect.spi.Connection;

public class Account {

	public Account(int i, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		PreparedStatement prdStmt = null;

		try {
			// 1. Get a connection to database
			myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Bankdb1", "root", "zayd1214");
			
			//Create Statement
			myStmt = ((java.sql.Connection) myConn).createStatement();
			
			//create three objects
			Account ObjectA = new Account(2001, "John", "Doe", 2500.00);
			Account ObjectB = new Account(2002, "Tesfay", "Kiros", 1250.00);
			Account ObjectC = new Account(2004, "Hadgu", "Kindeya", 5000.30);
			
			String mySql = "Insert into account (account_no, first_name, last_name, balance) VALUES (?,?,?,?)";
			
			prdStmt = ((java.sql.Connection) myConn).prepareStatement(mySql);
			
			System.out.println(ObjectA);
			prdStmt.setInt(1, ObjectA.getAccountNum());
			prdStmt.setString(2, ObjectA.getFirstName());
			prdStmt.setString(3, ObjectA.getFirstName());
			prdStmt.setDouble(4, ObjectA.getBalance());
			ObjectA.deposit(1000);
			ObjectA.withdraw(500);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(ObjectB);
			prdStmt.setInt(1, ObjectB.getAccountNum());
			prdStmt.setString(2, ObjectB.getFirstName());
			prdStmt.setString(3, ObjectB.getFirstName());
			prdStmt.setDouble(4, ObjectB.getBalance());
			ObjectB.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			
			System.out.println(ObjectC);
			prdStmt.setInt(1, ObjectC.getAccountNum());
			prdStmt.setString(2, ObjectC.getFirstName());
			prdStmt.setString(3, ObjectC.getFirstName());
			prdStmt.setDouble(4, ObjectC.getBalance());
			ObjectC.deposit(1000);
			prdStmt.execute();
			
			System.out.println();
			System.out.println("Data successfully inserted into account table ");
			
			System.out.println();
			
			String sqlUpdate = "UPDATE Bankdb1.account SET balance = ? WHERE account_no = ?";
			prdStmt = ((java.sql.Connection) myConn).prepareStatement(sqlUpdate);
		    
			prdStmt.setDouble(1, ObjectA.getBalance());
			prdStmt.setDouble(2, ObjectA.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, ObjectB.getBalance());
			prdStmt.setDouble(2, ObjectB.getAccountNum());
			prdStmt.execute();
		    
			prdStmt.setDouble(1, ObjectC.getBalance());
			prdStmt.setDouble(2, ObjectC.getAccountNum());
			prdStmt.execute();
			
			
			
			System.out.println("Data updated ");
			
			//Transaction table
			Transaction transactionObjectA = new Transaction(101, "deposit", 1000, ObjectA.getAccountNum());
			Transaction transactionObjectB = new Transaction(102, "withdraw", 500, ObjectA.getAccountNum());
			
			//transfer transaction
			Transfer transactionObjectC = new Transfer (501, 2004, 2002, 750,ObjectC.getReason());

			String mySql2 = "Insert into transaction (transaction_id, transaction_type, amount, account_no) VALUES (?,?,?,?)";
			prdStmt = ((java.sql.Connection) myConn).prepareStatement(mySql2);
			
			System.out.println();
			
			System.out.println(transactionObjectA);
			prdStmt.setInt(1, transactionObjectA.getTransactionId());
			prdStmt.setString(2, transactionObjectA.getTransactiontype());
			prdStmt.setDouble(3, transactionObjectA.getAmount());
			prdStmt.setInt(4, transactionObjectA.getAccountNum());
			prdStmt.execute();
			
			
			System.out.println(transactionObjectB);
			prdStmt.setInt(1, transactionObjectB.getTransactionId());
			prdStmt.setString(2, transactionObjectB.getTransactiontype());
			prdStmt.setDouble(3, transactionObjectB.getAmount());
			prdStmt.setInt(4, transactionObjectB.getAccountNum());
			prdStmt.execute();
			
			System.out.println();
			System.out.println("Data successfully inserted into transaction table ");
			


			//method to deposit money
			
		} catch (Exception exc) {
			exc.printStackTrace();

		}

	}

	private double getReason() {
		// TODO Auto-generated method stub
		return 0;
	}

	void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}

	void deposit(int i) {
		// TODO Auto-generated method stub
		
	}

	double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	int getAccountNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}