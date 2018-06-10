package com.myproject;

import java.util.Date;

public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{

	public CanBoQuanLy(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich,
			String diaChi, String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}
	private CongTy congTyQuanLy;

	@Override
	public double tinhHoaHong() {
		// Mỗi công ty có 3 cán bộ quản lý => tổng công ty có số công ty con * 3
		return TongCongTy.getLoiNhuanCongTy()*0.002/TongCongTy.getSoCongTyCon()*3;
	}
	

}
