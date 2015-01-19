package com.tcs.ilp.Erecruitment.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManagement 
{
	private static Connection con;
	static String url="jdbc:oracle:thin:@172.25.192.71:1521:javadb";
	static String un="H82ORAUSER4D";
	static String pw="tcshyd";
	static
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, un, pw);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()throws SQLException
	{
		if(con.isClosed())
		{
			con=DriverManager.getConnection(url, un, pw);
			return con;
		}
		else
		{
			return con;
		}
	}
}
