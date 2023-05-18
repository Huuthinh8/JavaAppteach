package QLNV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassMain {
	static List<NhanVien> listNV = new ArrayList<>();

	public static void xuat1() {
		for(int i=0;i<listNV.size();i++) {
			listNV.get(i).xuat();
			listNV.get(i).xuatVP();
		}
	}
	//sap xep theo luong tang dan
	public static void sapxepSalary() {
		for(int i=0;i<listNV.size();i++) {
			for(int j=i+1;j<listNV.size();j++) {
				if(listNV.get(i).getSalary()>listNV.get(j).getSalary()) {
					NhanVien tg = listNV.get(i);
							listNV.set(i, listNV.get(j));
							listNV.set(j, tg);
				}
			}
		}
	}
	//sap xep theo ten
		public static void sapxepName() {
			for(int i=0;i<listNV.size();i++) {
				for(int j=i+1;j<listNV.size();j++) {
					if(listNV.get(i).getName().compareTo(listNV.get(j).getName())>0) {
						NhanVien tg = listNV.get(i);
								listNV.set(i, listNV.get(j));
								listNV.set(j, tg);
					}
				}
			}
		}
	//danh sach nhan vien tre nhat
		public static void danhsachtre() {
			NhanVien nvYear = listNV.stream().max((nv1,nv2)->(int)(nv1.getYearOfBirth()-nv2.getYearOfBirth())).get();
			int namMin = nvYear.yearOfBirth;
			for(int i=0;i<listNV.size();i++) {
				if(listNV.get(i).getYearOfBirth() == namMin) {
					listNV.get(i).xuat();
					listNV.get(i).xuatVP();
				}
			}
		}
	// tim nhan vien theo ten va id
		public static void timkiem() {
			String ten,mnv;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap ten nhan vien can tim:");
			ten = scanner.nextLine();
			System.out.println("Nhap ma nhan vien can tim:");
			mnv = scanner.nextLine();
			for(int i=0;i<listNV.size();i++) {
				if(listNV.get(i).getName().equals(ten) && listNV.get(i).getId().equals(mnv)) {
					listNV.get(i).xuat();
					listNV.get(i).xuatVP();
				}else {
					System.out.println("Khong co nhan vien phu hop");
				}
			}
		}
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("***************MENU***********");
			System.out.println("\n1.Nhap thong tin nhan vien");
			System.out.println("\n2.Hien thi thong tin nhan vien");
			System.out.println("\n3.Sap xep nhan vien theo luong tang dan");
			System.out.println("\n4.Sap xep nhan vien theo ten");
			System.out.println("\n5.Danh sach nhan vien tre nhat");
			System.out.println("\n6.Tim nhan vien theo ten,id");
			System.out.println("\n7.Thoat");
			System.out.println("\nMoi ban chon:");
			luachon = scanner.nextInt();
			switch(luachon) {
				case 1:{
					NhanVien nv = new NhanVien() {
						
						@Override
						void calSalary() {
							// TODO Auto-generated method stub
							
						}
					};
					int chon;
					System.out.println("1.Nhan vien ky thuat");
					System.out.println("\n2.Nhan vien van phong");
					chon = scanner.nextInt();
					switch(chon) {
						case 1:{
							NhanVienKT nvkt = new NhanVienKT();
							nvkt.nhap();
							listNV.add(nvkt);
							break;
						}
						case 2:{
							NhanVienVP nvvp = new NhanVienVP();
							nvvp.nhap();
							listNV.add(nvvp);
							break;
						}
					}
					break;
				}
				case 2:{
					System.out.println("============DANH SACH NHAN VIEN KY THUA VA VAN PHONG=============");
					xuat1();
					break;
				}
				case 3:{
					System.out.println("============DANH SACH SAP XEP THEO LUONG NHAN VIEN KY THUA VA VAN PHONG=============");
					sapxepSalary();
					xuat1();
					break;
				}
				case 4:{
					System.out.println("============DANH SACH SAP XEP THEO TEN NHAN VIEN KY THUA VA VAN PHONG=============");
					sapxepName();
					xuat1();
					break;
				}
				case 5:{
					System.out.println("============DANH SACH NHAN VIEN KY THUA VA VAN PHONG TRE NHAT=============");
					danhsachtre();
					break;
				}
				case 6:{
					System.out.println("============DANH SACH NHAN VIEN KY THUA VA VAN PHONG=============");
					timkiem();
					break;
				}
			}
		}while(true);
		
	}
}
