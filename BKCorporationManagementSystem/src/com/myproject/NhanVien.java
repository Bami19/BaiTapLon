package com.myproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class NhanVien {

	public static final String GIO_DEN_CHUAN = "7:30";
	public static final String GIO_VE_CHUAN = "17:30";
	private String msnv; // Mã số nhân viên 
	private String hoTen;
	private Date ngSinh;
	private CMT cmt;
	private String queQuan;
	private String danToc;
	private String quocTich;
	private String diaChi;
	private String email;
	private String soDT;
	private Date ngayBD;
	private Date ngayRoi;
	private ArrayList<GioLamViec> listGioLamViec;
	

	public NhanVien(String msnv, String hoTen, Date ngSinh, CMT cmt, String queQuan, String danToc, String quocTich,
			String diaChi, String email, String soDT, Date ngayBD, Date ngayRoi) {
		this.msnv = msnv;
		this.hoTen = hoTen;
		this.ngSinh = ngSinh;
		this.cmt = cmt;
		this.queQuan = queQuan;
		this.danToc = danToc;
		this.quocTich = quocTich;
		this.diaChi = diaChi;
		this.email = email;
		this.soDT = soDT;
		this.ngayBD = ngayBD;
		this.ngayRoi = ngayRoi;
	}

	public void inTTin() {
		System.out.println(" Ho Ten Nhan Vien: " + hoTen);
		System.out.println(" Ngay Sinh: " + ngSinh);
		System.out.println(" So CMND: " + cmt.getSoID() + "     Ngay cap: " + cmt.getNgayCap() + "      Noi cap: " + cmt.getNoiCap());
		System.out.println(" Que quan: " + queQuan);
		System.out.println(" Dan Toc: " + danToc);
		System.out.println(" Quoc Tich: " + quocTich);
		System.out.println(" Dia chi: " + diaChi);
		System.out.println(" Email: " + email);
		System.out.println(" So dien thoai: " + soDT);
		System.out.println(" Ngay vao Cong ty: " + ngayBD);
		System.out.println(" Ngay roi Cong ty: " + ngayRoi);
		System.out.println(" Luong thang 9/2018: " + tinhLuong());
	}
	
	public abstract double tinhLuong();
		
	public void quetTheDen() {
		GioLamViec gioLV = new GioLamViec();
		gioLV.setGioDen(new Date());
		listGioLamViec.add(gioLV);
	}
	
	public void quetTheVe() {
		listGioLamViec.get(listGioLamViec.size()-1).setGioVe(new Date());
	}

	public double truLuong() throws ParseException {
		int soGioDiMuon = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		for (GioLamViec gioLV: listGioLamViec) {
			String  sGioDen= sdf.format(gioLV.getGioDen());
			 soGioDiMuon += (int)(sdf.parse(sGioDen).getTime() - sdf.parse(GIO_DEN_CHUAN).getTime())/3600 + 1;
		}
		return soGioDiMuon*500000;
	}
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgSinh() {
		return ngSinh;
	}

	public void setNgSinh(Date ngSinh) {
		this.ngSinh = ngSinh;
	}

	public CMT getCMT() {
		return cmt;
	}

	public void setCMT(CMT cmt) {
		this.cmt = cmt;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public Date getNgayBD() {
		return ngayBD;
	}

	public void setNgayBD(Date ngayBD) {
		this.ngayBD = ngayBD;
	}

	public Date getNgayRoi() {
		return ngayRoi;
	}

	public void setNgayRoi(Date ngayRoi) {
		this.ngayRoi = ngayRoi;
	}	
}
