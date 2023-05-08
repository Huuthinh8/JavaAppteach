package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<Employee> list = new ArrayList<>();
	public static void nhap() {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n nhan vien");
		n = scanner.nextInt();
		scanner.nextLine();
		for(int i =0;i<n;i++) {
			Employee nv = new Employee();
			nv.inputData();
			list.add(nv);
		}		
	}
	public static void xuat() {
		for(int i=0;i<list.size();i++) {
			list.get(i).displayData();
		}
	}
	public static void sapxep() {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).salary > list.get(j).salary) {
					Employee tg = list.get(i);
							list.set(i, list.get(j));
							list.set(j, tg);
				}
			}
		}
	}
	
	public static void timkiem() {
		Scanner scanner = new Scanner(System.in);
		String ten;
		System.out.println("Nhap ten can tim:");
		ten = scanner.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).employeeName.equals(ten)) {
				list.get(i).displayData();
			}
		}
	}
	public static void capnhat() {
		String MaNV;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien can cap nhat:");
		MaNV = scanner.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).employeeId.equals(MaNV)) {
				list.get(i).setEmployeeStatus(true);
			}
		}
	}
	//sap xep theo ten giam dan
	public static void sapxeptheoten() {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).employeeName.compareTo(list.get(j).employeeName)<0) {
					Employee tg = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tg);
				}
			}
		}
	}
	public static void main(String[] args) {
		int luachon;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("**********************MENU******************");
			System.out.println("\n1.Nhap thong tin cho n nhan vien");
			System.out.println("\n2.Tinh luong tat ca nhan vien");
			System.out.println("\n3.Hien thi thong tin tat ca nhan vien");
			System.out.println("\n4.Sap xeps nhan vien theo luong tang dan");
			System.out.println("\n5.Tiem kiem nhan vien theo ten nhan vien");
			System.out.println("\n6.Cap nhat trang thai nhan vien theo ma nhan vien");
			System.out.println("\n7.Sap xep ten nhan vien giam dan");
			System.out.println("\n8.Thoat");
			System.out.println("\nMoi ban chon:");
			luachon=scanner.nextInt();
			scanner.nextLine();
			switch(luachon) {
				case 1:{
					nhap();
					break;
				}
				case 2:{
					xuat();
					break;
				}
				case 3:{
					xuat();
					break;
				}
				case 4:{
					sapxep();
					xuat();
					break;
				}
				case 5:{
					timkiem();
					break;
				}
				case 6:{
					capnhat();
					xuat();
					break;
				}
				case 7:{
					sapxeptheoten();
					xuat();
					break;
				}
				case 8:{
					System.exit(0);
				}
			}
			
		}while(true);
		
	}
}
