package Bolum09BenimYazdiklarim.sorular_9_11;
/*  Cebir_2x2_DogrusalDenklem UML Class Diagram
 * -------------------------------------------
 * -a: double
 * -b: double
 * -c: double
 * -d: double
 * -e: double
 * -f: double
 * ---------------------------------
 * +Cebir_2x2_DogrusalDenklem (a: double,b: double,c: double,d: double,e: double,f: double): Nesne
 * +getA(): double
 * +getB(): double
 * +getC(): double
 * +getD(): double
 * +getE(): double
 * +getF(): double
 * +isSolvable(): boolean
 * +getX(): double
 * +getY(): double
 * ------------------------------
 * 
 * @yazar Muratkorkun
 * 
*/
public class DogrusalDenklem {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public DogrusalDenklem(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		return a*d - b*c == 0 ? false : true;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	

}
