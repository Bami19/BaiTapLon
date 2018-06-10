package com.myproject;

import java.util.ArrayList;

public class TongCongTy{

	private String tenTapDoan;
	private static double loiNhuanCongTy = 10e9;
	
	private ChuTich chuTich;
	private PhoChuTich[] phoChuTich;
	private CongTy[] congTyCon ;
	private static int soCongTyCon;
	
	public TongCongTy(String tenTapDoan, ChuTich chuTich, PhoChuTich[] phoChuTich, int soCongTyCon) {
		this.tenTapDoan = tenTapDoan;
		this.chuTich = chuTich;
		this.phoChuTich = phoChuTich;
		this.soCongTyCon = soCongTyCon;
		congTyCon = new CongTy[soCongTyCon];
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
	
}
