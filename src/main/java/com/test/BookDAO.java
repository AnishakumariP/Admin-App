package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<BookBean> getBookDetails() {
		BookBean bb =null;
		List<BookBean> bl=new ArrayList<BookBean>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Book45");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bb= new BookBean();
				bb.setBcode(rs.getString(1));
				bb.setBname(rs.getString(2));
				bb.setAuthor(rs.getString(3));
				bb.setPrice(rs.getDouble(4));
				bb.setQty(rs.getInt(5));
				bl.add(bb);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bl;
	}
	public int addBook(BookBean bb) {
		
		int k = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO BOOK45 VALUES(?,?,?,?,?)");
			ps.setString(1, bb.getBcode());
			ps.setString(2, bb.getBname());
			ps.setString(3, bb.getAuthor());
			ps.setDouble(4, bb.getPrice());
			ps.setInt(5, bb.getQty());
			k = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
