package com.myproject;

import java.util.ArrayList;

public class TongCongTy{

	private String tenTapDoan;
	private static double loiNhuanCongTy = 10e9;
	
	private ChuTich chuTich;
	private PhoChuTich[] danhSachPhoChuTich;
	private CongTy[] danhSachsCongTyCon;
	private static int soCongTyCon;
	
	public TongCongTy(String tenTapDoan, ChuTich chuTich, PhoChuTich[] phoChuTich, int soCongTyCon) {
		this.tenTapDoan = tenTapDoan;
		this.chuTich = chuTich;
		this.danhSachPhoChuTich = phoChuTich;
		this.soCongTyCon = soCongTyCon;
		danhSachsCongTyCon = new CongTy[soCongTyCon];
	}
	public static double getLoiNhuanCongTy() {
		return loiNhuanCongTy;
	}
	public static void setLoiNhuanCongTy(double loiNhuanCongTy) {
		TongCongTy.loiNhuanCongTy = loiNhuanCongTy;
	}
	

	public static int getSoCongTyCon() {
		return soCongTyCon;
	}
	
	// Sinh dữ liệu giả cho test
	private TongCongTy() {
	}
	
	public TongCongTy sinhDuLieu() {
		TongCongTy tongCongTy = new TongCongTy();
		tongCongTy.tenTapDoan = "BKCoporation";
		tongCongTy.chuTich = ChuTich.sinhDuLieu();
		
		// 3 Pho Chu Tich
		tongCongTy.danhSachPhoChuTich = new PhoChuTich[3];
		for (int i = 0; i < 3; i++) {
			PhoChuTich pct = PhoChuTich.sinhDuLieu(Integer.toString(i));
			tongCongTy.danhSachPhoChuTich[i] = pct;
		}
		
		
		
		
		return tongCongTy;
	
	}
}
