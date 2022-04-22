package Bolum09BenimYazdiklarim.Sorular_9_06;
/*-----------------UML Class Diagram---------
 * Kronometre
 * ---------------------------
 * -baslangicZamani:long
 * -bitisZamani: long
 * ---------------------------
 * +Kronometre(): Kronometre
 * +basla()
 * +dur()
 * +alGecenSure(): long
 * +alBaslangicZamani: long
 * +alBitisZamani: long
 * 
 * 
 */
import java.util.Date;

public class Kronometre {
	private Date baslangicZamani;
	private Date bitisZamani;
	
	public Kronometre(){
		baslangicZamani = new Date();
	}
	public void basla() {
		baslangicZamani =new Date();
	}
	public void dur() {
		bitisZamani =new Date();
	}
	public long alGecenSure() {
		return bitisZamani.getTime()-baslangicZamani.getTime();
	}
	public long alBaslangicZamani() {
		return baslangicZamani.getTime();
	}
	public long alBitisZamani() {
		return bitisZamani.getTime();
	}
	
	

}
