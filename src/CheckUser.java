

import java.io.IOException;
import java.io.PrintWriter;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;*/

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.Login;


@WebServlet("/CheckUser")
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
	
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		try {
	    	  boolean value = Login.LoginCheck(username, password);
	    	  if(value)
	    	  {
	    		  RequestDispatcher rs = request.getRequestDispatcher("login.html");
	        		rs.forward(request, response);
	    	  }
	    	  else
	    	  {
	    		  out.println("Username/Password Invalid");
	    	  }
	        } 
	        catch (Exception e) {
	             e.getMessage();
	             out.println(e);
	        }
	}
		
	}


