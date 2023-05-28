package ThietBi;

import java.util.Scanner;

public class ThietBiVeSinh {
	private String ma;
	private String TenHang;
	private String NhaCC;
	private float gia;
	public ThietBiVeSinh() {
		super();
	}
	public ThietBiVeSinh(String ma, String tenHang, String nhaCC, float gia) {
		super();
		this.ma = ma;
		TenHang = tenHang;
		NhaCC = nhaCC;
		this.gia = gia;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public String getNhaCC() {
		return NhaCC;
	}
	public void setNhaCC(String nhaCC) {
		NhaCC = nhaCC;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Nhap ma hang:");
			ma = scanner.nextLine();
			System.out.println("Nhap ten hang:");
			TenHang = scanner.nextLine();
			System.out.println("Nhap nha cung cap:");
			NhaCC = scanner.nextLine();
			System.out.println("Nhap gia:");
			gia = scanner.nextFloat();
			scanner.nextLine();
			
//			if(TenHang.length() < 5 && TenHang.length() >32) {
//				System.out.println("Ban can nhap dung yeu cau");
//				break;
//			}
//			if(TenHang.length() < 5 && TenHang.length() >32) {
//				System.out.println("Ban can nhap dung yeu cau");
//				break;
//			}
		
	}
	
	public void displayData() {
		System.out.printf("%5s%15s%15s%15.3f",ma,TenHang,NhaCC.toUpperCase(),gia);
	}
}
