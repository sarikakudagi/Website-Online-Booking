package com.tcs.ilp.Erecruitment.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.ilp.Erecruitment.JavaBeans.*;
import com.tcs.ilp.Erecruitment.utilities.ConnectionManagement;
public class VacancyRequestDAO {
	private static Connection con;
	public VacancyRequestDAO()
	{
		try
		{
		con=ConnectionManagement.getConnection();
		}
		catch(SQLException s)
		{
		s.printStackTrace();	
		}
	}
	
	public static boolean insertVacancyRequest(VacancyRequestBean VR)
	{
		Connection con=null;
	try
	{
	
	String insertQuery="insert into VacancyRequest values(?,?,?,?)";
	con=ConnectionManagement.getConnection();
	PreparedStatement insertVacancyRequest = con.prepareStatement(insertQuery);
	insertVacancyRequest.setString(1,VR.getVacancyRequestID());
	insertVacancyRequest.setInt(2,VR.getEmployeeID());
	insertVacancyRequest.setInt(3,VR.getProjectID());
	String status=VR.getIsApproved();
	insertVacancyRequest.setString(4,status);	
	boolean success=insertVacancyRequest.execute();
	con.commit();
	return success;
	}
	catch(SQLException s)
	{
		s.printStackTrace();
	return false;
	}
}
	
	public static boolean deleteVacancy(String VacancyRequestID)
	{
	String deleteQuery="delete from VacancyRequest where VacancyRequestID=?";
	try
	{
	PreparedStatement deleteVacancyRequest=con.prepareStatement(deleteQuery);
	deleteVacancyRequest.setString(1,VacancyRequestID);
	int success=deleteVacancyRequest.executeUpdate();
	if(success==1)
		return true;
	else
		return false;
	}
	catch(SQLException s)
	{
	return false;	
	}
}
	public static ResultSet fetchValues()
	{	Connection con=null;
		ResultSet res=null;
		String query="select * from VacancyRequest";
		try
		{
			con=ConnectionManagement.getConnection();
			PreparedStatement stmt=con.prepareStatement(query);
			res=stmt.executeQuery();
			return res;
		}
		catch(SQLException s)
		{
			s.printStackTrace();
			return res;
		}
	}
	
	public static boolean updateVacancyRequest(String vacancyRid,String value)
	{
		String query="update vacancyrequest set isapproved=?";
		try
		{
		con=ConnectionManagement.getConnection();
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1,value);
		int res=stmt.executeUpdate();
		if(res==1)
			return true;
		else
			return false;
		}
		catch(SQLException s)
		{
			s.printStackTrace();
			return false;
		}
	}
}
