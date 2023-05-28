package ThietBi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassMain {
	static List<ThietBiVeSinh> listTB = new ArrayList<>();
	public static void nhap() {
		int chon;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin 1-Bon Tam | 2-Chau Rua");
		chon = scanner.nextInt();
		switch(chon) {
			case 1:{
				BonTam bt = new BonTam();
				bt.inputData();
				listTB.add(bt);
				break;
			}
			case 2:{
				ChauRua cr = new ChauRua();
				cr.inputData();
				listTB.add(cr);
				break;
			}
		}
	}
	
	public static void xuat() {
		for(int i=0;i<listTB.size();i++) {
			listTB.get(i).displayData();
		}
	}
	
	public static void sapxepGia() {
		for(int i=0;i<listTB.size();i++) {
			for(int j=i+1;j<listTB.size();j++) {
				if(listTB.get(i).getGia() < listTB.get(j).getGia()) {
					ThietBiVeSinh tg = listTB.get(i);
								listTB.set(i, listTB.get(j));
								listTB.set(j, tg);
				}
			}
		}
	}
	
	public static void sapxepTen() {
		for(int i=0;i<listTB.size();i++) {
			for(int j=i+1;j<listTB.size();j++) {
				if(listTB.get(i).getTenHang().compareTo(listTB.get(j).getTenHang()) > 0) {
					ThietBiVeSinh tg = listTB.get(i);
								listTB.set(i, listTB.get(j));
								listTB.set(j, tg);
				}
			}
		}
	}
	
	public static void timkiemGia() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia can tim:");
		float c = scanner.nextFloat();
		List<ThietBiVeSinh> search = listTB.stream().filter(tb -> tb.getGia()== c).collect(Collectors.toList());
		System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
		System.out.println("\n");
		for (ThietBiVeSinh thietBiVeSinh : search) {
			thietBiVeSinh.displayData();
		}
	}
	
	public static void timkiemMau() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia can tim:");
		String mau = scanner.nextLine();
		System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
		System.out.println("\n");
		for (ThietBiVeSinh tbi : listTB) {
			if(tbi instanceof ChauRua) {
				ChauRua cr = (ChauRua) tbi;
				if(cr.getMauSac().equals(mau)) {
					cr.displayData();
				}
				
			}
		}
	}
	public static void DungTichMax() {
		System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
		System.out.println("\n");
		List<BonTam> listBT = new ArrayList<>();
		for (ThietBiVeSinh tbi : listTB) {
			if(tbi instanceof BonTam) {
				BonTam bt = (BonTam) tbi;
				listBT.add(bt);
			}
		}
		BonTam b = listBT.stream().max((m1,m2) -> (int)(m1.getDungTich() - m2.getDungTich())).get();
		float c = b.getDungTich();
		for(int i=0;i<listBT.size();i++) {
			if(listBT.get(i).getDungTich() == c) {
				listBT.get(i).displayData();
			}
		}
		
	}
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("*************MENU************");
			System.out.println("\n1.Nhap thong tin");
			System.out.println("\n2.Hien thi thong tin");
			System.out.println("\n3.Sap xep hang hoa theo gia giam dan");
			System.out.println("\n4.Sap xep hang hoa theo ten");
			System.out.println("\n5.Tim hang hoa theo khoang gia");
			System.out.println("\n6.Tim bon rua theo mau sac");
			System.out.println("\n7.Hien thi bon tam co dung tich lon nhat");
			System.out.println("\n8.Thoat");
			System.out.println("\nMoi ban chon:");
			luachon = scanner.nextInt();
			switch(luachon) {
				case 1:{
					nhap();
					break;
				}
				case 2:{
					System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
					System.out.println("\n");
					xuat();
					break;
				}
				case 3:{
					sapxepGia();
					System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
					System.out.println("\n");
					xuat();
					break;
				}
				case 4:{
					sapxepTen();
					System.out.printf("%5s %15s %15s %15.3s %15.3s %30s","Ma hang","Ten Hang","Nha Cung Cap","Gia","Dung Tich","Mau Sac");
					System.out.println("\n");
					xuat();
					break;
				}
				case 5:{
					timkiemGia();
					break;
				}
				case 6:{
					timkiemMau();
					break;
				}
				case 7:{
					DungTichMax();
					break;
				}
				case 8:{
					System.exit(0);
				}
				
			}
		}while(true);
	}
}
