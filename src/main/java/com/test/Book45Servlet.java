package com.test;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/view")
public class Book45Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if (c == null) {
			req.setAttribute("msg", "Session expired...<br>");
		} 
		else {
			String fn = c[0].getValue();
			req.setAttribute("fname", fn);
			
			BookDAO bDao = new BookDAO();
			List<BookBean> bb = bDao.getBookDetails();
			
			if (bb == null) {
				req.setAttribute("msg", "Invalid Process..<br>");
				RequestDispatcher rd = req.getRequestDispatcher("Admin.jsp");
				rd.forward(req, res);
			} else {
				HttpSession hs = req.getSession();
				System.out.println(bb);
				hs.setAttribute("bk", bb);
				
				RequestDispatcher rd = req.getRequestDispatcher("Book.jsp");
				rd.forward(req, res);
			}
		}
	
	}

}
