package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Addservlet extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  String username = req.getParameter("username");
  String password = req.getParameter("password");
  PrintWriter pWriter = resp.getWriter();
  pWriter.println("username:"+username);
  pWriter.println("password:"+password);
}
}
