package Bai1;

import java.util.Scanner;

public class QuanLyBanHang {
	private String proID;
	private String proName;
	private String manufacturer;
	private float proPrice;
	public QuanLyBanHang() {
		super();
	}
	public QuanLyBanHang(String proID, String proName, String manufacturer, float proPrice) {
		super();
		this.proID = proID;
		this.proName = proName;
		this.manufacturer = manufacturer;
		this.proPrice = proPrice;
	}
	public String getProID() {
		return proID;
	}
	public void setProID(String proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public float getProPrice() {
		return proPrice;
	}
	public void setProPrice(float proPrice) {
		this.proPrice = proPrice;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma san pham:");
		proID = scanner.nextLine();
		System.out.println("Nhap ten san pham:");
		proName = scanner.nextLine();
		System.out.println("Nhap nha san xuat:");
		manufacturer = scanner.nextLine();
		System.out.println("Nhap gia san pham:");
		proPrice= scanner.nextFloat();
	}
	
	public void display() {
		System.out.printf("%-5s%15s%15s%15.3f\n",proID,proName,manufacturer,proPrice);
	}
	
	public float caculateSalePrice() {
		float saleprice=0;
		saleprice = proPrice * 95 / 100;
		return saleprice;
	}
}
