package Tuan01;

public class Hinhchunhat {
	private double chieuDai;
	private double chieuRong;


/**
 * @return the chieuDai
 */
public double getChieuDai() {
	return chieuDai;
}

/**
 * @param chieuDai the chieuDai to set
 * @throws Exception 
 */
public void setChieuDai(double cD) throws Exception {
	if(cD > 0) {
		this.chieuDai=cD;
	}else {
		throw new IllegalAccessException("loi");}
	
}

/**
 * @return the chieuRong
 */
public double getChieuRong() {
	return chieuRong;
}

/**
 * @param chieuRong the chieuRong to set
 * @throws Exception 
 */
public void setChieuRong(double cR) throws Exception {
	if(cR > 0) {
		this.chieuRong=cR;
	}else {
		throw new IllegalArgumentException("loi");}
	
}

public Hinhchunhat(double chieuDai, double chieuRong) {
	this.chieuDai=chieuDai;
	this.chieuRong=chieuRong;

	
}

public Hinhchunhat() {
	super();
	// TODO Auto-generated constructor stub
}
public double getCV(){
	return (this.chieuDai + this.chieuRong) * 2;
	
}
public double getDT() {
	return this.chieuDai * this.chieuRong;
}
public static void main(String[]args) {
	Hinhchunhat h1 = new Hinhchunhat (10,20);
	Hinhchunhat h2 = new Hinhchunhat (0.5, 10);
	System.out.println(h1.getChieuDai());
	System.out.println(h1.getChieuRong());
	System.out.println(h2.getChieuDai());
	System.out.println(h2.getChieuRong());
	System.out.println("Dien tich Hinh Chu Nhat");
	System.out.println(h1.getCV());
	System.out.println(h2.getCV());
	System.out.println("Chu Vi Hinh Chu Nhat");
	System.out.println(h1.getDT());
	System.out.println(h2.getDT());
	
}
}
