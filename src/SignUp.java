

import java.io.IOException;
//import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import demo.DemoModel;
import demo.DemoDAO;


//import java.sql.SQLException;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass1");
		String rePassword = request.getParameter("pass2");
		
		//Inserting the values into database
		DemoDAO DaoObj = new DemoDAO();
		try {
			DaoObj.DemoInsert(name, email, password,rePassword);
		} catch (ClassNotFoundException e) {
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
