package com.tcs.ilp.Erecruitment.JavaBeans;

public class LoginBean {
	private int empid;
	private String password;
	private String secquestion;
	private String ans;
	public LoginBean()
	{
		
	}
	public LoginBean(int empid, String password) {
		super();
		this.empid = empid;
		this.password = password;
		this.secquestion=null;
		this.ans=null;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecquestion() {
		return secquestion;
	}
	public void setSecquestion(String secquestion) {
		this.secquestion = secquestion;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	

}
