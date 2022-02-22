package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_15_TekrarlananSayilariCikartma_2 {

	private static int[] tekrarlananSayilariCikart(int[] dizi) { // Bu method ile tekrar eden say�lar� ��kartt�k.
		int[] yeniDizi = new int[dizi.length];
		int sayac = 0; // Bu sayac� kopya olmayan say�lar� buldu�umuzda indis olarak kullanmak i�in
						// olu�turduk.
		for (int i = 0; i < dizi.length; i++) { // Dolu olan dizinin elemanlar�n� tek tek al�p dolduraca��m�z dizide var
												// m� diye kontrol ettik.
			boolean kopyaMi = false; // D�ng� her d�nd���nde kontrol de�erimize false atamam� yapt�k.

			for (int j = 0; j < yeniDizi.length; j++) { // Burada dolu dizideki eleman yeni yeni doldurulmu� olan dizide
														// var m� diye kontrol ettik.
				if (dizi[i] == yeniDizi[j]) { // dolu dizideki eleman dolacak dizideki elemanla e�it ise kopyad�r dedik.
					kopyaMi = true;
				}

			}
			if (!kopyaMi) { // i� d�ng�den gelen true de�eri olmad� ise yani kopya de�il ise kontrol edilen
							// dolu dizinin i'incisi dolacak dizinin sayac'�nc�s�na atad�k.Bunu d�� d�ng�
							// i�inde yapt�k.
				{
					yeniDizi[sayac++] = dizi[i];
				}
			}
		}

		int[] dizidenSifirCikarilmis = new int[sayac]; // burada isminden anla��laca�� �zere yeni doldurulan dizideki
														// s�f�rlar� att�k.
		for (int j = 0; j < sayac; j++) {

			dizidenSifirCikarilmis[j] = yeniDizi[j];
		}

		return dizidenSifirCikarilmis;

	}

	public static void main(String[] args) {
		System.out.println("L�tfen tekrarlanan say�lar�n ��kart�laca�� 10 adet say� giriniz.");

		Scanner klavye = new Scanner(System.in); // Kullan�c�dan 10 say� istedik.

		int[] dizi = new int[10];
		for (int i = 0; i < dizi.length; i++) { // Ald���m�z say�lar� bir diziye doldurduk.
			dizi[i] = klavye.nextInt();
		}
		klavye.close();

		int[] yeniDizi = tekrarlananSayilariCikart(dizi); // Dizi verileri ile i�lem yapt�k. Bu i�lem sonucunda yeni bir
															// dizi d�nderdik.Bu sebeple i�lem sonucunu g�rebilmek i�in
															// yeni bir dizi de�i�kenine atama yapmam�z gerekti.

		for (int i = 0; i < yeniDizi.length; i++) { // D�nderilen diziyi yazd�rd�k.
			System.out.printf("%5d", yeniDizi[i]);
		}
	}
	// say� �rneklemi 1 2 3 2 1 6 3 4 5 2
} // Not bu sorunun ��z�m� linearSearh metodu kullan�larak da yap�labilebilinir.
