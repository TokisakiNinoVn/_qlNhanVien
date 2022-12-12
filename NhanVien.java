package TrieuDuyTan;

import java.util.*;

public class NhanVien extends Nguoi{
	protected String maNV;
	protected String maPB;
	protected int luong;
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaPB() {
		return maPB;
	}

	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public NhanVien() {
	}
	
	public NhanVien(String hoTen, String diaChi, int namSinh, String maNV, String maPB, int luong) {
		super();
		this.maNV = maNV;
		this.maPB = maPB;
		this.luong = luong;
	}
	
	public void nhapNV(NhanVien _Tues) {
		Scanner nv  = new Scanner(System.in);
		nhap(_Tues);
		System.out.print("Ma NV: ");
		_Tues.setMaNV(nv.nextLine());
		System.out.print("Ma PB: ");
		_Tues.setMaPB(nv.nextLine());
		System.out.print("Luong : ");
		_Tues.setLuong(nv.nextInt());;		
	}
	
	public void xuatNV() {
		xuat();
		System.out.printf(" - %s - %s - %dk.", getMaNV(), getMaPB(), getLuong());
	}
}
