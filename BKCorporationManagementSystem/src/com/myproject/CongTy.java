package com.myproject;

import java.util.ArrayList;

public class CongTy {

	private String tenCongTy;
	private PhongBan[] phongBan;
	private GiamDoc giamDoc;
	private PhoGiamDoc[] phoGiamDoc;
	
	public CongTy(String tenCongTy, PhongBan[] phongBan, GiamDoc giamDoc, PhoGiamDoc[] phoGiamDoc) {
		this.tenCongTy = tenCongTy;
		this.phongBan = phongBan;
		this.giamDoc = giamDoc;
		this.phoGiamDoc = phoGiamDoc;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	
	


	
}
