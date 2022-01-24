package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_17_OgrencileriSiralama {

	public static void main(String[] args) {

		System.out.println("Lütfen Ögrenci sayýsýný giriniz");
		Scanner klavye = new Scanner(System.in);
		int ogrenciSayisi = klavye.nextInt();
		System.out.println("Lütfen öðrenci adlarý ve notlarýný giriniz.");

		String[] ogrenciAdi = new String[ogrenciSayisi]; // iki farklý diziyi kullanýcýdan sayýsýný aldýktan sonra
															// oluþturduk.
		int[] ogrenciNotlari = new int[ogrenciSayisi];

		for (int i = 0; i < ogrenciNotlari.length; i++) { // kullanýcýdan sýrasý ile önce isimleri sonra notlarý aldýk
															// ve dizilerin içini doldurduk.
			ogrenciAdi[i] = klavye.next();
			ogrenciNotlari[i] = klavye.nextInt();
		}
		klavye.close();

		ikiliDiziSiralama(ogrenciAdi, ogrenciNotlari); // iki dizi alan deðer döndürmeyen ama sýralama iþini yapan void
														// tipinde method yazdýk.

		for (int i = 0; i < ogrenciNotlari.length; i++) {
			System.out.printf("%10s%4d\n", ogrenciAdi[i], ogrenciNotlari[i]);
		}

	}

	public static void ikiliDiziSiralama(String[] ogrenciAdi, int[] ogrenciNotlari) { // selectedSort methodunun tamamen
																						// tersten olanýný yazdýk.Yalnýz
																						// bu methodun içinde bir de
																						// String dizisin bu sýralamaya
																						// uyarlamamýz gerekti.
		for (int i = 0; i < ogrenciNotlari.length; i++) { // notlar dizisini sýralarken ayný anda isimler dizisini de
															// sýraladýk.
			int enBuyukNot = ogrenciNotlari[i];
			int enBuyukNotIndis = i;
			String enBuyukAd = ogrenciAdi[i];

			for (int j = i + 1; j < ogrenciNotlari.length; j++) {
				if (enBuyukNot < ogrenciNotlari[j]) {
					enBuyukNot = ogrenciNotlari[j];
					enBuyukNotIndis = j;
					enBuyukAd = ogrenciAdi[j]; // ogrenciNotlari dizisinin sýralanmasýna ek olarak burada enBuyukAd
												// deðiþkenini de güncelledik.
				}
			}
			if (enBuyukNot != ogrenciNotlari[i]) { // enBuyukNot deðiþkeni deðiþtiyse if bloðundaki kodlar çalýþsýn
													// dedik.
				ogrenciNotlari[enBuyukNotIndis] = ogrenciNotlari[i];
				ogrenciNotlari[i] = enBuyukNot;
				ogrenciAdi[enBuyukNotIndis] = ogrenciAdi[i]; // ogrenciAdi indis numarasý ogrenciNotlari indisi
																// sýralamasý ile tamamen ayný oldu.
				ogrenciAdi[i] = enBuyukAd; // ogrenciAdi'na dýþ döngü her döndüðünde bu kod bloðu çalýþtý ise enBuyukAd
											// deðerinin atamasýný yaptýk.

			}

		}
	}
} // test örneklemi => ogrenci sayýsý, isimleri, notlarý : 5 ahmet 56 mehmet 45
	// musa 34 beyza 80 belinay 80
