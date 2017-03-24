package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import demo.ConnectionUtil;

public class NewUser {
	
	public static int adduser(String username,String email,String password,String rePassword) throws Exception
	{
		
		Connection conn = ConnectionUtil.getConnectionUtil();
		PreparedStatement stmt = conn.prepareStatement("insert into signup (username,userpassword,reuserpassword,email)values(?,?,?,?)");
        stmt.setString(1, username);
        stmt.setString(2, password);
        stmt.setString(3, rePassword);
        stmt.setString(4, email);
        int value=stmt.executeUpdate();
		return value;
	}

}
