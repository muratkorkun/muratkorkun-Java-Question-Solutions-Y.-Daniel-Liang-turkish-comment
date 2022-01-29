package Bolum07_DersteYazilanKodlar;

public class Sorular_7_23_KilitliDolapBilmecesi {

	public static void main(String[] args) {

		boolean[] dolapDurumu = new boolean[100];   // �pucunda verildi�i �zer dolap durumlar�n� tuttu�umuz boolean diziyi olu�turduk.

		for (int i = 0; i < dolapDurumu.length; i++) {  // Dizi i�ine false yani dolap kapal� de�erini doldurduk.
			dolapDurumu[i] = false;
		} 
		
		int ogrenciSayisi = 100;    // ��renci say�s� ve dolap say�s�n�n 100 adet oldu�unu biliyoruz.
		int dolapSayisi = 100;

		for (int i = 1; i <= ogrenciSayisi; i++) {  // Her bir ��rencinin  gelip  ka��nc� s�radalarsa buna g�re dolaplara eri�ip durumlar�n� de�pi�trdi�ini biliyoruz.

			for (int j = 1; j <= dolapSayisi; j++) {   // Dolap durumlar�n� de�i�tiren durumlar� ele al�yoruz .
				if (i * j <= dolapSayisi) {
					if (dolapDurumu[i * j-1] == false) {  // Burada dolap say�s� i*j den bir eksik olmas� gerekli . ��nki i nin ve j nin ikisininde 10 oldu�u durumu d���nelim .
															//Buna g�re dolap indisi 100 olamayaca��ndan her zaman i*j nin 1 eksi�ini hesap ediyoruz.Yani as�l eri�ti�imiz dolaplar�n s�ras�n� do�rulam�� olduk..
						dolapDurumu[i * j-1] = true;
					} else {
						dolapDurumu[i * j-1] = false;
					}
				} else {
					break;
				}
			}
		}
		System.out.print("A��k olan dolaplar�n numaras� �unlard�r : ");  // Son durumda dolaplar�n a�k durumda olanlar�n�n�n indislerini ekrana yazd�rd�k.
		for (int i = 0; i < dolapDurumu.length; i++) {
			if(dolapDurumu[i]) {
				System.out.print(" "+(i+1)); 								//Burada son kullan�c� d�zeyinde  �rne�in 0 indisli dolab� 1'inci dolap olarak ekrana yazd�rd�k.
			}
		}
	}

}
