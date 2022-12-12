package TrieuDuyTan;

import java.util.*;

public class QuanLyNhanVien extends NhanVien {	
	protected int soNV;
	Scanner Hua = new Scanner(System.in);
	
	public int getSoNV(int soNV) {
		return soNV;
	}
	public QuanLyNhanVien() {
	}
	public QuanLyNhanVien(int soNV) {
		this.soNV = soNV;
	}	

	NhanVien[] nv = null;
	public void NhapDSNV() {
		System.out.print("Nhap vao so nhan vien: ");
		soNV = Hua.nextInt();
		nv = new NhanVien[soNV];
		
		for(int i = 0; i < soNV; i++) {
			System.out.printf("Nhap vao thong tin nhan vien thu %d: ", i+1);
			nv[i] = new NhanVien();
			nhapNV(nv[i]);
		}	
	}
	
	public void XuatDSNV() {
		System.out.println("\n           DANH SACH NHAN VIEN\n");
		System.out.println("[STT]: >> Ho Ten - Dia Chi - Nam Sinh - MaNV - MaBP - Luong");	
		for(int i = 0; i < soNV; i++) {
			System.out.printf("\n[%d]: ", i+1); 
			nv[i].xuatNV();
		}
	}

	public void LuongReduce() {
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
	    
	    XuatDSNV();
	}
	
}
