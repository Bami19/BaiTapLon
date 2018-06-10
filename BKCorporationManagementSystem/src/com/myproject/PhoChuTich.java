package com.myproject;

import java.util.Date;

public class PhoChuTich extends CanBoCoHuu implements QuanLy, LanhDao {

	private static double phuCapQL_PCT = 0.03;
	
	public PhoChuTich(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double tinhHoaHong() {
		return TongCongTy.getLoiNhuanCongTy() * phuCapQL_PCT/2;

	}
	
	public double tinhLuong() {
		return super.tinhLuong()+tinhHoaHong() + PHU_CAP_LD;
	}
	
}
