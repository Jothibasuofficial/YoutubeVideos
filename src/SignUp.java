

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.NewUser;



@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass1");
		String rePassword = request.getParameter("pass2");
		
		//Inserting the values into database
		try {
			int value = NewUser.adduser(username, email, password, rePassword);
			if (value==1) {
                RequestDispatcher rs = request.getRequestDispatcher("signup.html");
        		rs.forward(request, response);
        		 out.println("<p>successfull Registration</p>");
            } 
            else {
                out.println("Unsuccessfull Registration");
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Packing the data
		/*DemoModel modelObj = new DemoModel();
		modelObj.setName(name);
		modelObj.setPassword(password);
		modelObj.setEmail(email);
		
		//Setting Attribute
		ServletContext context = getServletContext();
		context.setAttribute("model",modelObj);
		
		RequestDispatcher rs = request.getRequestDispatcher("Registration.jsp");
		rs.forward(request, response);*/
		
	}

}
