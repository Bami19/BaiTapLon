package com.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan {

	private String tenPhongBan;
	private int soNV;
	private ArrayList<NhanVien> danhsachNV;
	private NhanVien quanLy;
	private NhanVien[] phoQuanLy;

	
	public PhongBan(String tenPhongBan, int soNV, ArrayList<NhanVien> danhsachNV, NhanVien quanLy,
			NhanVien[] phoQuanLy) {
		super();
		this.tenPhongBan = tenPhongBan;
		this.soNV = soNV;
		this.danhsachNV = danhsachNV;
		this.quanLy = quanLy;
		this.phoQuanLy = phoQuanLy;
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

	public NhanVien getQuanLy() {
		return quanLy;
	}

	public void setQuanLy(NhanVien quanLy) {
		this.quanLy = quanLy;
	}

	public NhanVien[] getPhoQuanLy() {
		return phoQuanLy;
	}

	
}
