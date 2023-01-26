package com.xworkz.kingDay4task2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/kingdom")
public class PrinceServlet extends HttpServlet {

	public PrinceServlet() {
		System.out.println("Constructor is created : " + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside the init method : ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet Method : ");

		String name = req.getParameter("King_Name");
		String language = req.getParameter("language");
		String religion = req.getParameter("religion");
		String birth = req.getParameter("birth");
		String death = req.getParameter("death");


		System.out.println(name);
		System.out.println(language);
		System.out.println(religion);
		System.out.println(birth);
		System.out.println(death);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span>");
		writer.print("Series Name : " + name + " : is sent succesfully ");

		writer.print("</span>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		// This will be understand to browser and write html or plain
		System.out.println("-----------------------------------");

	}

}
