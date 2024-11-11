package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDAORegister {
	private int k;
	public int inserAdmin(AdminBean ab) {
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO ADMIN VALUES(?,?,?,?,?,?)");
			ps.setString(1, ab.getUname());
			ps.setString(2, ab.getPass());
			ps.setString(3, ab.getFname());
			ps.setString(4, ab.getLname());
			ps.setString(5, ab.getMail());
			ps.setLong(6, ab.getMob());
			
			k = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
