package com.servletDemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter wr = res.getWriter();
		wr.println("Result is "+k);
		
		//using request dispatcher
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		//using session to pass the value
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//using cookie to send value
//		Cookie cookie = new Cookie("k", k + "");
//		res.addCookie(cookie);
//		res.sendRedirect("sq");

		//ServletContext and ServletConfig
//		ServletContext ctx = getServletContext();
//		String name = ctx.getInitParameter("name");
//		wr.println("Context name is "+name);
//		
//		ServletConfig cg = getServletConfig();
//		String name2 = cg.getInitParameter("name");
//		wr.println("Config name is "+name2);
	}
}
