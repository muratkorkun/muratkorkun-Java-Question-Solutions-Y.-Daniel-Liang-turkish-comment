package Bolum09BenimYazdiklarim.sorular_9_13;
/*	Location UML Class Diagram
 * -------------------------------------------
 * +satir: int
 * +sutun: int
 * +enBuyukDeger: double
 * ---------------------------------
 * +_enBuyugunKonumu(dizi: double[][]): Location 
 * ------------------------------
 * 
 * @yazar Muratkorkun
 * 
*/

public class Konum {

	public  int satir;
	public  int sutun;
	public  double enBuyukDeger;
	
	//Gizli eriþim belirteci default olan bir Konum constructor metodu mevcuttur. 
	
	public static Konum enBuyugunKonumu(double[][] a) { // Enbuyuk sayýnýn konumunu bulan ve dizi olarak indekslerini
		Konum k = new Konum();									// döndüren metod.
		k.enBuyukDeger = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (k.enBuyukDeger < a[i][j]) {
					k.enBuyukDeger=a[i][j];
					k.satir = i;
					k.sutun = j;
				}
			}
		}
		return k;
	}
}
