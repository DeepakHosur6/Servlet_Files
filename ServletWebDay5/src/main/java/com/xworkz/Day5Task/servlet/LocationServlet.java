package com.xworkz.Day5Task.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	
	public LocationServlet() {
		System.out.println("Constructor is created : " + this.getClass().getSimpleName());
		
	}	
	@Override
	public void init() throws ServletException {
		System.out.println("Init is Invoked :");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost method in TvSeriesServlet ");
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String startPoint = req.getParameter("start_Point");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 3) {
			writer.println("<span style='color:green;'>");
			writer.println("Login Sucessfully : " + name);
			writer.println("<br><a href=\"index.html\"> Home Page </a>");
		} else {
			writer.println("<span style='color:red;'>");
			writer.println("The Name should be greateer than 3 charaters");
			writer.println("<br><a href=\"index.html\"> Home Page </a>");
		}
		
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}
	

}
