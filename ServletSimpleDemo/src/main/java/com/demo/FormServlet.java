package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FormServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<DOCTYPE html>\n" + 
					"<html>\n" + 
					"<head><title> A Test Servlet </title></head>" +
					"<body bgcolor=\"#fdf5e6\">\n" + 
					"<h1>Testing.)</h1>" +
					request.getParameter("number1") + "\n" +
					"<p> and it's working) </p>\n" + 
					"</body></html>");
	}
}
