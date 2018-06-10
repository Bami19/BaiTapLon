package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TruongPhong extends CanBoCoHuu implements LanhDao {

	public TruongPhong(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich,
			String diaChi, String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}
	
	public double tinhLuong() {
		return super.tinhLuong() * PHU_CAP_LD;
				
	}

	
	// Sinh dữ liệu giả cho test
	public static TruongPhong sinhDuLieu(String maSoPhong) {
		try {
			// Ma so nhan vien
			String msnv = "TP" + maSoPhong;

			// Ngay sinh
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String ngaySinhString = "31-08-1990 09:30:00";
			Date ngaySinh = sdf.parse(ngaySinhString);

			// CMT: Chung minh thu
			String ngayCapString = "31-08-2005 10:00:00";
			Date ngayCap = sdf.parse(ngayCapString);
			CMT cmt = new CMT("TP" + maSoPhong, ngayCap, "TP Hải Phòng");

			// Ngay vao cong ty
			String ngayVaoCongTyString = "31-08-2013 10:00:00";
			Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);

			TruongPhong tp = new TruongPhong(msnv, "Nguyen Van A", 
					ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
					"tp"+maSoPhong+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 5e6);
			return tp;
		}
		catch (Exception e) {     
			System.out.println(e.toString());
			return null;
		}
	}	
}
