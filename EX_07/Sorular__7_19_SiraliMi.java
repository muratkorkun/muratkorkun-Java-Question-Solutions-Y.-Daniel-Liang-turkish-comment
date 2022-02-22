package Bolum07_DersteYazilanKodlar;

import java.util.Scanner; // java.util k�t�phanesinden Scanner s�n�f�n� import ettik.

public class Sorular__7_19_SiraliMi {

	public static void main(String[] args) {

		System.out.println("Ka� adet say� giriceksiniz?");
		Scanner klavye = new Scanner(System.in); // klavye nesnesi olu�turduk.

		int elemanSayisi = klavye.nextInt(); // klavye nesnesinin nextInt() �zelli�ini de�i�kene atad�k.
		int[] sayiDizisi = new int[elemanSayisi];

		System.out.println("Sayilar� giriniz. Say�lar�n s�ral� olup olmad��� kontrol edilecektir.");

		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i] = klavye.nextInt(); // Burada tekrar tekrar klavye nesnesinin nextInt() �zelli�ini al�p say�
												// dizisinin i' inci eleman� olarak atad�k.
		}
		klavye.close(); // klavye nesnesini close() methodu ile kapatt�k.
		String sonucMetni = siraliMi(sayiDizisi) ? "s�ral�d�r" : " s�ral� de�ildir."; // Burada kolay bir yaz�m sundu�u
																						// i�in ternary (?)(:)
																						// sentaks�n� kulland�k.
		System.out.println("Girdi�iniz say� dizisi " + sonucMetni);
	}

	public static boolean siraliMi(int[] sayiDizisi) { // Bu methodda selectedSort algoritmas�n�n ayn�s� yazd�k. Sadece
														// farkl� olarak yapt���m�z b�y�k-k���k k�yaslamas� sonucunda
														// indis de�erini ve indis i�indeki de�eri al�pda takas etmedik.
														// Bunun yerine s�ral� ve de�il �eklinde boolean de�erleri
														// d�nderdik.

		for (int i = 0; i < sayiDizisi.length - 1; i++) {
			for (int j = i + 1; j < sayiDizisi.length; j++) {
				if (sayiDizisi[i] > sayiDizisi[j]) {
					return false;
				}
			}
		}
		return true;
	}
} // ��z�m �rneklemleri (ilk say� dizinin elelman say�s�d�r.) => 8 10 1 5 16 61 9	// 11 1 ikinci �rneklem => 10 1 1 3 4 4 5 7 9 11 21
