package com.myproject;

import java.util.Date;

public class PhoPhong extends CanBoCoHuu implements LanhDao{

	public PhoPhong(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}
	
	public double tinhLuong() {
		return super.tinhLuong() + PHU_CAP_LD;
				
	}

}
