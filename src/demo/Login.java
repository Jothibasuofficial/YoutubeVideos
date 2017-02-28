package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Login {
	
	public void LoginCheck(String email,String password) throws ClassNotFoundException
	{
		
			ConnectionUtil connection = new ConnectionUtil(); 
			Connection conn = connection.getConnectionUtil();
			PreparedStatement pst;
			try {
				pst = conn.prepareStatement("select email,password from userdetails where email=? and password=?");
				pst.setString(1, email);
				pst.setString(2, password);
				pst.executeUpdate(); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	       
		
	}

}
