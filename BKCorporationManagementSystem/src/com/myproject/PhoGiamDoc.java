package com.myproject;

import java.util.Date;

public class PhoGiamDoc extends CanBoCoHuu implements QuanLy, LanhDao{
	
	private static double phuCapQL_GD = 0.02;

	public PhoGiamDoc(String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich, String diaChi,
			String email, String soDT, Date ngayBD, Date ngayRoi, double heSoLuong) {
		super(hoTen, ngSinh, cmt, queQuan, danToc, quocTich, diaChi, email, soDT, ngayBD, ngayRoi, heSoLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhHoaHong() {
		// Mỗi công ty con có 2 phó giám đốc, do đó phụ cấp quản lý của giám đốc bằng số lợi nhuận công ty * % phụ cấp / số công ty
				return TongCongTy.getLoiNhuanCongTy() * phuCapQL_GD / (2*TongCongTy.getSoCongTyCon());
	}
	
	public double tinhLuong() {
		return super.tinhLuong()+tinhHoaHong()+PHU_CAP_LD;
	}

	
}
