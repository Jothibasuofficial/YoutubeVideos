package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	
	public static Connection getConnectionUtil() throws ClassNotFoundException
	{
	
			Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/jothibasu";
	           String dbusername = "root";
	           String dbpassword = "developer";
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, dbusername, dbpassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return conn;
	}
}
