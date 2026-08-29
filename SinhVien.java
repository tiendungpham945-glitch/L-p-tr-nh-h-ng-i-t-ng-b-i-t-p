package quanlysinhvien;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	public SinhVien() {
		maSV=0;
		hoTen= "chua xac dinh";
		diemLT=0;
		diemTH=0;
	}
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return maSV;
	}
	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(int maSV) {
		if(maSV>0)
		{this.maSV=maSV;
	}else {
		this.maSV=0;}
	}
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		if(hoTen != null &&  !hoTen.trim().isEmpty()){
			this.hoTen=hoTen;
			
		}else {
			this.hoTen="chua xac dinh";
			
		}
		
	}
	/**
	 * @return the diemLT
	 */
	public double getDiemLT() {
		return diemLT;
	}
	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(double diemLT) {
		if(diemLT >0.0 && diemLT <= 10.0) {
		this.diemLT = diemLT;}
		else {this.diemLT=0.0;}
	}
	/**
	 * @return the diemTH
	 */
	public double getDiemTH() {
		return diemTH;
	}
	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(double diemTH) {
		if(diemTH >0.0 && diemTH <= 10.0) {
			this.diemTH = diemTH;}
			else {this.diemTH=0.0;}
		}
	public double diemTB() {
		return (getDiemLT() + getDiemTH())/2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		SinhVien sv1 = new SinhVien(
				24718731,
				"Nguyen Van A",
				7.5,
				8.0
				);
		SinhVien sv2 = new SinhVien(
				24718721,
				"Nguyen Van B",
				6.0,
				10.0
				);
	
		SinhVien sv3 = new SinhVien();
		System.out.println("Nhap ma sinh vien");
		int maSV =sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten sinh vien");
		String hoTen=sc.nextLine()
;
		System.out.println("Nhap diem Ly Thuyet");
		double diemLT=sc.nextDouble();
		System.out.println("Nhap diem Thuc Hanh");
		double diemTH=sc.nextDouble();
		sv3.setMaSV(maSV);
		sv3.setHoTen(hoTen);
		sv3.setDiemLT(diemLT);
		sv3.setDiemTH(diemTH);
		System.out.println("Danh sach sinh vien");
		System.out.printf("%-10s %-25s %10s %10s %10s%n ","MSSV","Ho Ten","Diem LT","Diem TH","Diem TB");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		sc.close();
	}
	 @Override
	    public String toString() {
	        return String.format(
	            "%-10d %-25s %10.1f %10.1f %10.1f",
	            maSV, hoTen, diemLT, diemTH, diemTB()
	        );
	    }
	
}

