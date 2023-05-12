package Buoi4JavaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
	static List<Book> listBook = new ArrayList<>();
	public static void fakeData() {
		Book sach1 = new Book(1, "Sach Toan", "Nam", 2002, 12000);
		Book sach2 = new Book(2, "Sach Hoa", "Thu", 2003, 11000);
		Book sach3 = new Book(3, "Sach Sinh", "Nhan", 2001, 14000);
		Book sach4 = new Book(4, "Sach Su", "Thang", 2004, 13000);
		Book sach5 = new Book(5, "Sach Dia", "Huy", 2005, 18000);
		listBook.add(sach1);
		listBook.add(sach2);
		listBook.add(sach3);
		listBook.add(sach4);
		listBook.add(sach5);
	}
	public static void nhap() {
		Book sach = new Book();
		sach.inputData();
		listBook.add(sach);
	}
	public static void xuat() {
		for(int i=0;i<listBook.size();i++) {
			listBook.get(i).outputData();
		}
	}
	//sap xep theo nam san xuat
	public static void sapxepYear() {
		for(int i=0;i<listBook.size();i++) {
			for(int j=i+1;j<listBook.size();j++) {
				if(listBook.get(i).year > listBook.get(j).year) {
					Book tg = listBook.get(i);
						listBook.set(i, listBook.get(j));
						listBook.set(j, tg);
				}
			}
		}
	}
	//sap xep theo ten
	public static void sapxepName() {
		for(int i=0;i<listBook.size();i++) {
			for(int j=i+1;j<listBook.size();j++) {
				if(listBook.get(i).Name.compareTo(listBook.get(j).Name)>0) {
					Book tg = listBook.get(i);
						listBook.set(i, listBook.get(j));
						listBook.set(j, tg);
				}
			}
		}
	}
	//tim sach co gia cao nhat
	public static void timkiem() {
		Book book = listBook.stream().max((b1,b2)->(int)(b1.getPrice()-b2.getPrice())).get();
		float giamax = book.getPrice();
		for(int i=0;i<listBook.size();i++) {
			if(listBook.get(i).Price == giamax) {
				listBook.get(i).outputData();
			}
		}
	}
	//tim sach theo ten nha xuat ban
	
	public static void timkiemNXB() {
		Scanner scanner = new Scanner(System.in);
		String nxb;
		System.out.println("Nhap ten nha xuat ban can tim:");
		nxb= scanner.nextLine();
		List<Book> book = listBook.stream().filter(tg -> tg.getPublisher().contains(nxb))
				.collect(Collectors.toList());
		for(int i=0;i<book.size();i++) {
			book.get(i).outputData();
		}
	}
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("************MENU*************");
			System.out.println("\n1.Nhap thong tin sach");
			System.out.println("\n2.Hien thi danh sach");
			System.out.println("\n3.Sap xep sach theo nam xuat ban");
			System.out.println("\n4.Sap xep sach theo ten");
			System.out.println("\n5.Tim sach co gia cao nhat");
			System.out.println("\n6.Tim sach theo ten nha xuat ban");
			System.out.println("\n7.Thoat");
			System.out.println("\nMoi ban chon:");
			luachon = scanner.nextInt();
			switch(luachon) {
				case 1:{
					fakeData();
					//nhap();
					break;
				}
				case 2:{
					System.out.println("==============DANH SACH===============");
					xuat();
					break;
				}
				case 3:{
					sapxepYear();
					System.out.println("==============DANH SACH SAP XEP THEO NAM===============");
					xuat();
					break;
				}
				case 4:{
					sapxepName();
					System.out.println("==============DANH SACH SAP XEP THEO TEN===============");
					xuat();
					break;
				}
				case 5:{
					System.out.println("==============DANH SACH GIA CAO NHAT===============");
					timkiem();
					break;
				}
				case 6:{
					timkiemNXB();
					break;
				}
				case 7:{
					System.exit(0);
					break;
				}
			}
		}while(true);
	}
}
