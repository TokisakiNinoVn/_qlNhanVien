package TrieuDuyTan;

import java.util.Scanner;
import java.util.*;
public class TestNV {

	public static void main(String[] args) {
		NhanVien s1 = new NhanVien();
		s1.nhapNV(s1);	
		NhanVien s2 = new NhanVien();
		s2.nhapNV(s2);
		
		s1.xuatNV();		
		s2.xuatNV();	
	}
}
