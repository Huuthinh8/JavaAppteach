package DieuHoa;

import java.util.Scanner;

public class DHDaikin extends DieuHoa {
	private boolean isInventer=true;
	
	public boolean isInventer() {
		return isInventer;
	}
	public void setInventer(boolean isInventer) {
		this.isInventer = isInventer;
	}
	@Override
	public void nhapTT() {
		Scanner scanner = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap inventer: ");
		isInventer = Boolean.parseBoolean(scanner.nextLine());
	}
	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Inventer: "+isInventer);
		System.out.print("Tieu thu: "+tieuThuDienNang());
	}
	@Override
	public float tieuThuDienNang() {
		if(isInventer == true)
		return super.tieuThuDienNang();
		else {
			return getCongSuat();
		}
	}
}
