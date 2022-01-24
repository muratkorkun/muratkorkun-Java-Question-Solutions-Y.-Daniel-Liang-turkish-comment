package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_17_OgrencileriSiralama {

	public static void main(String[] args) {

		System.out.println("L�tfen �grenci say�s�n� giriniz");
		Scanner klavye = new Scanner(System.in);
		int ogrenciSayisi = klavye.nextInt();
		System.out.println("L�tfen ��renci adlar� ve notlar�n� giriniz.");

		String[] ogrenciAdi = new String[ogrenciSayisi]; // iki farkl� diziyi kullan�c�dan say�s�n� ald�ktan sonra
															// olu�turduk.
		int[] ogrenciNotlari = new int[ogrenciSayisi];

		for (int i = 0; i < ogrenciNotlari.length; i++) { // kullan�c�dan s�ras� ile �nce isimleri sonra notlar� ald�k
															// ve dizilerin i�ini doldurduk.
			ogrenciAdi[i] = klavye.next();
			ogrenciNotlari[i] = klavye.nextInt();
		}
		klavye.close();

		ikiliDiziSiralama(ogrenciAdi, ogrenciNotlari); // iki dizi alan de�er d�nd�rmeyen ama s�ralama i�ini yapan void
														// tipinde method yazd�k.

		for (int i = 0; i < ogrenciNotlari.length; i++) {
			System.out.printf("%10s%4d\n", ogrenciAdi[i], ogrenciNotlari[i]);
		}

	}

	public static void ikiliDiziSiralama(String[] ogrenciAdi, int[] ogrenciNotlari) { // selectedSort methodunun tamamen
																						// tersten olan�n� yazd�k.Yaln�z
																						// bu methodun i�inde bir de
																						// String dizisin bu s�ralamaya
																						// uyarlamam�z gerekti.
		for (int i = 0; i < ogrenciNotlari.length; i++) { // notlar dizisini s�ralarken ayn� anda isimler dizisini de
															// s�ralad�k.
			int enBuyukNot = ogrenciNotlari[i];
			int enBuyukNotIndis = i;
			String enBuyukAd = ogrenciAdi[i];

			for (int j = i + 1; j < ogrenciNotlari.length; j++) {
				if (enBuyukNot < ogrenciNotlari[j]) {
					enBuyukNot = ogrenciNotlari[j];
					enBuyukNotIndis = j;
					enBuyukAd = ogrenciAdi[j]; // ogrenciNotlari dizisinin s�ralanmas�na ek olarak burada enBuyukAd
												// de�i�kenini de g�ncelledik.
				}
			}
			if (enBuyukNot != ogrenciNotlari[i]) { // enBuyukNot de�i�keni de�i�tiyse if blo�undaki kodlar �al��s�n
													// dedik.
				ogrenciNotlari[enBuyukNotIndis] = ogrenciNotlari[i];
				ogrenciNotlari[i] = enBuyukNot;
				ogrenciAdi[enBuyukNotIndis] = ogrenciAdi[i]; // ogrenciAdi indis numaras� ogrenciNotlari indisi
																// s�ralamas� ile tamamen ayn� oldu.
				ogrenciAdi[i] = enBuyukAd; // ogrenciAdi'na d�� d�ng� her d�nd���nde bu kod blo�u �al��t� ise enBuyukAd
											// de�erinin atamas�n� yapt�k.

			}

		}
	}
} // test �rneklemi => ogrenci say�s�, isimleri, notlar� : 5 ahmet 56 mehmet 45
	// musa 34 beyza 80 belinay 80
