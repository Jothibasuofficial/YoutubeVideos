

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	
	


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass1");
		String rePassword = request.getParameter("pass2");
		PrintWriter out = response.getWriter();
		try {
	    	   Class.forName("com.mysql.jdbc.Driver");
	           String url = "jdbc:mysql://localhost:3306/jothibasu";
	           String dbusername = "root";
	           String dbpassword = "developer";
	            Connection conn = DriverManager.getConnection(url,dbusername,dbpassword);
	            
	            PreparedStatement stmt = conn.prepareStatement("insert into signup (username,userpassword,reuserpassword,email)values(?,?,?,?)");
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            stmt.setString(3, rePassword);
	            stmt.setString(4, email);
	            int value=stmt.executeUpdate();
	            if (value==1) {
	                RequestDispatcher rs = request.getRequestDispatcher("successfullregistration.html");
	        		rs.forward(request, response);
	            } 
	            else {
	                out.println("Unsuccessfull Registration");
	            }
	        } 
	        catch (Exception e) {
	            out.println( e.getMessage());
	        }


	}

}
