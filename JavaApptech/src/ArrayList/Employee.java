package ArrayList;

import java.util.Scanner;

public class Employee {
	protected String employeeId;
	protected String employeeName;
	protected int age;
	protected float rate;
	protected float salary;
	protected boolean employeeStatus;
	public Employee() {
		super();
	}
	public Employee(String employeeId, String employeeName, int age, float rate, float salary, boolean employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	Scanner scanner = new Scanner(System.in);
	public void inputData() {
		System.out.println("Nhap ID nhan vien:");
		employeeId = scanner.nextLine();
		System.out.println("Nhap ten nhan vien:");
		employeeName = scanner.nextLine();
		System.out.println("Nhap tuoi nhan vien:");
		age = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap he so luong nhan vien:");
		rate = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Nhap trang thai nhan vien:");
		employeeStatus = (scanner.nextInt()==1) ? true : false;
	}
	
	public void displayData() {
		String c;
		if(employeeStatus == true) {
			c = "Tot";
		}else {
			c="Khong tot";
		}
		salary = rate*1300000;
		System.out.println(employeeId+"         "+employeeName+"       "+age+"         "+rate+"        "+salary+"         "+c);
	}
}
