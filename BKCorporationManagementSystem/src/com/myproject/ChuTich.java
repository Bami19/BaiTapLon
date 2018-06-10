package com.myproject;

import java.util.Date;

public class ChuTich extends CanBoCoHuu implements QuanLy, LanhDao{

	public ChuTich(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
	}

	private double phuCapQLChuTich = 0.05;

	@Override
	public double tinhHoaHong() {
		return TongCongTy.getLoiNhuanCongTy()*phuCapQLChuTich;
		
	}
	
	public double tingLuong() {
		return super.tinhLuong()+tinhHoaHong() + PHU_CAP_LD;
	}
	
}
