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
	
	public void nhapNV() {
		Scanner nv  = new Scanner(System.in);
		nhap();
		System.out.print("Ma NV: ");
		maNV = nv.nextLine();
		System.out.print("Ma PB: ");
		maPB = nv.nextLine();
		System.out.print("Luong : ");
		luong = nv.nextInt();		
	}
	
	public void xuatNV() {
		xuat();
		System.out.printf(" - %s - %s - %dk.", maNV, maPB, luong);
	}
}
