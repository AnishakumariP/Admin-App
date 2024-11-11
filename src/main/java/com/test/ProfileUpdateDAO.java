package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProfileUpdateDAO {
	public int updateProfile(AdminBean ab) {
		int k = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement
	("UPDATE ADMIN SET FNAME=?, LNAME=?, EMAIL=?, PHNO=? WHERE UNAME=? AND PASSWORD=?");
			ps.setString(1, ab.getFname());
			ps.setString(2, ab.getLname());
			ps.setString(3, ab.getMail());
			ps.setLong(4, ab.getMob());
			ps.setString(5, ab.getUname());
			ps.setString(6, ab.getPass());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}

}
