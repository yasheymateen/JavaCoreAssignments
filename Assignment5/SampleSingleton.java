package com.ss.day5.assignment;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SampleSingleton {
	
	// variable needs to be volatile to ensure thread safety
	// so multiple classes and methods can use it at same time from memory
	private static volatile Connection conn = null;
	private static volatile SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		return instance;
	}
	
	// took out the static keyword since method needs to be instantiated
	public void databaseQuery(BigDecimal input) {
		try {
			
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			// changed from Int to Bigdecimal since that is the input we are using
			BigDecimal x = new BigDecimal(0);
			while(rs.next()) {
				// instantiated BigDecimal input and used multiply method rather than *
				x = new BigDecimal(rs.getInt(1)).multiply(input);
			}
			// added checking for SQLException queries
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
