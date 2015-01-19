package com.tcs.ilp.Erecruitment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tcs.ilp.Erecruitment.utilities.ConnectionManagement;

public class EmployeeDAO {
	private static Connection con;
	
	public EmployeeDAO()
	{
		
	}
	
	public static ResultSet fetchEmployee(int eid)
	{
		ResultSet res=null;
		try
		{
		con=ConnectionManagement.getConnection();
		String query="select * from employee where eid=?";
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1,eid);
		res=stmt.executeQuery();
		return res;
		}
		catch(Exception s)
		{
			s.printStackTrace();
			return res;
		}
	}

}
