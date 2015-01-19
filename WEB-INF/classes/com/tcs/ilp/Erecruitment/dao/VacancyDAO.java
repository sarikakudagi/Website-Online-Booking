package com.tcs.ilp.Erecruitment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import oracle.sql.DATE;

import com.tcs.ilp.Erecruitment.JavaBeans.VacancyBean;
import com.tcs.ilp.Erecruitment.utilities.ConnectionManagement;

public class VacancyDAO {
	private static Connection con;
	
	public VacancyDAO(){
		try
		{
		con=ConnectionManagement.getConnection();
		}
		catch(SQLException s)
		{
		s.printStackTrace();	
		}
	}
	
	public static boolean insertVacancy(VacancyBean V){
		//String query2="to_date(V.getRequired_by_date(),'yyyy-mm-dd'))";
		//String insertVacancyQuery="insert into vacancy values(?,?,?,?,?,)+"+query2+",?,?,?,?)";
		String insertVacancyQuery="insert into vacancy values(?,?,?,?,?,?,?,?,?)";
		try{
			con=ConnectionManagement.getConnection();
			
			PreparedStatement insertVacancy = con.prepareStatement(insertVacancyQuery);
			
			insertVacancy.setString(1,V.getVacancyRequestID());
			insertVacancy.setString(2,V.getSkillSet());
			System.out.println(V.getSkillSet());
			insertVacancy.setInt(3,V.getnPositions());
			insertVacancy.setString(4,V.getBusinessDomain());
			insertVacancy.setString(5,V.getLocation());
			insertVacancy.setString(6,V.getRequired_by_date());
			insertVacancy.setString(7,"open");
			insertVacancy.setString(8,"null");
			insertVacancy.setInt(9,V.getExperience());
			
			
		    boolean success=insertVacancy.execute();
		    con.commit();
		    
		    return success;
			
		}catch(SQLException e){
			return false;
		}
		
	}
	
	public static boolean deleteVacancy(String VacancyRequestID){
		String deleteQuery="delete from Vacancy where VacancyRequestID=?";
		try
		{
		PreparedStatement deleteVacancy=con.prepareStatement(deleteQuery);
		deleteVacancy.setString(1,VacancyRequestID);
		int success=deleteVacancy.executeUpdate();
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
	
	public static boolean updateVacancy(VacancyBean V){
		String updateQuery="update vacancy set skillset=?,no_of_positions=?,bdomain=?,location=?,required_by_date=? where vacancyrid=?";
		try
		{
			con=ConnectionManagement.getConnection();
			System.out.println(con);
		PreparedStatement updateVacancy=con.prepareStatement(updateQuery);
		updateVacancy.setString(1,V.getSkillSet());
		System.out.println(V.getSkillSet());
		
		updateVacancy.setInt(2,V.getnPositions());
		System.out.println(V.getnPositions());
		
		updateVacancy.setString(3,V.getBusinessDomain());
		System.out.println(V.getBusinessDomain());
		
		updateVacancy.setString(4,V.getLocation());
		System.out.println(V.getLocation());
		
		updateVacancy.setString(5,V.getRequired_by_date());
		System.out.println(V.getRequired_by_date());
		
		updateVacancy.setString(6,V.getVacancyRequestID());
		System.out.println(V.getVacancyRequestID());
		
		
		int success=updateVacancy.executeUpdate();
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

	public static ResultSet fetchvalues()
	{
	Connection con=null;
	ResultSet res=null;
	try {
		con = ConnectionManagement.getConnection();
		String query="select * from vacancy";
		PreparedStatement stmt=con.prepareStatement(query);
		res=stmt.executeQuery();
		/*while(res.next())
		{
			System.out.println(res.getString("vacancyrid"));
		}*/
		return res;
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return res;
	}
	
	}
	
	
}

