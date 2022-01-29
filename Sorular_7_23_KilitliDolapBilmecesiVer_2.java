package Bolum07_DersteYazilanKodlar;

public class Sorular_7_23_KilitliDolapBilmecesiVer_2 {

	public static void main(String[] args) {

		boolean[] dolapDurumu = new boolean[100];   // �pucunda verildi�i �zer dolap durumlar�n� tuttu�umuz boolean diziyi olu�turduk.

		for (int i = 0; i < dolapDurumu.length; i++) {  // Dizi i�ine false yani dolap kapal� de�erini doldurduk.
			dolapDurumu[i] = false;
		} 
		
		int ogrenciSayisi = 100;    // ��renci say�s� ve dolap say�s�n�n 100 adet oldu�unu biliyoruz.
		int dolapSayisi = 100;

		for (int i = 1; i <= ogrenciSayisi; i++) {  // Her bir ��rencinin  gelip  ka��nc� s�radalarsa buna g�re dolaplara eri�ip durumlar�n� de�pi�trdi�ini biliyoruz.

			for (int j = i-1; j < dolapSayisi; j+=i) {    // Burada i'inci  �grenci say�s�n� j'inci  dolap say�s� ile ba�da�t�ran algoritmay� olu�turduk. �grenci numaras�n� i'yi  dolap numaras�na j'ye  her turda ekledik ve j nin 1 eksi�ini ald�k.
				
					dolapDurumu[j]=!dolapDurumu[j];
			
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
