package com.test;

import java.io.IOException;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

		DAOLogin log = new DAOLogin();
		AdminBean bean = log.getLogin(uname, pass);
		System.out.println(bean);
		if(bean==null) {
			req.setAttribute("msg", "Invalid Process..<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Admin.jsp");
			rd.forward(req, res);
			
		}
		else {
			ServletContext sct = req.getServletContext();
			sct.setAttribute("ubean", bean); // adding bean to context object
			Cookie ck = new Cookie("fname", bean.getFname());
			res.addCookie(ck);// Cookie added to response
			
			RequestDispatcher rd = req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}
		
	}

}
