package demo;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DemoDAO {

	public void DemoInsert(String name,String email,String password,String rePassword) throws ClassNotFoundException
	{
		
			ConnectionUtil connection = new ConnectionUtil(); 
			Connection conn = connection.getConnectionUtil();
			PreparedStatement pst;
			try {
				pst = conn.prepareStatement("insert into signup (username,userpassword,reuserpassword,email) values(?,?,?,?)");
				pst.setString(1, name);
				pst.setString(2, password);
				pst.setString(3, rePassword);
				pst.setString(4, email);
				pst.executeUpdate(); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
}
