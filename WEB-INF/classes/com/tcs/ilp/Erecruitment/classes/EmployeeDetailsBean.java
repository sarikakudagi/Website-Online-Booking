package com.tcs.ilp.Erecruitment.classes;

import java.util.Date;

public class EmployeeDetailsBean {
	
	private int empid;
	private Date Dob;
	private Date Doj;
	private String gender;
	private float CTC;
	private String designation;
	private String division;
	public EmployeeDetailsBean(int empid, Date dob, Date doj, String gender,
			float cTC, String designation, String division) {
		super();
		this.empid = empid;
		Dob = dob;
		Doj = doj;
		this.gender = gender;
		CTC = cTC;
		this.designation = designation;
		this.division = division;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public Date getDoj() {
		return Doj;
	}
	public void setDoj(Date doj) {
		Doj = doj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getCTC() {
		return CTC;
	}
	public void setCTC(float cTC) {
		CTC = cTC;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	

}
