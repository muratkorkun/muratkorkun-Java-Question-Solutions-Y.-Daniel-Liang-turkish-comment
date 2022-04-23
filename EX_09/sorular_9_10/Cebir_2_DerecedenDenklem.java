package Bolum09BenimYazdiklarim.sorular_9_10;
/*  Cebir UML Class Diagram
 * -------------------------------------------
 * -a: double
 * -b: double
 * -c: double
 * ---------------------------------
 * +Cebir (a: double,b: double,c: double): Cebir
 * +getA(): double
 * +getB(): double
 * +getC(): double
 * +getDiskriminant(): double
 * +getKok1(): double
 * +getKok2(): double
 * ------------------------------
 * 
 * @yazar Muratkorkun
 * 
 */
public class Cebir_2_DerecedenDenklem {
	//Data Alanlar�
	private double a;
	private double b;
	private double c;
	//b�t�n data alanlar�n� parametre olarak alan yapp�c� metod
	public Cebir_2_DerecedenDenklem(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//getter metodlar� di�er ad� eri�im metodlar�
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	//di�er hesaplama yapan ve geriye de�er d�nd�ren nesne metodlar�
	public double getDiskriminant() {
		return Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5);
	}
	public double getKok1() {
		if(getDiskriminant() < 0) {
			return 0;
		}
		return (-b + getDiskriminant()) / 2 * a;
	}
	public double getKok2() {
		return getDiskriminant() < 0 ? 0 : (-b - getDiskriminant()) / 2 * a;
	}

}
