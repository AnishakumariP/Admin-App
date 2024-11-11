package com.test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session expired...");
			req.getRequestDispatcher("Admin.jsp").forward(req, res);
			
		}
		else {
			String fn = c[0].getValue();
			ServletContext sct = req.getServletContext();
			AdminBean ab = (AdminBean)sct.getAttribute("ubean");
			ab.setFname(req.getParameter("fname"));
			ab.setLname(req.getParameter("lname"));
			ab.setMail(req.getParameter("mail"));
			ab.setMob(Long.parseLong(req.getParameter("mobile")));
			
			ProfileUpdateDAO dao = new ProfileUpdateDAO();
			int k = dao.updateProfile(ab);
			if(k>0) {
				req.setAttribute("fname", fn);
				req.setAttribute("msg", "Updated successfully!!<br>");
				req.getRequestDispatcher("updateProfile.jsp").forward(req, res);
			}
		}
	}

}
