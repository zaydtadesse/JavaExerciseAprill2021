package jdbc1;
	
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		
    public class JdbcQue1 {
		public static void main(String[] args) throws SQLException {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			int myRs = 0;


				try {
					// get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "zayd1214");
					System.out.println("Database connection successful!\n");

					// prepare statement
					String sql = "insert into account(accnt_no,first_name,last_name,balance) values(?,?,?,?), (?,?,?,?), (?,?,?,?),(?,?,?,?),(?,?,?,?)";
					myStmt = myConn.prepareStatement(sql);
					// insert data
					//row1
					myStmt.setInt(1, 18);
					myStmt.setString(2, "za");
					myStmt.setString(3, "ta");
					myStmt.setDouble(4, 20000);
					//row2
					myStmt.setInt(5, 19);
					myStmt.setString(6, "se");
					myStmt.setString(7, "ta");
					myStmt.setDouble(8, 30000);
					//row3
					myStmt.setInt(9, 20);
					myStmt.setString(10, "me");
					myStmt.setString(11, "ta");
					myStmt.setDouble(12, 4000);
					//row4
					myStmt.setInt(13, 21);
					myStmt.setString(14, "kb");
					myStmt.setString(15, "ta");
					myStmt.setDouble(16, 20000);
					//row 5
					myStmt.setInt(17, 22);
					myStmt.setString(18, "ne");
					myStmt.setString(19, "ta");
					myStmt.setDouble(20, 6000);
					
					myRs = myStmt.executeUpdate();
					System.out.println("Rows have been inserted "+ myRs);
					
				} catch (Exception exc) {
					exc.printStackTrace();
				} finally {
				}
				if (myConn != null) {
					myConn.close();
				}
				if (myStmt != null) {
					myStmt.close();
				}
				// if (myRs != 0) {
				// myRs.close();
			}
		

	}


