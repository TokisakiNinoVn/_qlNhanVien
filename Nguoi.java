package TrieuDuyTan;
import java.util.*;

public class Nguoi {

	protected String hoTen;
	protected String diaChi;
	protected int namSinh;
	
	protected static int SumDS = 0;

	public void Nguoi() {	
	}
	public String getHoTen() {
		return hoTen.trim();
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
		
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public void Nguoi( String hoTen, String diaChi, int namSinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.namSinh = namSinh;
	}
	
	public void nhap(Nguoi _phu) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nHo Ten: ");
		_phu.setHoTen(sc.nextLine());
		
		System.out.print("Dia chi: ");
		_phu.setDiaChi(sc.nextLine());		
		System.out.print("Nam sinh: ");
		_phu.setNamSinh(sc.nextInt());
		
		SumDS += 1;
	}
	
	public void xuat() {
		System.out.print(" >> ");
		System.out.printf("%s - %s - %d", getHoTen(), getDiaChi(), getNamSinh());
	}
	
	public void tinhTuoi() {
		int tuoi;
		tuoi = 2022 - this.namSinh;		
		System.out.printf(" - %d tuoi", tuoi);		
	}
	
}
