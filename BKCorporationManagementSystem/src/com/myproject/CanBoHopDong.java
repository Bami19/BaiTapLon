package com.myproject;

import java.util.Date;

public class CanBoHopDong extends NhanVien{

	private double luongHopDong;

	
	
	
	public CanBoHopDong(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double luongHopDong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi);
		this.luongHopDong = luongHopDong;
	}
	
	public double tinhLuong() {
		return luongHopDong;
	}

	public double getLuongHopDong() {
		return luongHopDong;
	}

	public void setLuongHopDong(double luongHopDong) {
		this.luongHopDong = luongHopDong;
	}
	
	
}
