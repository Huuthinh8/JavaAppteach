package Hang;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassMain {
	static List<Cargo> listBH = new ArrayList<>();
	public static void input() {
		AgriCargo ns = new AgriCargo();
		FoodCargo fc = new FoodCargo();
		int luachon;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin 1-Nong San | 2-Thuc Pham");
		luachon = scanner.nextInt();
		switch(luachon) {
			case 1:{
				ns.nhap();
				listBH.add(ns);
				break;
			}
			case 2:{
				fc.nhap1();
				listBH.add(fc);
				break;
			}
		}
		
		
	}
	public static void output() {
		for(int i=0;i<listBH.size();i++) {
			listBH.get(i).xuat();
			listBH.get(i).xuat1();
		}
	}
	//sap xep theo gia tang dan
	public static void sapxepPrice() {
		for(int i=0;i<listBH.size();i++) {
			for(int j=i+1;j<listBH.size();j++) {
				if(listBH.get(i).price > listBH.get(j).price) {
					Cargo tg = listBH.get(i);
						listBH.set(i, listBH.get(j));
						listBH.set(j, tg);
				}
			}
		}
	}
	//sap xep theo ten
		public static void sapxepName() {
			for(int i=0;i<listBH.size();i++) {
				for(int j=i+1;j<listBH.size();j++) {
					if(listBH.get(i).name.compareTo(listBH.get(j).name)>0) {
						Cargo tg = listBH.get(i);
							listBH.set(i, listBH.get(j));
							listBH.set(j, tg);
					}
				}
			}
		}
	//tim hang hoa theo ten va ncc
		public static void searchName() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap ten can tin:");
			String c = scanner.nextLine();
			System.out.println("Nhap nha cung cap:");
			String ncc = scanner.nextLine();
			System.out.printf("%5s %15s %15s %15s %15.3s %15.3s %15s","ID","Ten hang","Nha san xuat","So Luong","Gia","Thua","Han Su Dung");
			System.out.println("\n");
			for(int i=0;i<listBH.size();i++) {
				if(listBH.get(i).getName().equals(c) && listBH.get(i).getSupplier().equals(ncc)) {
					listBH.get(i).xuat();
					listBH.get(i).xuat1();
				}
			}
			
		}
	// danh sach hang hoa het hang
		public static void dsachHet() {
			System.out.printf("%5s %15s %15s %15s %15.3s %15.3s %15s","ID","Ten hang","Nha san xuat","So Luong","Gia","Thua","Han Su Dung");
			System.out.println("\n");
			for(int i=0;i<listBH.size();i++) {
				if(listBH.get(i).quantily == 0) {
					listBH.get(i).xuat();
					listBH.get(i).xuat1();
				}
			}
		}
		// hanh hoa nong san co thue lon hon 10%
		public static void nongsan() {
			
			for (Cargo c : listBH) {
				if(c instanceof AgriCargo) {
					AgriCargo ac = (AgriCargo) c;
					if(ac.getTax() >= 10) {
						ac.xuat();
					}
				}
			}
		}
		public static void thucpham() {
				
				for (Cargo c : listBH) {
					if(c instanceof FoodCargo) {
						FoodCargo fc = (FoodCargo) c;
						if(fc.getExDate() <=30 && fc.getExDate() > 0) {
							fc.xuat1();
						}
					}
				}
			}
	public static void main(String[] args) {
		int luachon;
		do {
			System.out.println("**************MENU*************");
			System.out.println("\n1.Nhap thong tin hang hoa");
			System.out.println("\n2.Hien thi thong tin hang hoa");
			System.out.println("\n3.Sap xep hang hoa theo gia tang dan");
			System.out.println("\n4.Sap xep hang hoa theo ten");
			System.out.println("\n5.Tim hang hoa theo ten va nha cung cap");
			System.out.println("\n6.Danh sach hang hoa het hang");
			System.out.println("\n7.Hien thi hang hoa Nong San co thue lon hon 10%");
			System.out.println("\n8.Hien thi hang hoa Thuc Pham co han su dung nho hon 30 ngay");
			System.out.println("\n9.Thoat");
			System.out.println("\nMoi ban chon:");
			Scanner scanner = new Scanner(System.in);
			luachon = scanner.nextInt();
			switch(luachon) {
				case 1:{
						input();
						break;
				}
				case 2:{
					System.out.printf("%5s %15s %15s %15s %15.3s %15.3s %15s","ID","Ten hang","Nha san xuat","So Luong","Gia","Thua","Han Su Dung");
					System.out.println("\n");
					output();
					break;
				}
				case 3:{
					sapxepPrice();
					System.out.printf("%5s %15s %15s %15s %15.3s %15.3s %15s","ID","Ten hang","Nha san xuat","So Luong","Gia","Thua","Han Su Dung");
					System.out.println("\n");
					output();
					break;
				}
				case 4:{
					sapxepName();
					System.out.printf("%5s %15s %15s %15s %15.3s %15.3s %15s","ID","Ten hang","Nha san xuat","So Luong","Gia","Thua","Han Su Dung");
					System.out.println("\n");
					output();
					break;
				}
				case 5:{
					searchName();
					break;
				}
				case 6:{
					dsachHet();
					break;
				}
				case 7:{
					nongsan();
					break;
				}
				case 8:{
					break;
				}
				case 9:{
					System.exit(0);
				}
			}
		}while(true);
	}
}
