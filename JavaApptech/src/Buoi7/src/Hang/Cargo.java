package Hang;

import java.util.Scanner;

public class Cargo {
	protected int id;
	protected String name;
	protected String supplier;
	protected int quantily;
	protected float price;
	public Cargo() {
		super();
	}
	public Cargo(int id, String name, String supplier, int quantily, float price) {
		super();
		this.id = id;
		this.name = name;
		this.supplier = supplier;
		this.quantily = quantily;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getQuantily() {
		return quantily;
	}
	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public  void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma hang:");
		id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap ten hang:");
		name = scanner.nextLine();
		System.out.println("Nhap nha cung cap:");
		supplier = scanner.nextLine();
		System.out.println("Nhap so luong:");
		quantily = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap gia:");
		price = scanner.nextFloat();
		scanner.nextLine();
		
	}
	
	
	public void displayData() {
		try {
			
			if(name.length() <5 || name.length() >32) {
				System.out.println("Ten hang khong hop le");
				System.exit(0);
			}else if(supplier.length() <3 || supplier.length() > 128) {
				System.out.println("Ten nha cung cap khong hop le");
				System.exit(0);
			}else if(quantily < 0) {
				System.out.println("So luong khong hop le");
				System.exit(0);
			}else if(price < 0) {
				System.out.println("Gia khong hop le");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.printf("%5d%15s%15s%15d%15.3f",id,name,supplier,quantily,price);
	}
	void nhap() {
		// TODO Auto-generated method stub
		
	}
	void xuat() {
		// TODO Auto-generated method stub
		
	}
	void nhap1() {
		// TODO Auto-generated method stub
		
	}
	void xuat1() {
		// TODO Auto-generated method stub
		
	}
	
}
