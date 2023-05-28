package ThietBi;

import java.util.Scanner;

public class ChauRua  extends ThietBiVeSinh{
	private String MauSac;

	public String getMauSac() {
		return MauSac;
	}

	public void setMauSac(String mauSac) {
		MauSac = mauSac;
	}
	
	@Override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		super.inputData();
		System.out.println("Nhap mau sac bon rua:");
		MauSac = scanner.nextLine();
	}
	
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.printf("%30s",MauSac);
		System.out.println("\n");
	}
}
