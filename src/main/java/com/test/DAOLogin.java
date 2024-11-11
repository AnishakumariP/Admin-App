package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOLogin {
	
	public DAOLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminBean getLogin(String uname, String pass) {
		AdminBean ab = new AdminBean();
		try {
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM ADMIN WHERE uname=? AND password=?");
		ps.setString(1, uname);
		ps.setString(2, pass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			String userName = rs.getString(1);
			String paswr = rs.getString(2);
			String fname = rs.getString(3);
			String lname = rs.getString(4);
			String mail = rs.getString(5);
			long phno = rs.getLong(6);
			
			ab.setUname(userName);
			ab.setPass(paswr);
			ab.setFname(fname);
			ab.setLname(lname);
			ab.setMail(mail);
			ab.setMob(phno);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}

}
