package com.test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BookBean bb = new BookBean();
		bb.setBcode(req.getParameter("bcode"));
		bb.setBname(req.getParameter("bname"));
		bb.setAuthor(req.getParameter("author"));
		bb.setPrice(Double.parseDouble(req.getParameter("price")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		BookDAO dao = new BookDAO();
		int k = dao.addBook(bb);
		if(k>0) {
			req.setAttribute("msg", "Book added successfully...");
			req.getRequestDispatcher("Admin.jsp").forward(req, res);
		}
	}

}
