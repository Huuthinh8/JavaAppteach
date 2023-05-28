package DieuHoa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassMain {
	static List<DieuHoa> listDH = new ArrayList<DieuHoa>();
	//Nhap thong tin
	public static void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin dieu hoa 1-SAMSUNG | 2-DAIKIN");
		int chon = scanner.nextInt();
		switch(chon) {
			case 1:{
				DieuHoa ss = new DHSamSung();
				ss.nhapTT();
				listDH.add(ss);
				break;
			}
			case 2:{
				DieuHoa dk = new DHDaikin();
				dk.nhapTT();
				listDH.add(dk);
				break;
			}
		}
	}
	//hien thi thong tin
	public static void xuat() {
		for (DieuHoa dieuHoa : listDH) {
			dieuHoa.hienThiTT();
		}
	}
	// tim san pham theo ten
	public static void timkiemName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten dieu hoa can tim:");
		String name = scanner.nextLine();
		List<DieuHoa> listName = listDH.stream().filter(m -> m.getNhanHieu().contains(name)).collect(Collectors.toList());
		for (DieuHoa dieuHoa : listName) {
			dieuHoa.hienThiTT();
		}
	}
	// tieu thu dien nag thap nhat
	public static void minTT() {
		
		float c = listDH.get(0).tieuThuDienNang();
		for(int i=0;i<listDH.size();i++) {
			if(listDH.get(i).tieuThuDienNang() < c) {
				c= listDH.get(i).tieuThuDienNang();
			}
		}
		for(int i=0;i<listDH.size();i++) {
			if(listDH.get(i).tieuThuDienNang() == c) {
				listDH.get(i).hienThiTT();
			}
		}
	}
	// bao hanh nhieu nhat
	public static void maxBH() {
		List<DHSamSung> listSS = new ArrayList<DHSamSung>();
		for (DieuHoa dieuHoa : listDH) {
			if(dieuHoa instanceof DHSamSung) {
				DHSamSung ss = (DHSamSung) dieuHoa;
				listSS.add(ss);
			}
		}
		DHSamSung maxbh = listSS.stream().max((o1,o2) -> (int)(o1.getThangBaoHanh() - o2.getThangBaoHanh())).get();
		int bh = maxbh.getThangBaoHanh();
		for(int i=0;i<listSS.size();i++) {
			if(listSS.get(i).getThangBaoHanh() == bh) {
				listSS.get(i).hienThiTT();
			}
		}
	}
	//ho tro INVENTER
	public static void htInventer() {
		List<DHDaikin> listDK = new ArrayList<DHDaikin>();
		for (DieuHoa dieuHoa : listDH) {
			if(dieuHoa instanceof DHDaikin) {
				DHDaikin dk = (DHDaikin) dieuHoa;
				listDK.add(dk);
			}
		}
		for(int i=0;i<listDK.size();i++) {
			if(listDK.get(i).isInventer() == true) {
				listDK.get(i).hienThiTT();
			}
		}
	}
	//sap xep theo ten
	public static void sapxepName() {
		for(int i=0;i<listDH.size();i++) {
			for(int j=i+1;j<listDH.size();j++) {
				if(listDH.get(i).getNhanHieu().compareTo(listDH.get(j).getNhanHieu()) > 0) {
					DieuHoa tg = listDH.get(i);
							listDH.set(i, listDH.get(j));
							listDH.set(j, tg);
				}
			}
		}
	}
	//ghi du lieu ra file
	
	public static void ghiData() {
		String path = "C:\\Users\\PC\\eclipse-workspace\\BaiTapLon\\dieuhoa2.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path,true);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			for (DieuHoa dieuHoa : listDH) {
				if(dieuHoa instanceof DHSamSung) {
					DHSamSung ss = (DHSamSung) dieuHoa;
					bw.write(ss.getMa());
					bw.write(",");
					bw.write(ss.getNhanHieu());
					bw.write(",");
					bw.write(ss.getNhaSX());
					bw.write(",");
					bw.write(String.valueOf(ss.getGia()));
					bw.write(",");
					bw.write(String.valueOf(ss.getCongSuat()));
					bw.write(",");
					bw.write(String.valueOf(ss.getThangBaoHanh()));
					bw.write(",");
					bw.newLine();
				}
			}
			for (DieuHoa dieuHoa : listDH) {
				if(dieuHoa instanceof DHDaikin) {
					DHDaikin dk = (DHDaikin) dieuHoa;
					bw.write(dk.getMa());
					bw.write(",");
					bw.write(dk.getNhanHieu());
					bw.write(",");
					bw.write(dk.getNhaSX());
					bw.write(",");
					bw.write(String.valueOf(dk.getGia()));
					bw.write(",");
					bw.write(String.valueOf(dk.getCongSuat()));
					bw.write(",");
					bw.write(String.valueOf(dk.isInventer()));
					bw.write(",");
					bw.newLine();
				}
			}
			bw.flush();
			bw.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("\n**************MENU**************");
			System.out.println("1.Nhap thong tin");
			System.out.println("2.Hien thi thong tin");
			System.out.println("3.Tim san pham theo ten");
			System.out.println("4.Hien thi san pham co muc tieu thu dien nang thap nhat");
			System.out.println("5.Hien thi san pham co thang bao hanh nhieu nhat");
			System.out.println("6.Hien thi san pham co ho tro INVENTER");
			System.out.println("7.Hien thi san pham sau khi sap xep theo ten");
			System.out.println("8.Ghi du lieu ra file van ban");
			System.out.println("9.Thoat");
			System.out.println("Moi ban chon:");
			luachon = scanner.nextInt();
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
					timkiemName();
					break;
				}
				case 4:{
					minTT();
					break;
				}
				case 5:{
					break;
				}
				case 6:{
					htInventer();
					break;
				}
				case 7:{
					sapxepName();
					xuat();
					break;
				}
				case 8:{
					ghiData();
					break;
				}
				case 9:{
					System.exit(0);
				}
			}
		}while(true);
	}
}
