package Hang;

import java.util.Scanner;

public class AgriCargo extends Cargo {
	protected float tax=5;
	
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	@Override
	void nhap() {
		Scanner scanner = new Scanner(System.in);
		inputData();
		System.out.println("Nhap thue");
		tax=scanner.nextFloat();
		if(tax >=0 && tax <5) {
			tax = 5;
		}
	}
	@Override
	void xuat() {
		displayData();
		try {
			
			if(tax <0 || tax >100) {
				System.out.println("Thue khong hop le");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("%15.3f",tax);
		System.out.println("\n");
	}
}
