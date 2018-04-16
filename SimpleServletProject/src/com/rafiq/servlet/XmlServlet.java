package com.rafiq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		writer.println("Hello from doGet: " + userName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		writer.println("Hello from doGet: " + userName + ", <br> Pass: " + userPassword);

		String prof = request.getParameter("pro");
		writer.println("Profession is: " + prof);

		// String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		writer.println("You are at " + location.length + " Places: ");
		for (int i = 0; i < location.length; i++) {
			writer.println(location[i]);
		}
	}
}
