package com.xworkz.deepak.servlet;
//23-01-2023 Day2 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/yelli")
public class Anil extends HttpServlet {

	public Anil() {
		// TODO Auto-generated constructor stub

		System.out.println("Anil Constructor created :"+this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method inside Anil");

	}
}
