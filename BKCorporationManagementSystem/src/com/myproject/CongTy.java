package com.myproject;

import java.util.ArrayList;

public class CongTy {

	private String masoCongTy;
	private String tenCongTy;
	private PhongBan[] danhSachPhongBan;
	private GiamDoc giamDoc;
	private PhoGiamDoc[] danhSachPhoGiamDoc;
	private CanBoQuanLy canBoQuanLy;
	
	public CongTy(String masoCongTy, String tenCongTy, PhongBan[] danhSachPhongBan, GiamDoc giamDoc, PhoGiamDoc[] danhSachPhoGiamDoc, CanBoQuanLy canBoQuanLy) {
		this.masoCongTy = masoCongTy;
		this.tenCongTy = tenCongTy;
		this.danhSachPhongBan = danhSachPhongBan;
		this.giamDoc = giamDoc;
		this.danhSachPhoGiamDoc = danhSachPhoGiamDoc;
		this.canBoQuanLy = canBoQuanLy;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	
	// Sinh dữ liệu giả cho test
		public static CongTy sinhDuLieu() {
			// 3 Phong Ban
			
//			TongCongTy tongCongTy = new TongCongTy();
//			tongCongTy.tenTapDoan = "BKCoporation";
//			tongCongTy.chuTich = ChuTich.sinhDuLieu();
//			
//			// 3 Pho Chu Tich
//			tongCongTy.danhSachPhoChuTich = new PhoChuTich[3];
//			for (int i = 0; i < 3; i++) {
//				PhoChuTich pct = PhoChuTich.sinhDuLieu(Integer.toString(i));
//				tongCongTy.danhSachPhoChuTich[i] = pct;
//			}
			
		
			return tongCongTy;
		
		}

	
}
