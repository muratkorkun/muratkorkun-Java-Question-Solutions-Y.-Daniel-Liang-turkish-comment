package Bolum09BenimYazdiklarim.Sorular_9_01_DikdortgenSinifi;
/*
 * ------------UML Class Diagram-------------------
 * Dikdortgen
 * ---------------------------------------------
 * +en: double
 * +boy double
 * ---------------------------------------------
 * +Dikdortgen(): Dikdortgen
 * +Dikdortgen(en,boy): Dikdortgen
 * +alAlan(): double
 * +alCevre(): double
 * 
 * 
 * @yazar Muratkorkun
 */

public class Dikdortgen {
	public double en ;
	public double boy ;
	
	public Dikdortgen() {
		en = 1;
		boy = 1;
	}
	
	public Dikdortgen(double en, double boy) {
		this.en=en;
		this.boy=boy;
	}
	
	public double alAlan() {
		return en*boy;
	}
	
	public double alCevre() {
		return (en+boy)*2;
	}
	
}