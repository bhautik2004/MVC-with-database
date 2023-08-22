

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class controlerservlet extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String isregister = request.getParameter("isregister");
		if( isregister.equals("yes")) {
			 String name = request.getParameter("name");
			 String email = request.getParameter("email");
			 String password = request.getParameter("password");
			 String gender = request.getParameter("gender");
			 String country = request.getParameter("country");
			 modelUser newuser = new modelUser();
			 boolean success =  newuser.register(name,email,password,gender,country);
			 if(success) {
				 response.sendRedirect("login.jsp");
			 }
			 else {
				 response.sendRedirect("index.jsp");
			 }
			 
		}
		else {
				 String name = request.getParameter("name");
				 String password = request.getParameter("password");
				 modelUser newuser = new modelUser();
				Boolean isuser =  newuser.login(name, password);
				if(isuser) {
					HttpSession session = request.getSession();
					session.setAttribute("user", name);
					response.sendRedirect("welcome.jsp");
				}
				else {
					out.print("<center>Username and Password Is Wrong</center>");
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					rd.include(request, response);
				}
				 
		}
	}

}
