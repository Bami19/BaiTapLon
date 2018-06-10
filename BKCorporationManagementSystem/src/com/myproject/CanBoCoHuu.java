package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CanBoCoHuu extends NhanVien{

	public static double luongCoBan = 3e6;
	private double heSoLuong;
	
	
	
	public CanBoCoHuu(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double  heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi);
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
	
	// Sinh dữ liệu giả cho test
		public static CanBoCoHuu sinhDuLieu(String maSoPhong, String soThuTu) {
			try {
				// Ma So nhan vien
				String msnv = maSoPhong + "CBCH" + soThuTu;
				
				// Ngay sinh
				SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
				String ngaySinhString = "31-08-1990 09:30:00";
				Date ngaySinh = sdf.parse(ngaySinhString);

				// CMT: Chung minh thu
				String ngayCapString = "31-08-2005 10:00:00";
				Date ngayCap = sdf.parse(ngayCapString);
				CMT cmt = new CMT("CBCoHuu" + soThuTu, ngayCap, "TP Bac Ninh");

				// Ngay vao cong ty
				String ngayVaoCongTyString = "31-08-2013 10:00:00";
				Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);
				
				CanBoCoHuu cbch = new CanBoCoHuu(msnv, "CBCoHuu Vu Thi A"+soThuTu, 
						ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
						msnv+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 3);
				return cbch;
			}
			catch (Exception e) {     
				System.out.println(e.toString());
				return null;
			}
		}	
}
