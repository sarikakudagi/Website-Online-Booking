package com.tcs.ilp.Erecruitment.JavaBeans;

public class RecruitmentVacancyBean {
      private String recruitmentRequestID;
      private String vacancyRequestID;
      private String recruitmentStatus;
      
      public RecruitmentVacancyBean(){
    	  
      }

	public RecruitmentVacancyBean(String recruitmentRequestID,
			String vacancyRequestID, String recruitmentStatus) {
		super();
		this.recruitmentRequestID = recruitmentRequestID;
		this.vacancyRequestID = vacancyRequestID;
		this.recruitmentStatus = recruitmentStatus;
	}

	public String getRecruitmentRequestID() {
		return recruitmentRequestID;
	}

	public void setRecruitmentRequestID(String recruitmentRequestID) {
		this.recruitmentRequestID = recruitmentRequestID;
	}

	public String getVacancyRequestID() {
		return vacancyRequestID;
	}

	public void setVacancyRequestID(String vacancyRequestID) {
		this.vacancyRequestID = vacancyRequestID;
	}

	public String getRecruitmentStatus() {
		return recruitmentStatus;
	}

	public void setRecruitmentStatus(String recruitmentStatus) {
		this.recruitmentStatus = recruitmentStatus;
	}
      
      
}
