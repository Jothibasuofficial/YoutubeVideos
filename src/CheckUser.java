

import java.io.IOException;
import java.io.PrintWriter;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;*/

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckUser")
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("user");
		//String email = request.getParameter("email");
		String password = request.getParameter("pass");
		//String rePassword = request.getParameter("pass2");
		PrintWriter out = response.getWriter();
		try{
			if (username.equalsIgnoreCase("Jothibasu")&&password.equalsIgnoreCase("Jothibasu")) {
				out.println("<div style='position: absolute; top:100px; left:400px;'>");
	            out.println("<font size='15' color='blue'>Welcome "+username+" !</font>");
	            out.println("</div>");
            } 
            else {
            	out.println("<div style='position: absolute; top:0px; left:400px;'>");
	            out.println("<font size='15' color='blue'>Incorrect Username or Password !</font>");
	            out.println("<p>If you not registered yet?");
	            out.println("<a href='signup.html'>Register Here</a></p>");
	            out.println("</div>");
                
            }
		/*try {
	    	   Class.forName("com.mysql.jdbc.Driver");
	           String url = "jdbc:mysql://localhost:3306/jothibasu";
	           String dbusername = "root";
	           String dbpassword = "developer";
	            Connection conn = DriverManager.getConnection(url,dbusername,dbpassword);
	            
	            PreparedStatement pst = conn.prepareStatement("Select username,userpassword from signup where username=? and userpassword=?");
	            pst.setString(1, username);
	            pst.setString(2, password);
	            ResultSet rs = pst.executeQuery();
	            out.print(rs);
	            if (rs.next()) {
	                out.println("Correct login credentials");
	            } 
	            else {
	                out.println("Incorrect login credentials");
	            }
	        } 
	        catch (Exception e) {
	            out.println( e.getMessage());
	        }*/
	}
		catch (Exception e) {
            out.println( e.getMessage());
        }
	}

}
