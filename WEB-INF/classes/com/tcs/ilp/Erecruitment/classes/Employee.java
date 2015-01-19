package com.tcs.ilp.Erecruitment.classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.ilp.Erecruitment.JavaBeans.VacancyBean;
import com.tcs.ilp.Erecruitment.JavaBeans.VacancyRequestBean;
import com.tcs.ilp.Erecruitment.dao.EmployeeDAO;
import com.tcs.ilp.Erecruitment.dao.VacancyDAO;
import com.tcs.ilp.Erecruitment.dao.VacancyRequestDAO;

public class Employee {
	
	public static void raiseVacancyRequest(VacancyRequestBean VR,VacancyBean V) throws SQLException
	{
	ResultSet res=VacancyRequestDAO.fetchValues();
	int length=0;
	if(res.equals(null))
	{
		String vacancyRequestID="vac"+length;
	}
	else
	{
	while(res.next())
	{
		length++;
	}
	}
	System.out.println(length);
	String vacancyRequestID="vac"+length;
	VR.setVacancyRequestID(vacancyRequestID);
	V.setVacancyRequestID(vacancyRequestID);
	boolean success=VacancyRequestDAO.insertVacancyRequest(VR);
	System.out.println(success);
	boolean status=VacancyDAO.insertVacancy(V);
	System.out.println(status);
	}
	public static void editVacancyRequest(VacancyBean V) throws SQLException
	{	System.out.println("hi");
		ResultSet res=VacancyDAO.fetchvalues();
		boolean flag=false;
		String rrid=null;
		System.out.println(V.getVacancyRequestID());
		while(res.next())
		{
			System.out.println(res.getString("vacancyrid"));
			if(res.getString("vacancyrid").equals(V.getVacancyRequestID()))
			{
			flag=true;
			rrid=res.getString("rrid");
			break;
			}
		}
		if(flag)
		{
		if(rrid.equals("null"))
		{
		boolean b=VacancyDAO.updateVacancy(V);
		boolean b1=VacancyRequestDAO.updateVacancyRequest(V.getVacancyRequestID(),"false");
		if(b)
		{
			System.out.println("updated");
		}
		else
		{
			System.out.println("not updated");
		}
		}
		}
	}

	public static int getPid(int eid)
	{	int pid=0;
		ResultSet res=EmployeeDAO.fetchEmployee(eid);
		try
		{
		res.next();
		pid=res.getInt("projectid");
		return pid;
		}
		catch(Exception s)
		{
			s.printStackTrace();
			return pid;
		}
	}

}
