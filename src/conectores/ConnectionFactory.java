package conectores;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnectionFactory {
	public Connection getConnection() {
	    	 //Class.forName("com.mysql.jdbc.Driver");
	    	 
	         try {
	        	 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				return DriverManager.getConnection(
				   "jdbc:mysql://localhost:3306/teste", "root", "3512655"
				 );
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
	 }	
}
