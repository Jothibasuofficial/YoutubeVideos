package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	
	public Connection getConnectionUtil() throws ClassNotFoundException
	{
	
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/jothibasu", "root", "developer");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return conn;
	}
}
