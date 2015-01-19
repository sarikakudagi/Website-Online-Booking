package com.ilp.util;
import java.sql.*;

public class DBConnection {
	private static Connection con;

	public static Connection createConnection() {
		try {
			if (con == null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection(
						"jdbc:oracle:thin:@172.25.192.71:1521:javadb",
						"H74ORAUSER6D", "tcshyd");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

