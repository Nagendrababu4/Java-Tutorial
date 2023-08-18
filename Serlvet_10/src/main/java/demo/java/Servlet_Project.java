package demo.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("login")
public class Servlet_Project extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("usrname");
		String password = req.getParameter("password");
		
		System.out.println("loged in");
		
		PrintWriter obj = resp.getWriter();
		obj.println("Usrname: "+username);
		obj.println("Password: "+password);
		System.out.println("loged in successfully");
	}

}
