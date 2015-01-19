package com.tcs.ilp.Erecruitment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tcs.ilp.Erecruitment.JavaBeans.LoginBean;
import com.tcs.ilp.Erecruitment.utilities.ConnectionManagement;

public class loginDAO {
	
	public static boolean check(LoginBean l)
	{
		int eid1=l.getEmpid();
		System.out.println(eid1);
		String psswd=l.getPassword();
		System.out.println(psswd);
		ResultSet res=fetchvalues(eid1);
		//System.out.println(res);
		
		try
		{
		res.next();
		String actualPassword=res.getString("password");
	
		System.out.println(actualPassword);
		System.out.println(psswd.equals(actualPassword));
		if(psswd.equals(actualPassword))
		{
			return true;
		}
		else
			return false;
		}
		catch(Exception s)
		{
			s.printStackTrace();
			return false;
		}
		
	}
	
	public static String getDesignation(LoginBean l)
	{
		int eid=l.getEmpid();
		ResultSet res=fetchvalues(eid);
		String desgn=null;
		try
		{
		res.next();
		desgn=res.getString("designation");
		return desgn;
		}
		catch(Exception s)
		{
			s.printStackTrace();
			return desgn;
		}
	}
	
	public static ResultSet fetchvalues(int eid1)
	{	ResultSet res=null;
		String query="select * from logindetails where eid=?";
		try
		{
		Connection con=ConnectionManagement.getConnection();
		System.out.println(con);
		PreparedStatement validate=con.prepareStatement(query);
		//System.out.println(validate);
		validate.setInt(1, eid1);
		res=validate.executeQuery();
		//System.out.println(res);
		return res;
		}
		catch(Exception s)
		{
			s.printStackTrace();
			return res;
		}
		
	}

}
