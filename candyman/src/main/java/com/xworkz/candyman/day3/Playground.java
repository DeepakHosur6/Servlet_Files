package com.xworkz.candyman.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Hi", loadOnStartup = 1)
public class Playground extends HttpServlet {
	
	public Playground() {
		
		System.out.println("Constructor is Created : "+getClass().getName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in Playground");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Running Inside doGet in Playground ");
	}
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doPost in Playground");
		String data = "cricket, FootBall, BasketBall ,Baseball";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doPut in Playground");
		String data = "Badmition ";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doHead in Playground");
		String data = "Swmming ";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doDelete in Playground");
		String data = "cricket ";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doOptions in Playground");
		String data = "HandBall ";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Inside doTrace in Playground");
		String data = "Baseball ";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain"); //This will be understand to browser
		
	}
}
