package Bolum09BenimYazdiklarim.sorular_9_09;
/*  DuzgunCokgen UML Class Diagram
 * -------------------------------------------
 * -n: int
 * -kenar: double
 * -x: double
 * -y: double
 * ---------------------------------
 * +DuzgunCokgen(): DuzgunCokgen
 * +DuzgunCokgen(n: int,kenar: double): DuzgunCokgen
 * +DuzgunCokgen(n: int, n: kenar, x: double, y: double): DuzgunCokgen
 * +setN(yeniN: int): void
 * +setKenar(yeniKenar: double): void
 * +setX(yeniX: double): void
 * +setY(yeniY: double): void
 * +getN(): int
 * +getKenar(): double
 * +getX(): double
 * +getY(): double
 * +getCevre(): double
 * +getAlan(): double
 * ------------------------------
 * 
 * @yazar Muratkorkun
 * 
 */

public class DuzgunCokgen {
	private int n;
	private double kenar;
	private double x;
	private double y;
	
	public DuzgunCokgen() {
		this.n = 3;
		this.kenar = 1;
	}
	public DuzgunCokgen(int n, double kenar) {
		if(n > 2) {
			this.n = n;	
		}
		if(kenar > 0) {
			this.kenar = kenar;	
		}
	}
	public DuzgunCokgen(int n, double kenar, double x,double y) {
		this(n,kenar);
		this.x = x;
		this.y = y;
	}
	
	public void setN(int n) {
		if(n > 2) {
			this.n = n;	
		}
	}
	public void setKenar(int kenar) {
		if(kenar > 0) {
			this.kenar = kenar;	
		}
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public double getKenar() {
		return kenar;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getCevre() {
		return n*kenar;
	}
	public double getAlan() { 
		return  n*kenar*kenar /( 4 * Math.tan(Math.PI/n));
	}
	
	
	

}
