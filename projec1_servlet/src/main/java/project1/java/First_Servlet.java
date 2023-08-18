package project1.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First_Servlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("first java servlet code");
		PrintWriter obj = resp.getWriter();
		obj.print("<h1>Servlet code</h1>");
		obj.print("<h2>Servlet code</h2>");
		obj.print("<h3>Servlet code</h3>");
		obj.print("<h4>Servlet code</h4>");
		obj.print("<h5>Servlet code</h5>");
		obj.print("<h1>HTML links</h1>");
		obj.print("<a href=\"https://www.w3schools.com\">This is w3schools link</a>");
	}
	
}

