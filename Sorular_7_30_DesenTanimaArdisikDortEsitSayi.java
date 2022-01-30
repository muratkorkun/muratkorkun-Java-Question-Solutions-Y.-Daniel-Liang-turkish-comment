package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_30_DesenTanimaArdisikDortEsitSayi {
	/*
	 * 7.30 (Desen tanýma: ardýþýk dört eþit sayý) Dizide ayný deðere sahip dört ardýþýk sayý olup olmadýðýný test eden aþaðýdaki metodu yazýnýz.
	 * 
	 * public static boolean isConsecutiveFour(int[] values)
	 * 
	 * Kullanýcýdan bir tam sayý dizisi alan ve dizide ayný deðere sahip dört ardýþýk sayý olup olmadýðýný arayan bir test programý yazýnýz. Programýnýz öncelikle kullanýcýdan dizinin boyutunu almalýdýr. 
	 * Programýn örnek akýþýný inceleyiniz:
	 * 
	 * Girilecek deger sayisini giriniz: 8
	 * Degerleri giriniz: 3 4 5 5 5 5 4 5
	 * Dizide ardisik dort deger vardir
	 * 
	 * Girilecek deger sayisini giriniz: 9
	 * Degerleri giriniz: 3 4 5 5 6 5 5 4 5
	 * Dizide ardisik dort deger yoktur
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Lütfen sayý adetini ve sayýlarý sýrasý ile giriniz");

		Scanner klavye = new Scanner(System.in);

		int[] dizi = new int[klavye.nextInt()];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = klavye.nextInt();
		}
	
		System.out.println("Dizi içinde ardýþýk dört sayý " + (ardisikDortSayiEsitMi(dizi) ? "vardýr." : "yoktur."));
		klavye.close();
	}

	public static boolean ardisikDortSayiEsitMi(int[] dizi) {
		for (int i = 0; i < dizi.length - 3; i++) {
			if (dizi[i] == dizi[i+1] && dizi[i] == dizi[i + 2] && dizi[i] == dizi[i + 3]) {
				return true;
			}
		}
		return false;
	}
}
