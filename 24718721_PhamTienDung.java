package Tuan01;

public class Hinhtron {
	private Toado Tam;
	private double banKinh;
	public final double PI = 3.1416;
	/**
	 * @return the tam
	 */
	public Toado getTam() {
		return Tam;
	}
	/**
	 * @param tam the tam to set
	 */
	public void setTam(Toado tam) {
		Tam = tam;
	}
	/**
	 * @return the banKinh
	 */
	public double getBanKinh() {
		return banKinh;
	}
	/**
	 * @param banKinh the banKinh to set
	 */
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public Hinhtron(Toado tam, double banKinh) {
		
		Tam = tam;
		this.banKinh = banKinh;
	}
	public static void main(String[] args) {
		Hinhtron h1= new Hinhtron(new Toado("O",3,4),12);
		System.out.println("thong tin hinh tron");
		System.out.println("Ban kinh hinh tron");
		System.out.println(h1.getBanKinh());
		System.out.println("Tam hinh tron la " + h1.Tam.getName());
	}
	
	

}
