package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CanBoHopDong extends NhanVien{

	private double luongHopDong;

	public CanBoHopDong(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double luongHopDong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi);
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
	
	// Sinh dữ liệu giả cho test
	public static CanBoHopDong sinhDuLieu(String maSoPhong, String soThuTu) {
		try {
			// Ma so nhan vien
			String msnv = maSoPhong + "CBHD" + soThuTu;
			
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
			
			CanBoHopDong cbhd = new CanBoHopDong(msnv, "Nguyen Van A"+soThuTu, 
					ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
					msnv+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 5e6);
			return cbhd;
		}
		catch (Exception e) {     
			System.out.println(e.toString());
			return null;
		}
	}	
	
}
