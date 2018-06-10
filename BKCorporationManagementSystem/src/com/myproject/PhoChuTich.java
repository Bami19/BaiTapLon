package com.myproject;

import java.text.SimpleDateFormat;
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
	
	
	// Sinh dữ liệu giả cho test
		public static PhoChuTich sinhDuLieu(String soThuTu) {
			try {
				// Ngay sinh
				SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
				String ngaySinhString = "31-08-1985 09:30:00";
				Date ngaySinh = sdf.parse(ngaySinhString);

				// CMT: Chung minh thu
				String ngayCapString = "31-08-2005 10:00:00";
				Date ngayCap = sdf.parse(ngayCapString);
				CMT cmt = new CMT("PCT012356789", ngayCap, "TP Hải Phòng");

				// Ngay vao cong ty
				String ngayVaoCongTyString = "31-08-2013 10:00:00";
				Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);
				
				PhoChuTich phoChuTich = new PhoChuTich("Pho Chu Tich " + soThuTu, ngaySinh, cmt, "TP Hải Phòng", "Kinh", "Viet Nam", "TP Hải Phòng", "pct"+soThuTu+"@bkCoporation.com.vn", "0123459999"+soThuTu, ngayVaoCongTy, null, 8);
				return phoChuTich;
			}
			catch (Exception e) {     
				System.out.println(e.toString());
				return null;
			}
		}
}
