package conectores;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
	     try {
	         return DriverManager.getConnection(
	           "jdbc:mysql://localhost/smart_clinic", "root", "brunopr"
	         );
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }	
}