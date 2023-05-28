package Hang;

import java.util.Scanner;

public class FoodCargo extends Cargo {
	protected int exDate;
	
	

	public int getExDate() {
		return exDate;
	}

	public void setExDate(int exDate) {
		this.exDate = exDate;
	}

	@Override
	void nhap1() {
		Scanner scanner = new Scanner(System.in);
		inputData();
		System.out.println("Nhap han su dung");
		exDate = scanner.nextInt();
	}
	
	@Override
	void xuat1() {
		displayData();
		try {
			if(exDate < 3) {
				System.out.println("Han su dung phai lon hon 3");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("%30d",exDate);
		System.out.println("\n");
	}
}
