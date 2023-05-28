package ThietBi;

import java.util.Scanner;

public class BonTam extends ThietBiVeSinh {
		private float DungTich;

		public float getDungTich() {
			return DungTich;
		}

		public void setDungTich(float dungTich) {
			DungTich = dungTich;
		}
		
		@Override
		public void inputData() {
			Scanner scanner = new Scanner(System.in);
			super.inputData();
			System.out.println("Nhap dung tich bon:");
			DungTich = scanner.nextFloat();
		}
		
		@Override
		public void displayData() {
		
			super.displayData();
			System.out.printf("%15.3f",DungTich);
			System.out.println("\n");
		}
}
