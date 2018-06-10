package com.myproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiamDoc extends CanBoCoHuu implements QuanLy, LanhDao {

	private static double phuCapQL_GD = 0.02;

	public GiamDoc(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(msnv, hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhHoaHong() {
// Mỗi công ty con có một giám đốc, do đó phụ cấp quản lý của giám đốc bằng số lợi nhuận công ty * % phụ cấp / số công ty
		return TongCongTy.getLoiNhuanCongTy() * phuCapQL_GD / TongCongTy.getSoCongTyCon();
	}
	
	public double tinhLuong() {
		return super.tinhLuong()+tinhHoaHong()+PHU_CAP_LD;
	}

	// Sinh dữ liệu giả cho test
	public static GiamDoc sinhDuLieu(String masoCongTy) {
		try {
			// Ma so nhan vien
			String msnv = masoCongTy + "GD";

			// Ngay sinh
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String ngaySinhString = "31-08-1990 09:30:00";
			Date ngaySinh = sdf.parse(ngaySinhString);

			// CMT: Chung minh thu
			String ngayCapString = "31-08-2005 10:00:00";
			Date ngayCap = sdf.parse(ngayCapString);
			CMT cmt = new CMT("CMT"+msnv, ngayCap, "TP Hải Phòng");

			// Ngay vao cong ty
			String ngayVaoCongTyString = "31-08-2013 10:00:00";
			Date ngayVaoCongTy = sdf.parse(ngayVaoCongTyString);

			GiamDoc gd = new GiamDoc(msnv, "Nguyen Van A", 
					ngaySinh, cmt, "Hai Duong", "Kinh", "Viet Nam", "Ha Noi", 
					msnv+"@bkCoporation.com.vn", "1234556789", ngayVaoCongTy, null, 5e6);
			return gd;
		}
		catch (Exception e) {     
			System.out.println(e.toString());
			return null;
		}
	}	
}
