package Bolum09BenimYazdiklarim.Sorular_9_02;

/*----------------UML Class Diagram--------------
 * Stok
 * ------------------------------
 * -sembol: String
 * -isim: String
 * +oncekiKapanisFiyati: double
 * +guncelFiyat: double
 * -----------------------------
 * +Stok(symbol: String, name: String)
 * +alDegisimYuzdesi(): double 
 * 
 * @yazar Muratkorkun
 *  
 */
public class Stok {
	private String sembol;
	private String isim;
	public double oncekiKapanisFiyati;
	public double guncelFiyat;
	
	public Stok(String sembol,String isim) {
		this.sembol=sembol;
		this.isim=isim;
	}
	
	public double alDegisimYuzdesi() {
		return (guncelFiyat- oncekiKapanisFiyati)/oncekiKapanisFiyati*100;
	}

}
