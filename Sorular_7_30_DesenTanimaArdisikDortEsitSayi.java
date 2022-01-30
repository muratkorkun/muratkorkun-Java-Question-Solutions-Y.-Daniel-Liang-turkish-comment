package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_30_DesenTanimaArdisikDortEsitSayi {
	/*
	 * 7.30 (Desen tan�ma: ard���k d�rt e�it say�) Dizide ayn� de�ere sahip d�rt ard���k say� olup olmad���n� test eden a�a��daki metodu yaz�n�z.
	 * 
	 * public static boolean isConsecutiveFour(int[] values)
	 * 
	 * Kullan�c�dan bir tam say� dizisi alan ve dizide ayn� de�ere sahip d�rt ard���k say� olup olmad���n� arayan bir test program� yaz�n�z. Program�n�z �ncelikle kullan�c�dan dizinin boyutunu almal�d�r. 
	 * Program�n �rnek ak���n� inceleyiniz:
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
		System.out.println("L�tfen say� adetini ve say�lar� s�ras� ile giriniz");

		Scanner klavye = new Scanner(System.in);

		int[] dizi = new int[klavye.nextInt()];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = klavye.nextInt();
		}
	
		System.out.println("Dizi i�inde ard���k d�rt say� " + (ardisikDortSayiEsitMi(dizi) ? "vard�r." : "yoktur."));
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
