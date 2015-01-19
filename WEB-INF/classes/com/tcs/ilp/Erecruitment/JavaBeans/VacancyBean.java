package com.tcs.ilp.Erecruitment.JavaBeans;

import java.util.Date;

//import java.sql.Date;



public class VacancyBean {
	private String vacancyRequestID;
	private String skillSet;
	private int nPositions;
	private String businessDomain;
	private String location;
	private String required_by_date;
	private int experience;
	private String status;
	private String recruitmentRequestID;
	
	public VacancyBean()
	{
	
	}

	public VacancyBean(String skillSet, int nPositions,
			String businessDomain, String location, String requiredByDate,int experience) {
		super();
		this.vacancyRequestID = null;
		this.skillSet = skillSet;
		this.nPositions = nPositions;
		this.businessDomain = businessDomain;
		this.location = location;
		this.required_by_date = requiredByDate;
		this.status = "open";
		this.recruitmentRequestID="";
		this.experience=experience;
	}
		public VacancyBean(String skillSet, int nPositions,
				String businessDomain, String location, String requiredByDate,int experience,String vacancyRequestID) {
			super();
			this.vacancyRequestID =vacancyRequestID ;
			this.skillSet = skillSet;
			this.nPositions = nPositions;
			this.businessDomain = businessDomain;
			this.location = location;
			this.required_by_date = requiredByDate;
			this.status = "open";
			this.recruitmentRequestID="";
			this.experience=experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getVacancyRequestID() {
		return vacancyRequestID;
	}

	public void setVacancyRequestID(String vacancyRequestID) {
		this.vacancyRequestID = vacancyRequestID;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public int getnPositions() {
		return nPositions;
	}

	public void setnPositions(int nPositions) {
		this.nPositions = nPositions;
	}

	public String getBusinessDomain() {
		return businessDomain;
	}

	public void setBusinessDomain(String businessDomain) {
		this.businessDomain = businessDomain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRequired_by_date() {
		return required_by_date;
	}

	public void setRequired_by_date(String requiredByDate) {
		required_by_date = requiredByDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRecruitmentRequestID() {
		return recruitmentRequestID;
	}

	public void setRecruitmentRequestID(String recruitmentRequestID) {
		this.recruitmentRequestID = recruitmentRequestID;
	}

	
}
