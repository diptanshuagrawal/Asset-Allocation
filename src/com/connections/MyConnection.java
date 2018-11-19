package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static Connection con;
	
	static public Connection openConnection() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			
			con=DriverManager.getConnection("jdbc:sqlserver://testdb.cqvewblprryo.ap-south-1.rds.amazonaws.com:1433;databaseName=asset_allocation", "chiragtank749", "Dontusethis");
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}	
}
