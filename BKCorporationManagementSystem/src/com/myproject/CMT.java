package com.myproject;

import java.util.Date;

public class CMT {
	private String soID;
	private Date ngayCap;
	private String noiCap;
	
	public CMT(String soID, Date ngayCap, String noiCap) {
		this.soID = soID;
		this.ngayCap = ngayCap;
		this.noiCap = noiCap;
	}

	public String getSoID() {
		return soID;
	}
	public void setSoID(String soID) {
		this.soID = soID;
	}
	public Date getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}
	public String getNoiCap() {
		return noiCap;
	}
	public void setNoiCap(String moiCap) {
		this.noiCap = noiCap;
	}
	
}
