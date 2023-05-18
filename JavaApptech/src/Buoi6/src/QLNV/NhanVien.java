package QLNV;

import java.util.Scanner;

public abstract class NhanVien {
	protected String id;
	protected String name;
	protected float baseSalary=970000;
	protected float salary;
	protected int yearOfBirth;
	public NhanVien() {
		super();
	}
	public NhanVien(String id, String name, float salary, int yearOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearOfBirth = yearOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien:");
		id = scanner.nextLine();
		System.out.println("Nhap ten nhan vien:");
		name = scanner.nextLine();
		System.out.println("Nhap nam sinh nhan vien:");
		yearOfBirth = Integer.parseInt(scanner.nextLine());
	}
	
	public void display() {
		
		System.out.print("ID:"+id+"|"+name+"-"+yearOfBirth+"|"+"Salary: ");
	}
	
	abstract void calSalary();
	void nhap() {
		// TODO Auto-generated method stub
		
	}
	void xuat() {
		// TODO Auto-generated method stub
		
	}
	void xuatVP() {
		// TODO Auto-generated method stub
		
	}
}
