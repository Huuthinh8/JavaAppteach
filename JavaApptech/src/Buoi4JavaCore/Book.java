package Buoi4JavaCore;

import java.util.Scanner;

public class Book {
	 protected int Id;
	 protected String Name;
	 protected String Publisher;
	 protected int year;
	 protected float Price;
	public Book() {
		super();
	}
	public Book(int id, String name, String publisher, int year, float price) {
		super();
		Id = id;
		Name = name;
		Publisher = publisher;
		this.year = year;
		Price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	 Scanner scanner = new Scanner(System.in);
	 public void inputData() {
		 System.out.println("Nhap ma sach:");
		 Id = Integer.parseInt(scanner.nextLine());
		 System.out.println("Nhap ten sach:");
		 Name = scanner.nextLine();
		 System.out.println("Nhap nha xuat ban:");
		 Publisher = scanner.nextLine();
		 System.out.println("Nhap nam xuat ban:");
		 year = Integer.parseInt(scanner.nextLine());
		 System.out.println("Nhap gia tien:");
		 Price = scanner.nextFloat();
	 }
	 public void outputData() {
		 System.out.printf("%-5d %15s %15s %15d %15.3f\n",Id,Name,Publisher,year,Price);
	 }
}
