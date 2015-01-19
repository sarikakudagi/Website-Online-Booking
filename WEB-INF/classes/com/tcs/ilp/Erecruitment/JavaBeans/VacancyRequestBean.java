package com.tcs.ilp.Erecruitment.JavaBeans;

public class VacancyRequestBean {
	
	private String vacancyRequestID;
	private int employeeID;
	private int projectID;
	private String isApproved;
	
	public VacancyRequestBean(){
		
	}
	public VacancyRequestBean(int employeeID,
			int projectID) {
		super();
		this.vacancyRequestID = null;
		this.employeeID = employeeID;
		this.projectID = projectID;
		this.isApproved = "false";
	}
	
	
	public String getVacancyRequestID() {
		return vacancyRequestID;
	}
	public void setVacancyRequestID(String vacancyRequestID) {
		this.vacancyRequestID = vacancyRequestID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public String getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}
	

}
