package com.ilp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ilp.bean.*;
import com.ilp.util.*;
import com.ilp.dao.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loginBean lb=new loginBean();
		custBean cb= new custBean();
		venBean vb=new venBean();
		bookBean bb=new bookBean();
		vehBean v=new vehBean();
		
		custDAO cd=new custDAO();
		String hidden=request.getParameter("hidden");
		
		if(hidden.equals("login"))
		{
			
			String username=request.getParameter("uname");
			String password=request.getParameter("password");
			
			lb.setUsername(username);
			lb.setPassword(password);
			
			String pass=cd.login(lb);
			
			if(pass.equals(username))
				
			{
				
				getServletContext().getRequestDispatcher("/custHomePage.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);	
			}
		}
		if(hidden.equals("login1"))
		{
			System.out.println("hello");
			String username=request.getParameter("uname");
			String password=request.getParameter("password");
			
			lb.setUsername(username);
			lb.setPassword(password);
			
			String pass=cd.login1(lb);
			
			if(pass.equals(username))
				
			{
				
				getServletContext().getRequestDispatcher("/venHomePage.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);	
			}
		}
		
		
		if(hidden.equals("custRegister"))
			
		{
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age"));
			String email=request.getParameter("email");
			String pno=request.getParameter("pno");
			
			cb.setName(name);
			cb.setAge(age);
			cb.setEmail(email);
			cb.setPhone(pno);
			
			int add=cd.addCust(cb);
			if(add>0)
			{
				getServletContext().getRequestDispatcher("/custHomePage.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
		if(hidden.equals("venRegister"))
			
		{
			String cname=request.getParameter("cname");
			String name=request.getParameter("name");
			String vtype=request.getParameter("vtype");
			String email=request.getParameter("email");
			String pno=request.getParameter("pno");
			
			vb.setCname(cname);
			vb.setUsername(name);
			vb.setBus_type(vtype);
			
			vb.setEmail(email);
			vb.setPhone(pno);
			
			int addven=cd.addVen(vb);
			if(addven>0)
			{
				getServletContext().getRequestDispatcher("/venHomePage.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
		if(hidden.equals("book"))
			
		{
			Random rd=new Random();
			int a=rd.nextInt(100000);
			String vtype=request.getParameter("vtype");
			String from=request.getParameter("from");
			String to=request.getParameter("to");
			String seat=request.getParameter("seat");
			
			
			bb.setVtype(vtype);
			bb.setFrom(from);
			bb.setTo(to);
			bb.setSeat(seat);
			bb.setTno(a);
		
			int book=cd.bookTicket(bb);
			if(book>0)
			{
				
				getServletContext().getRequestDispatcher("/bookSuccess.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
		if(hidden.equals("cancel"))
		{
			int tno=Integer.parseInt(request.getParameter("cancel"));
			bb.setTno(tno);
			int cancel=cd.cancel(bb);
			if(cancel>0)
			{
				
				getServletContext().getRequestDispatcher("/cancelSuccess.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
		if(hidden.equals("update"))
		{
			int tno=Integer.parseInt(request.getParameter("update"));
			String to=request.getParameter("to");
			bb.setTno(tno);
			bb.setTo(to);
			int update=cd.update(bb);
			if(update>0)
			{
				
				getServletContext().getRequestDispatcher("/updateSuccess.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
			
		}
		if(hidden.equals("view"))
		{
			int tno=Integer.parseInt(request.getParameter("view"));
			bb.setTno(tno);
			ArrayList<bookBean> list= new ArrayList<bookBean>();
			list=cd.view(bb);
			request.setAttribute("bean", list);
			
				
				getServletContext().getRequestDispatcher("/viewSuccess.jsp").forward(request,response);
			
		
			
		}
		if(hidden.equals("addVeh"))
		{
			String vtype=request.getParameter("vtype");
			int vno=Integer.parseInt(request.getParameter("vno"));
			
			v.setVehice_type(vtype);
			v.setVno(vno);
			
			int c=cd.addVehicle(v);
			if(c>0)
			{
				getServletContext().getRequestDispatcher("/bookSuccess1.jsp").forward(request,response);
			}
			
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
			
			
			
		}
		if(hidden.equals("cancelVeh"))
		{
			int vno=Integer.parseInt(request.getParameter("vno"));
			
			v.setVno(vno);
			int cancel=cd.cancelVeh(v);
			if(cancel>0)
			{
				getServletContext().getRequestDispatcher("/cancelSuccess1.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
		}
		if(hidden.equals("viewVeh"))
		{
			int vno=Integer.parseInt(request.getParameter("vno"));
			
			v.setVno(vno);
			
			ArrayList<vehBean> list=cd.viewVeh(v);
			request.setAttribute("veh", list);
			getServletContext().getRequestDispatcher("/viewSuccess1.jsp").forward(request,response);
		}
		if(hidden.equals("editVeh"))
		{
			int vno=Integer.parseInt(request.getParameter("vno"));
			String vtype=request.getParameter("vtype");
			
			v.setVno(vno);
			v.setVehice_type(vtype);
			
			int edit=cd.editVeh(v);
			if(edit>0)
			{
				getServletContext().getRequestDispatcher("/updateSuccess.jsp").forward(request,response);
			}
			else
			{
				getServletContext().getRequestDispatcher("/error.jsp").forward(request,response);
			}
			
			
		}
		
		
		
		
	}

}
