package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoPhong extends CanBoCoHuu implements LanhDao{

	public PhoPhong(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}
	
	public double tinhLuong() {
		return super.tinhLuong() + PHU_CAP_LD;
				
	}
	
	// Sinh dữ liệu giả cho test
		public static PhoPhong sinhDuLieu(String tenPhong) {
			try {
				// Ma so nhan vien
				String msnv = "PP" + tenPhong;

				// Ngay sinh
				SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
				String ngaySinhString = "31-08-1990 09:30:00";
				Date ngaySinh = sdf.parse(ngaySinhString);

				// CMT: Chung minh thu
				String ngayCapString = "31-08-2005 10:00:00";
				Date ngayCap = sdf.parse(ngayCapString);
				CMT cmt = new CMT("CBHopDong" + msnv, ngayCap, "TP Hải Phòng");

				// Ngay vao cong ty
				String ngayVaoCongTyString = "31-08-2013 10:00:00";
				Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);

				PhoPhong pp = new PhoPhong(msnv, "Nguyen Van A", 
						ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
						msnv+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 5e6);
				return pp;
			}
			catch (Exception e) {     
				System.out.println(e.toString());
				return null;
			}
		}	

}
