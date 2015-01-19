package com.tcs.ilp.Erecruitment.controller;

import java.io.IOException;
//import java.sql.Date;
import java.sql.SQLException;
import java.util.Date;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.tcs.ilp.Erecruitment.JavaBeans.VacancyBean;
import com.tcs.ilp.Erecruitment.JavaBeans.VacancyRequestBean;
import com.tcs.ilp.Erecruitment.classes.Employee;
import com.tcs.ilp.Erecruitment.dao.EmployeeDAO;

/**
 * Servlet implementation class employeecontroller
 */
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val=request.getParameter("form");
		if(val.equals("raise")){
		HttpSession session=request.getSession();
		Object eid=session.getAttribute("empid");
		String eid1=eid.toString();
		int empid=Integer.parseInt(eid1);
		int pid=Employee.getPid(empid);
		String location=request.getParameter("location");
		String bDomain=request.getParameter("bdomain");
		String skill=request.getParameter("skill");
		String exp=request.getParameter("experience");
		System.out.println(exp);
		int experience=Integer.parseInt(exp);
		String rDate=request.getParameter("date");
		
		
		
		String nPositions=request.getParameter("npositions");
		int nPos=Integer.parseInt(nPositions);
		VacancyRequestBean VR=new VacancyRequestBean(empid,pid);
		//int vid=0;
		VacancyBean V=new VacancyBean(skill,nPos,bDomain,location,rDate,experience);
		try
		{
		Employee.raiseVacancyRequest(VR,V);
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		}
		else if(val.equals("edit"))
		{
			System.out.println("edit page");
			String vid=request.getParameter("vrid");
			
			String np=request.getParameter("npositions");
			int np1=Integer.parseInt(np);
			String bDomain=request.getParameter("bdomain");
			String skill=request.getParameter("skill");
			String exp=request.getParameter("experience");
			int exp1=Integer.parseInt(exp);
			String location=request.getParameter("location");
			String rDate=request.getParameter("date");
			VacancyBean V1=new VacancyBean(skill,np1,bDomain,location,rDate,exp1,vid);
			try
			{
			Employee.editVacancyRequest(V1);
			
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
			}
			
		
		else
		{
			System.out.println("default");
		}
	}


}
