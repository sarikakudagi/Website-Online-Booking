package com.tcs.ilp.Erecruitment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.Erecruitment.JavaBeans.LoginBean;
import com.tcs.ilp.Erecruitment.dao.loginDAO;

/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid=request.getParameter("empid");
		int eid1=Integer.parseInt(eid);
		
		String psswd=request.getParameter("psswd");
		//System.out.println(eid+psswd);
		LoginBean l=new LoginBean(eid1,psswd);
		l.getPassword();
		boolean b=loginDAO.check(l);
		HttpSession session=request.getSession(true);
		session.setAttribute("empid", eid1);
		if(b)
		{
			String desgn=loginDAO.getDesignation(l);
			if(desgn.equals("employee"))
			{
				RequestDispatcher Rd=request.getRequestDispatcher("/JSP/Employee.jsp");
				Rd.include(request, response);	
			}
			else if(desgn.equals("HR"))
			{
				RequestDispatcher Rd=request.getRequestDispatcher("/JSP/HR.jsp");
				Rd.include(request, response);
			}
			else
			{
				RequestDispatcher Rd=request.getRequestDispatcher("/JSP/UnitHead.jsp");
				Rd.include(request, response);
			}
		}
		else
		{
		RequestDispatcher Rd=request.getRequestDispatcher("/JSP/login.jsp");
		Rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
