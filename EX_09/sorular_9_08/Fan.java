package Bolum09BenimYazdiklarim.sorular_9_08;
/*------------UML Class Diagram--------------------
 * 	Fan
 * --------------------------
 * 	+_SLOW: int
 * 	+_MEDIUM: int
 * 	+_FAST: int
 * 	-speed: int
 * 	-on: boolean
 * 	-radius: double
 * 	-color: String
 * ------------------------
 * 	+Fan(): Fan
 * 	+setSpeed(newSpeed: int): void
 * 	+setOn(newOn: boolean): void
 * 	+setRadius(newRadius: double): void
 * 	+setColor(newColor: String): void
 * 	+getSpeed(): int
 * 	+getRadius(): double 
 * 	+isOn(): boolean
 * 	+getColor(): String
 * 	+toString(): String
 * 
 * @yazar Muratkorkun
 */
public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM =2;
	public static final int FAST = 3;
	private int speed ;
	private boolean on;
	private double radius;
	private String color;
	//varsayýlan constructor
	public Fan() {
		this.speed=SLOW;
		this.on=false;
		this.radius=5;
		this.color="mavi";
	}
	//setter metodlarý
	 public void setSpeed(int speed) {
		 this.speed=speed;
	 }
	public void setOn(boolean on) {
		this.on=on;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setColor(String color) {
		this.color=color;
	}
	//getter metodlarý
	public int getSpeed() {
		return speed;
	}
	public boolean isOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	// Fan durumunu String çýktý veren metod.
	public String toString() {
		return	"Fan durumu : "+(isOn()?"açýk":"kapalý")+ " hýzý: "+(isOn()?speed:0)+"  rengi: "+color+"  açýsý: "+radius;
	}
}
