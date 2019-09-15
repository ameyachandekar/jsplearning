package database;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter writer = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		DatabaseConnection connection = new DatabaseConnection();
		boolean result = connection.verifyUser(username, password);
		
		if(result == true) {
			
			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			resp.sendRedirect("/jsp/user_section.jsp");
		    //req.getRequestDispatcher("/user_section.jsp").forward(req,resp);
			
		}
		else {
			writer.print("Invalid credentials");
		}
		
		
	}

}
