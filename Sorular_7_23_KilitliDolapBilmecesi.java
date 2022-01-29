package Bolum07_DersteYazilanKodlar;

public class Sorular_7_23_KilitliDolapBilmecesi {

	public static void main(String[] args) {

		boolean[] dolapDurumu = new boolean[100];   // Ýpucunda verildiði üzer dolap durumlarýný tuttuðumuz boolean diziyi oluþturduk.

		for (int i = 0; i < dolapDurumu.length; i++) {  // Dizi içine false yani dolap kapalý deðerini doldurduk.
			dolapDurumu[i] = false;
		} 
		
		int ogrenciSayisi = 100;    // Öðrenci sayýsý ve dolap sayýsýnýn 100 adet olduðunu biliyoruz.
		int dolapSayisi = 100;

		for (int i = 1; i <= ogrenciSayisi; i++) {  // Her bir öðrencinin  gelip  kaçýncý sýradalarsa buna göre dolaplara eriþip durumlarýný deðpiþtrdiðini biliyoruz.

			for (int j = 1; j <= dolapSayisi; j++) {   // Dolap durumlarýný deðiþtiren durumlarý ele alýyoruz .
				if (i * j <= dolapSayisi) {
					if (dolapDurumu[i * j-1] == false) {  // Burada dolap sayýsý i*j den bir eksik olmasý gerekli . Çünki i nin ve j nin ikisininde 10 olduðu durumu düþünelim .
															//Buna göre dolap indisi 100 olamayacaðýndan her zaman i*j nin 1 eksiðini hesap ediyoruz.Yani asýl eriþtiðimiz dolaplarýn sýrasýný doðrulamýþ olduk..
						dolapDurumu[i * j-1] = true;
					} else {
						dolapDurumu[i * j-1] = false;
					}
				} else {
					break;
				}
			}
		}
		System.out.print("Açýk olan dolaplarýn numarasý þunlardýr : ");  // Son durumda dolaplarýn açk durumda olanlarýnýnýn indislerini ekrana yazdýrdýk.
		for (int i = 0; i < dolapDurumu.length; i++) {
			if(dolapDurumu[i]) {
				System.out.print(" "+(i+1)); 								//Burada son kullanýcý düzeyinde  örneðin 0 indisli dolabý 1'inci dolap olarak ekrana yazdýrdýk.
			}
		}
	}

}
