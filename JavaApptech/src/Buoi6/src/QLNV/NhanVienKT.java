package QLNV;

import java.util.Scanner;

public class NhanVienKT extends NhanVien{
	protected float bonus;
	
	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	@Override
	void nhap() {
		inputData();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thuong:");
		bonus = scanner.nextFloat();
	}
	@Override
	void xuat() {
		display();
		calSalary();
	}
	@Override
	void calSalary() {
		salary = baseSalary + bonus;
		System.out.println(salary);
	}
	
	
	
}
