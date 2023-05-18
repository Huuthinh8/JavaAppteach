package QLNV;

import java.util.Scanner;

public class NhanVienVP extends NhanVien{
	static float range = 1.5f;
	@Override
	void calSalary() {
		salary = baseSalary * range;
		System.out.println(salary);
	}
	@Override
	void xuatVP() {
		display();
		calSalary();
	}
	@Override
	void nhap() {
		inputData();
	}
}
