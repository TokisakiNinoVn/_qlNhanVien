package TrieuDuyTan;

import java.util.*;

public class QuanLyNhanVien extends NhanVien {	
	protected int soNV;
	
	public int getSoNV(int soNV) {
		return soNV;
	}

	public QuanLyNhanVien(int soNV) {
		this.soNV = soNV;
	}
	public void setSoNV(int soNV) {
		this.soNV = soNV;
	}
//	public void QuanLyNhanVien(int soNV) {
//		this.soNV = soNV;
//	}
//	public int QuanLyNhanVien(int soNV) {
//		return soNV;
//	}
	
//	final static int max = 100;
//	NhanVien[] nv = new NhanVien[max];
	
	public void NhapDSNV() {
		NhanVien[] nv = new NhanVien[soNV];
		Scanner Huahua = new Scanner(System.in);
		int a = nv.length;		System.out.printf("\n[%d]\n", a);
		
		for(int i = 0; i < soNV; i++) {
			System.out.printf("Nhap vao thong tin nhan vien thu %d: ", i+1);
			nv[i].nhapNV(); // ????????????????????????
		}
	}
	
	public void XuatDSNV() {
		NhanVien[] nv = new NhanVien[soNV];
		System.out.println("\n           DANH SACH NHAN VIEN\n");
		System.out.println("[STT]: >> Ho Ten - Dia Chi - Nam Sinh - MaNV - MaBP - Luong\n");
		for(int i = 0; i < soNV; i++) {
			System.out.printf("\n[%d]: ", i+1); 
			nv[i].xuatNV();
		}
	}
	
	public void LuongReduce() {
		NhanVien[] nv = new NhanVien[soNV];
	    NhanVien Tuesday;
	    for(int i = 0; i < soNV; i++){
	        for(int j = i + 1; j < soNV; j++){
	            if(nv[i].getLuong() < nv[j].getLuong()) {
	            	Tuesday  = nv[i];
	            	nv[i] = nv[j];
	            	nv[j] = Tuesday;        
	            }
	        }
	    }
	}
	
}
