package com.xworkz.movies.servlet;

import java.io.IOException;
import java.io.PrintWriter;

//26-01-2023 task3 CustomExample
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/money")
public class MoviesServlet extends HttpServlet {

	public MoviesServlet() {
		System.out.println("Constructor is created : " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init is Invoked :");

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("------------------------------------------");
		System.out.println("Inside doGet method in MoviesServlet File ");
		System.out.println("------------------------------------------");
		String id = req.getParameter("id");
		String movie = req.getParameter("movie_name");
		String language = req.getParameter("language");
		String country = req.getParameter("country");
		String hero = req.getParameter("hero");
		String heroine = req.getParameter("heroine");
		String villain = req.getParameter("villain");
		String director = req.getParameter("director");
		String producer = req.getParameter("producer");
		String producer2 = req.getParameter("producer2");
		String cameraman = req.getParameter("cameraman");
		String lightman = req.getParameter("lightman");
		String sideactor = req.getParameter("sideactor");
		String musicMaster = req.getParameter("musicMaster");
		String danceMaster = req.getParameter("danceMaster");
		String fightmaster = req.getParameter("fightmaster");
		String shootingPlace = req.getParameter("shootingPlace");
		String yearRelease = req.getParameter("yearRelease");
		String budget = req.getParameter("budget");
		String noofRecords = req.getParameter("noofRecords");
		String noofAwards = req.getParameter("noofAwards");
		String releasedate = req.getParameter("releasedate");

		System.out.println(id);
		System.out.println(movie);
		System.out.println(language);
		System.out.println(country);
		System.out.println(hero);
		System.out.println(heroine);
		System.out.println(villain);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(producer2);
		System.out.println(cameraman);
		System.out.println(lightman);
		System.out.println(sideactor);
		System.out.println(musicMaster);
		System.out.println(danceMaster);
		System.out.println(fightmaster);
		System.out.println(shootingPlace);
		System.out.println(yearRelease);
		System.out.println(budget);
		System.out.println(noofRecords);
		System.out.println(noofAwards);
		System.out.println(releasedate);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<span>");
		writer.println("Movie Name : " + movie + "is sent succesfully ");
		writer.println("Movie Name : " + language + "is sent succesfully ");
		writer.println("Movie Name : " + releasedate + "is sent succesfully ");

		writer.print("</span>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		// This will be understand to browser and write html or plain
		System.out.println("-----------------------------------");

	}

}
