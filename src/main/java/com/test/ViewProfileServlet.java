package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/profile")
public class ViewProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		
		if(c==null) {
			req.setAttribute("msg", "Session expired...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Admin.jsp");
			rd.forward(req, res);
		}
		else {
			String fn = c[0].getValue();
			req.setAttribute("fname", fn);
			
			RequestDispatcher rd = req.getRequestDispatcher("viewProfile.jsp");
			rd.forward(req, res);
		}
	}

}
