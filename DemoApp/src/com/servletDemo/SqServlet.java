package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter wr = res.getWriter();
		wr.println("Hello from SqServlet");
		
		//incase of requestDispatcher
//		int k =(int) req.getAttribute("k");
//		k=k*k;
//		wr.println("Result is "+k);
		
		//getting attributes value from session
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		
		//getting cookies
//		Cookie cookies[]=req.getCookies();
//		for(Cookie c : cookies){
//			if(c.getName().equals("k"))
//				k=Integer.parseInt(c.getValue());
//		}
//		wr.println("Result is "+ k);
		
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
