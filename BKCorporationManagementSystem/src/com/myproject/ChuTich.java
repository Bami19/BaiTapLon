package com.myproject;

import java.util.Date;

import java.text.SimpleDateFormat;

public class ChuTich extends CanBoCoHuu implements QuanLy, LanhDao{

	public ChuTich(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
	}

	private double phuCapQLChuTich = 0.05;

	@Override
	public double tinhHoaHong() {
		return TongCongTy.getLoiNhuanCongTy()*phuCapQLChuTich;
		
	}
	
	public double tingLuong() {
		return super.tinhLuong()+tinhHoaHong() + PHU_CAP_LD;
	}
	
	
	// Sinh dữ liệu giả cho test
	public static ChuTich sinhDuLieu() {
		try {
			// Ma so nhan vien
			String msnv = "chu_tich";
			
			// Ngay sinh
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String ngaySinhString = "31-08-1982 10:30:00";
			Date ngaySinh = sdf.parse(ngaySinhString);

			// CMT: Chung minh thu
			String ngayCapString = "31-08-2000 10:00:00";
			Date ngayCap = sdf.parse(ngayCapString);
			CMT cmt = new CMT("CT012356789", ngayCap, "TP Hà Nội");

			// Ngay vao cong ty
			String ngayVaoCongTyString = "31-08-2010 10:00:00";
			Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);
			
			ChuTich chuTich = new ChuTich(msnv, "Chu Tich Tran Van B", ngaySinh, cmt, "TP Hà Nội", "Kinh", "Viet Nam", "TP Hà Nội", "ct@bkCoporation.com.vn", "0123456789", ngayVaoCongTy, null, 10);
			
			return chuTich;
		}
		catch (Exception e) {     
			System.out.println(e.toString());
			return null;
		}
	}
}
