package com.test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		AdminBean ab = new AdminBean();
		ab.setUname(req.getParameter("uname"));
		ab.setPass(req.getParameter("pass"));
		ab.setFname(req.getParameter("fname"));
		ab.setLname(req.getParameter("lname"));
		ab.setMail(req.getParameter("mail"));
		ab.setMob(Long.parseLong(req.getParameter("mobile")));
		
		AdminDAORegister dao = new AdminDAORegister();
		int k = dao.inserAdmin(ab);
		
		if(k>0) {
			req.setAttribute("msg", "Admin successfully inserted!!");
			RequestDispatcher rd = req.getRequestDispatcher("Admin.jsp");
			rd.forward(req, res);
		}
	}

}
