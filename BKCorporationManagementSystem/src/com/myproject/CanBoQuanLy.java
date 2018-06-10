package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{

	public CanBoQuanLy(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich,
			String diaChi, String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhHoaHong() {
		// Mỗi công ty có 3 cán bộ quản lý => tổng công ty có số công ty con * 3
		return TongCongTy.getLoiNhuanCongTy()*0.002/TongCongTy.getSoCongTyCon()*3;
	}
	
	// Sinh dữ liệu giả cho test
	public static CanBoQuanLy sinhDuLieu(String masoCongTy, String soThuTu) {
		try {
			// Ma so nhan vien
			String msnv = masoCongTy + "CBQL" + soThuTu;

			// Ngay sinh
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String ngaySinhString = "31-08-1990 09:30:00";
			Date ngaySinh = sdf.parse(ngaySinhString);

			// CMT: Chung minh thu
			String ngayCapString = "31-08-2005 10:00:00";
			Date ngayCap = sdf.parse(ngayCapString);
			CMT cmt = new CMT("CBHopDong" + soThuTu, ngayCap, "TP Hải Phòng");

			// Ngay vao cong ty
			String ngayVaoCongTyString = "31-08-2013 10:00:00";
			Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);

			CanBoQuanLy cbql = new CanBoQuanLy(msnv, "Nguyen Van A"+soThuTu, 
					ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
					msnv+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 5e6);
			return cbql;
		}
		catch (Exception e) {     
			System.out.println(e.toString());
			return null;
		}
	}	
}
