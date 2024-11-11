package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session expired...");
			req.getRequestDispatcher("Admin.jsp").forward(req, res);
		}
		else {
			String fn = c[0].getValue();
			req.setAttribute("fname", fn);
			RequestDispatcher rd = req.getRequestDispatcher("EditProfile.jsp");
			rd.forward(req, res);
		}
	}

}
