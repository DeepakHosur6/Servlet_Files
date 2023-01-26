package com.xworkz.webSeries.servlet;

//26-01-2023 task1
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/show")
public class TvSeriesServlet extends HttpServlet {

	public TvSeriesServlet() {

		System.out.println("Constructor is created : " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init is Invoked :");

	}

	/*
	 * @Override public String toString() {
	 * 
	 * return "Running to string"; }
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet method in TvSeriesServlet ");

		String name = req.getParameter("series_Name");
		String language = req.getParameter("language");
		String episode = req.getParameter("episode");
		String Ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(language);
		System.out.println(episode);
		System.out.println(Ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span>");
		writer.print("Series Name : " + name + "is sent succesfully ");

		writer.print("</span>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		// This will be understand to browser and write html or plain
		System.out.println("-----------------------------------");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method");
	}

}
