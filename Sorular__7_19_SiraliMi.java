package Bolum07_DersteYazilanKodlar;

import java.util.Scanner; // java.util kütüphanesinden Scanner sýnýfýný import ettik.

public class Sorular__7_19_SiraliMi {

	public static void main(String[] args) {

		System.out.println("Kaç adet sayý giriceksiniz?");
		Scanner klavye = new Scanner(System.in); // klavye nesnesi oluþturduk.

		int elemanSayisi = klavye.nextInt(); // klavye nesnesinin nextInt() özelliðini deðiþkene atadýk.
		int[] sayiDizisi = new int[elemanSayisi];

		System.out.println("Sayilarý giriniz. Sayýlarýn sýralý olup olmadýðý kontrol edilecektir.");

		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i] = klavye.nextInt(); // Burada tekrar tekrar klavye nesnesinin nextInt() özelliðini alýp sayý
												// dizisinin i' inci elemaný olarak atadýk.
		}
		klavye.close(); // klavye nesnesini close() methodu ile kapattýk.
		String sonucMetni = siraliMi(sayiDizisi) ? "sýralýdýr" : " sýralý deðildir."; // Burada kolay bir yazým sunduðu
																						// için ternary (?)(:)
																						// sentaksýný kullandýk.
		System.out.println("Girdiðiniz sayý dizisi " + sonucMetni);
	}

	public static boolean siraliMi(int[] sayiDizisi) { // Bu methodda selectedSort algoritmasýnýn aynýsý yazdýk. Sadece
														// farklý olarak yaptýðýmýz büyük-küçük kýyaslamasý sonucunda
														// indis deðerini ve indis içindeki deðeri alýpda takas etmedik.
														// Bunun yerine sýralý ve deðil þeklinde boolean deðerleri
														// dönderdik.

		for (int i = 0; i < sayiDizisi.length - 1; i++) {
			for (int j = i + 1; j < sayiDizisi.length; j++) {
				if (sayiDizisi[i] > sayiDizisi[j]) {
					return false;
				}
			}
		}
		return true;
	}
} // çözüm örneklemleri (ilk sayý dizinin elelman sayýsýdýr.) => 8 10 1 5 16 61 9	// 11 1 ikinci örneklem => 10 1 1 3 4 4 5 7 9 11 21
