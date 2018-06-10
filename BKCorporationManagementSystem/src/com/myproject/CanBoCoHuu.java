package com.myproject;

import java.util.Date;

public class CanBoCoHuu extends NhanVien{

	public static double luongCoBan = 3e6;
	private double heSoLuong;
	
	
	
	public CanBoCoHuu(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double  heSoLuong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi);
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong() {
		return luongCoBan * heSoLuong ;
	}
	
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	
	
}
