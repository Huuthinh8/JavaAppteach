package DieuHoa;

import java.util.Scanner;

public class DHSamSung extends DieuHoa{
	private int thangBaoHanh;
	
	public int getThangBaoHanh() {
		return thangBaoHanh;
	}

	public void setThangBaoHanh(int thangBaoHanh) {
		this.thangBaoHanh = thangBaoHanh;
	}

	@Override
	public void nhapTT() {
		Scanner scanner = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhap thang bao hanh:");
		thangBaoHanh = Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("Thang bao hanh: "+ thangBaoHanh);
		System.out.println("Tieu thu dien nang: "+tieuThuDienNang());
	}
	@Override
	public float tieuThuDienNang() {
		
		return super.tieuThuDienNang();
	}
}
