package com.xworkz.deepak.servlet;
//23-01-2023 Day2 class file
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//servlet does not contain parameter constructor. its has only default constructor
@WebServlet(loadOnStartup = 1, urlPatterns = "/yake")
public class FasttrackServlet extends HttpServlet {

	public FasttrackServlet() {
		// TODO Auto-generated constructor stub

		System.out.println("FasttrackServlet Constructor created :"+this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method inside FasttrackServlet");

	}
}
