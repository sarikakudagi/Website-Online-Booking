package com.tcs.ilp.Erecruitment.JavaBeans;

public class PlacementConsultantBean {
	private int PlacementID;
	private String name;
	private String userName;
	private String password;

    public PlacementConsultantBean(){
    	
    }

	public int getPlacementID() {
		return PlacementID;
	}

	public void setPlacementID(int placementID) {
		PlacementID = placementID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
