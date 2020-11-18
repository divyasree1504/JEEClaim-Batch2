package com.insurance.claim.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con=null;
	public static Connection getConnection(){
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "Divya1599";
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
