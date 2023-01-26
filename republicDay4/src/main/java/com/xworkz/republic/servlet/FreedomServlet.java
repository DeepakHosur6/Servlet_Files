package com.xworkz.republic.servlet;

//26-01-2023 class example file
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/freedom")
public class FreedomServlet extends HttpServlet {

	public FreedomServlet() {
		System.out.println("Constructor is created  in : " + getClass().getSimpleName());

	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside the init method :");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Inside doGet method in doGet :");
		String name = req.getParameter("fighter_name");
		String alive = req.getParameter("alive");
		String mode = req.getParameter("mode");
		String weapon = req.getParameter("weapon");

		System.out.println("Fighter Name" + name + "Alive" + alive + "Mode" + mode + "Weapon" + weapon);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span>");
		writer.print("Frighter Name : " + name + "is sent succesfully ");
		writer.print("Frighter Status : " + alive + "is sent succesfully ");
		writer.print("Frighter Mode : " + mode + "is sent succesfully ");
		writer.print("Frighter Weapon : " + weapon + "is sent succesfully ");
		writer.print("</span>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
		System.out.println("-----------------------------------");
	}

}
