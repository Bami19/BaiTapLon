package com.myproject;

import java.util.ArrayList;

public class CongTy {

	private String tenCongTy;
	private PhongBan[] danhSachPhongBan;
	private GiamDoc giamDoc;
	private PhoGiamDoc[] danhSachPhoGiamDoc;
	
	public CongTy(String tenCongTy, PhongBan[] phongBan, GiamDoc giamDoc, PhoGiamDoc[] phoGiamDoc) {
		this.tenCongTy = tenCongTy;
		this.phongBan = phongBan;
		this.giamDoc = giamDoc;
		this.phoGiamDoc = phoGiamDoc;
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
