package DieuHoa;

import java.util.Scanner;

public class DieuHoa implements IDieuHoaNhietDo,IInventer {
	private String ma;
	private String nhanHieu;
	private String nhaSX;
	private int congSuat;
	private float gia;
	
	
	public DieuHoa() {
		super();
	}
	
	
	public DieuHoa(String ma, String nhanHieu, String nhaSX, int congSuat, float gia) {
		super();
		this.ma = ma;
		this.nhanHieu = nhanHieu;
		this.nhaSX = nhaSX;
		this.congSuat = congSuat;
		this.gia = gia;
	}

	
	public String getMa() {
		return ma;
	}


	public void setMa(String ma) {
		this.ma = ma;
	}


	public String getNhanHieu() {
		return nhanHieu;
	}


	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}


	public String getNhaSX() {
		return nhaSX;
	}


	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}


	public int getCongSuat() {
		return congSuat;
	}


	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}


	public float getGia() {
		return gia;
	}


	public void setGia(float gia) {
		this.gia = gia;
	}

	
	@Override
	public float tieuThuDienNang() {
		return  congSuat * (float) TIET_KIEM_DIEN/100;
	}

	@Override
	public void nhapTT() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma dieu hoa:");
		ma = scanner.nextLine();
		boolean th = false;
		do {
			try {
				System.out.println("Nhap nhan hieu dieu hoa :");
				nhanHieu = scanner.nextLine();
				if(nhanHieu.length() < 5 || nhanHieu.length() > 32) {
					throw new Exception();
				}
				th = true;
			} catch (Exception e) {
				System.err.println("Nhan hieu khong dung dinh dang || Moi ban nhap lai");
			}
		}while(!th);
		boolean th1 = false;
		do {
			try {
				System.out.println("Nhap nha san xuat dieu hoa:");
				nhaSX= scanner.nextLine();
				if(nhaSX.length() < 5 || nhaSX.length() > 32) {
					throw new Exception();
				}
				th1 = true;
			} catch (Exception e) {
				System.err.println("Nha san xuat khong dung dinh dang || Moi ban nhap lai");
			}
		}while(!th1);
		
		boolean th2 = false;
		do {
			try {
				System.out.println("Nhap cong suat dieu hoa:");
				congSuat = Integer.parseInt(scanner.nextLine());
				if(congSuat < 100) {
					throw new Exception();
				}
				th2 = true;
			} catch (Exception e) {
				System.err.println("Cong suat phai toi thieu 100 tro len || Moi ban nhap lai");
			}
		}while(!th2);
		
		boolean th3 = false;
		do {
			try {
				System.out.println("Nhap gia dieu hoa:");
				gia = scanner.nextFloat();
				scanner.nextLine();
				if(gia < 0) {
					throw new Exception();
				}
				th3 = true;
			} catch (Exception e) {
				System.err.println("Gia phai lon hon hoac bang 0 || Moi ban nhap lai");
			}
		}while(!th3);
		
	}

	@Override
	public void hienThiTT() {
		System.out.println("Ma DH:"+ma);
		System.out.println("Nhan hieu: "+nhanHieu);
		System.out.println("Nha san xuat : "+nhaSX);
		System.out.println("Cong suat: "+congSuat);
		System.out.println("Gia: "+gia);
	}

}
