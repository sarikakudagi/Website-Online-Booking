package com.tcs.ilp.Erecruitment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tcs.ilp.Erecruitment.JavaBeans.PlacementConsultantBean;
import com.tcs.ilp.Erecruitment.utilities.ConnectionManagement;

public class PlacementConsultantDAO {
	private static Connection con;

	public PlacementConsultantDAO(){
		try
		{
			con=ConnectionManagement.getConnection();
		}
		catch(SQLException s)
		{
			s.printStackTrace();	
		}
	}


	public boolean insertPlacementConsultant(PlacementConsultantBean P){
		String insertQuery="insert into placementconsultant where(?,?,?,?)";
		try{
			PreparedStatement insertConsultant = con.prepareStatement(insertQuery);

			insertConsultant.setInt(1,P.getPlacementID());
			insertConsultant.setString(2,P.getName());
			insertConsultant.setString(3,P.getUserName());
			insertConsultant.setString(4,P.getPassword());

			boolean success=insertConsultant.execute();
			if(success)
				return true;
			else
				return false;

		}catch(SQLException e){
			return false;
		}
	}
	
	public boolean deletePlacementConsultant(int PlacementID){
		String deleteQuery="delete from placementconsultant where plcid=?";
		try{
			PreparedStatement deleteVacancy=con.prepareStatement(deleteQuery);
			return false;
		}catch(SQLException e){
			return false;
		}
	}

}
