package com.xworkz.Day5Task.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/con")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("Constructor is created : " + this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Init is Invoked :");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost method in TvSeriesServlet ");
		String name1 = req.getParameter("userName");
		String email1 = req.getParameter("email");
		String mobile = req.getParameter("mobile_Number");
		String comments = req.getParameter("comments");

		System.out.println(name1);
		System.out.println(email1);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name1.length() > 3) {
			writer.println("<span style= 'color:green;'>");
			writer.println("Login Sucessfully " + name1);
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
