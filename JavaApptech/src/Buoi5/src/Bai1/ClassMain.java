package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassMain {
	static List<QuanLyBanHang> listBH = new ArrayList<>();
	public static void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n san pham");
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++) {
			QuanLyBanHang bh = new QuanLyBanHang();
			bh.input();
			listBH.add(bh);
		}
	}
	public static void xuat() {
		for(int i=0;i<listBH.size();i++) {
			listBH.get(i).display();
		}
	}
	//sap xep san pham theo ten
	public static void sapxepName() {
		for(int i=0;i<listBH.size();i++) {
			for(int j=i+1;j<listBH.size();j++) {
				if(listBH.get(i).getProName().compareTo(listBH.get(j).getProName())>0) {
					QuanLyBanHang tg = listBH.get(i);
								  listBH.set(i, listBH.get(j));
								  listBH.set(j, tg);
				}
			}
		}
	}
	//tinh toan gia san pham ban ra
	public static void tinhtoan() {
		
		for(int i=0;i<listBH.size();i++) {
			listBH.get(i).display();
			System.out.println(listBH.get(i).caculateSalePrice());
		}
	}
	//tim kiem theo gia ban
	public static void timkiemPrice() {
		Scanner scanner = new Scanner(System.in);
		float c;
		System.out.println("Nhap gia ban can tim:");
		c = scanner.nextFloat();
		for(int i=0;i<listBH.size();i++) {
			if(listBH.get(i).caculateSalePrice() == c) {
				listBH.get(i).display();
				System.out.println(c);
			}
		}
	}
	//tim san pham co gia thap nhat
	public static void timkiemMin() {
		QuanLyBanHang giabanmin = listBH.stream().min((bh1,bh2)->(int)(bh1.caculateSalePrice()-bh2.caculateSalePrice())).get();
		float giamin = giabanmin.caculateSalePrice();
		for(int i=0;i<listBH.size();i++) {
			if(listBH.get(i).caculateSalePrice()==giamin) {
				listBH.get(i).display();
				System.out.println(giamin);
			}
		}
	}
	//tim san pham theo ten goi
	public static void timkiemName() {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhap ten can tim:");
		name = scanner.nextLine();
		List<QuanLyBanHang> ten = listBH.stream().filter(sp -> sp.getProName().contains(name)).collect(Collectors.toList());
		for(int i=0;i<ten.size();i++) {
			ten.get(i).display();
			System.out.println(ten.get(i).caculateSalePrice());
		}
	}
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("**********MENU************");
			System.out.println("\n1.Nhap thong tin n san pham");
			System.out.println("\n2.Hien thi thong tin toan bo san pham");
			System.out.println("\n3.Sap xep san pham theo ten");
			System.out.println("\n4.Tinh toan gia san pham ban ra");
			System.out.println("\n5.Tim kiem san pham theo gia ban");
			System.out.println("\n6.Tim san pham gia thap nhat");
			System.out.println("\n7.Tim san pham theo ten goi");
			System.out.println("\n8.Ket thuc");
			System.out.println("\nMoi ban chon:");
			luachon = scanner.nextInt();
			
			switch(luachon) {
				case 1:{
					nhap();
					break;
				}
				case 2:{
					//System.out.printf("%-5s%15s%15s%15.3f\n","ID","Ten SP","Nha san xuat","Gia san xuat");
					xuat();
					break;
				}
				case 3:{
					//System.out.printf("%-5s%15s%15s%15.3f\n","ID","Ten SP","Nha san xuat","Gia san xuat");
					sapxepName();
					xuat();
					break;
				}
				case 4:{
					//System.out.printf("%-5s%15s%15s%15.3f%15.3f\n","ID","Ten SP","Nha san xuat","Gia san xuat","Gia ban ra");
					tinhtoan();
					break;
				}
				case 5:{
					timkiemPrice();
					break;
				}
				case 6:{
					timkiemMin();
					break;
				}
				case 7:{
					timkiemName();
					break;
				}
				case 8:{
					System.exit(0);
					break;
				}
			}
		}while(true);
	}
}
