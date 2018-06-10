package com.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan {

	private String tenPhongBan;
	private ArrayList<NhanVien> danhsachNV; // Gồm cả nhân viên cơ hữu và hợp đồng
	private TruongPhong truongPhong;
	private PhoPhong phoPhong;

	
	public PhongBan(String tenPhongBan, ArrayList<NhanVien> danhsachNV, TruongPhong truongPhong, PhoPhong phoPhong) {
		super();
		this.tenPhongBan = tenPhongBan;
		this.danhsachNV = danhsachNV;
		this.truongPhong = truongPhong;
		this.phoPhong = phoPhong;
	}


	public void themNV(NhanVien nv) {
		danhsachNV.add(nv);
	}
	
	public void xoaNV (NhanVien nv) {
		for (NhanVien nhanvien: danhsachNV) {
			if (nhanvien.getCMT().getSoID().equals(nv.getCMT().getSoID())) {
				danhsachNV.remove(nhanvien);
			}
		}
	}
	
	// Chi duoc phep cap nhat so DT, email, dia chi
	public void suaNV(String id, String soDT, String diaChi, String email) {
		for (NhanVien nv: danhsachNV) {
			if (nv.getCMT().getSoID().equals(id)) {
				nv.setSoDT(soDT);
				nv.setDiaChi(diaChi);
				nv.setEmail(email);
			}
		}
		
	}
	
	public void timNV(String name) {
		for ( NhanVien nv: danhsachNV) {
			if (nv.getHoTen().equals(name)) {
				nv.inTTin();
			}
		}
	}
	
	public double luongPhongBan() {
		double tongLuong = 0;
		for (NhanVien nv: danhsachNV) {
			tongLuong += nv.tinhLuong();
		}
		return tongLuong;
	}
	
	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public int getSoNV() {
		return soNV;
	}

	public void setSoNV(int soNV) {
		this.soNV = soNV;
	}

	public ArrayList<NhanVien> getDanhsachNV() {
		return danhsachNV;
	}

	public void setDanhsachNV(ArrayList<NhanVien> danhsachNV) {
		this.danhsachNV = danhsachNV;
	}

//	public NhanVien getQuanLy() {
//		return quanLy;
//	}
//
//	public void setQuanLy(NhanVien quanLy) {
//		this.quanLy = quanLy;
//	}
//
//	public NhanVien[] getPhoQuanLy() {
//		return phoQuanLy;
//	}
//

	
	// Sinh dữ liệu giả cho test
	private PhongBan() {
		
	}
	
	public static PhongBan sinhDuLieu {
		PhongBan phongBan = new PhongBan();
		
		// Dữ liệu nhân viên
		// 20 nhan vien hop dong
		CanBoHopDong[] dsCanBoHopDong = new CanBoHopDong[20];
		for (int i = 0; i < 20; i++) {
			CanBoHopDong cbhd = CanBoHopDong.sinhDuLieu(Integer.toString(i));
			dsCanBoHopDong[i] = cbhd;
		}

		// 100 nhan vien co huu
		CanBoCoHuu[] dsCanBoCoHuu = new CanBoCoHuu[100];
		for (int i = 0; i < 100; i++) {
			CanBoCoHuu cbch = CanBoCoHuu.sinhDuLieu(Integer.toString(i));
			dsCanBoCoHuu[i] = cbch;
		}

	}
	
}
