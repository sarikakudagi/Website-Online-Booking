package com.ilp.dao;
import com.ilp.bean.*;
import com.ilp.util.*;
import java.sql.*;
import java.util.ArrayList;
public class custDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	loginBean lb;

	
	
	public String login(loginBean lb)
	{
		con=DBConnection.createConnection();
		String username="";
		try{
		ps=con.prepareStatement("select * from PROFILE_671389 where password=(?)");
		
		ps.setString(1,lb.getPassword());
		rs=ps.executeQuery();

		
	
		if(rs.next())
		{
			username=rs.getString(1);
			return username;
			
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return username;
	}	
	public String login1(loginBean lb)
	{
		con=DBConnection.createConnection();
		String username="";
		try{
		ps=con.prepareStatement("select * from PROFILE_671389 where password=(?)");
		
		ps.setString(1,lb.getPassword());
		rs=ps.executeQuery();

		
		System.out.println(username);
		if(rs.next())
		{
			username=rs.getString(1);
			return username;
			
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return username;
	}	
	
	
	public int addCust(custBean cb)
	{
		int add=0;
			con=DBConnection.createConnection();
			try
			{
				ps=con.prepareStatement("insert into CUST_671389 values(?,?,?,?)");
				ps.setString(1,cb.getName());
				ps.setInt(2, cb.getAge());
				ps.setString(3,cb.getEmail());
				ps.setString(4,cb.getPhone());
				
				add=ps.executeUpdate();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return add;
		
	}
	
	public int addVen(venBean vb)
	{
		int addven=0;
			con=DBConnection.createConnection();
			try
			{
				ps=con.prepareStatement("insert into VENDOR_671389 values(?,?,?,?,?)");
				ps.setString(1,vb.getCname());
				ps.setString(2, vb.getUsername());
				ps.setString(3,vb.getBus_type());
				ps.setString(4, vb.getEmail());
				ps.setString(5, vb.getPhone());
				addven=ps.executeUpdate();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return addven;
		
	}
	public int bookTicket(bookBean bb)
	{
		int book=0;
		
			con=DBConnection.createConnection();
			try
			{
				ps=con.prepareStatement("insert into TICKETS1_671389 values(?,?,?,?,?)");
				ps.setString(1, bb.getVtype());
				ps.setString(2, bb.getFrom());
				ps.setString(3, bb.getTo());
				ps.setString(4, bb.getSeat());
				ps.setInt(5,bb.getTno());
				book=ps.executeUpdate();
			
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return book;
		
	}
	public int cancel(bookBean bb)
	{
		int cancel=0;
		con=DBConnection.createConnection();
		try
		{
			ps=con.prepareStatement("delete from TICKETS1_671389 where tno=?");
			ps.setInt(1,bb.getTno());
			cancel=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cancel;
	}
	public int update(bookBean bb)
	{
		int update=0;
		con=DBConnection.createConnection();
		try
		{
			ps=con.prepareStatement("update TICKETS1_671389 set TOPLACE=? where tno=?");
			ps.setString(1,bb.getTo());
			ps.setInt(2,bb.getTno());
			update=ps.executeUpdate();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return update;
	}
	
	
	public ArrayList<bookBean> view(bookBean bb)
	{
		
		con=DBConnection.createConnection();
		ArrayList<bookBean> list = new ArrayList<bookBean>();
		try{
			ps=con.prepareStatement("select * from TICKETS1_671389 where tno=?");
			ps.setInt(1,bb.getTno());
		rs=ps.executeQuery();
			bookBean bb2;
			while(rs.next())
			{
				
				bb2=new bookBean();
				bb2.setVtype(rs.getString(1));
				bb2.setFrom(rs.getString(2));
				bb2.setTo(rs.getString(3));
				bb2.setSeat(rs.getString(4));
				bb2.setTno(rs.getInt(5));
				list.add(bb2);
			}
			
			
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	public int addVehicle(vehBean v)
	{
		int add=0;
		con=DBConnection.createConnection();
		try{
			ps=con.prepareStatement("insert into VEHICLE_671389 values(?,?)");
			ps.setString(1,v.getVehice_type());
			ps.setInt(2,v.getVno());
			add=ps.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return add;
	}
	public int cancelVeh(vehBean v)
	{
		int cancel=0;
		con=DBConnection.createConnection();
		try
		{
			ps=con.prepareStatement("delete from VEHICLE_671389 where vno=?");
			ps.setInt(1, v.getVno());
			cancel=ps.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cancel;
	}
	public ArrayList<vehBean> viewVeh(vehBean v)
	{
		con=DBConnection.createConnection();
		ArrayList<vehBean> list=new ArrayList<vehBean>();
		vehBean vv=new vehBean();
		try{
			ps=con.prepareStatement("select * from VEHICLE_671389 where vno=?");
			ps.setInt(1,v.getVno());
			rs=ps.executeQuery();
			while(rs.next())
			{
			vv.setVehice_type(rs.getString(1));
			vv.setVno(rs.getInt(2));
			list.add(vv);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	public int editVeh(vehBean v)
	{
		int edit=0;
		con=DBConnection.createConnection();
		try{
			ps=con.prepareStatement("update VEHICLE_671389 set vtype=? where vno=?");
			ps.setString(1,v.getVehice_type());
			ps.setInt(2,v.getVno());
			
			edit=ps.executeUpdate();
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		return edit;
	}


}
 