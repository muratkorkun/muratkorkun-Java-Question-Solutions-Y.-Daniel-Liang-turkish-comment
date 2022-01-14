package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_14_ObebHesaplama {

	public static void main(String[] args) {

		System.out.println("L�tfen obebi hesaplanmas� i�in 5 tam say� giriniz");
		Scanner klavye = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = klavye.nextInt();
		}

		klavye.close();

		System.out.println("girilen say� dizisinin ortak b�lenlerinin en b�y��� : " + obebHesapla(numbers));
	}

	public static int obebHesapla(int... numbers) {
		int obeb = 1; // obebi 1 den ba�latt�k.
		int minDeger = min(numbers); // listedeki en k���k degeri belirledik.
		boolean bolenMi; // Dizinin elemanlar�n� b�lebilen bir de�er var m� ? Kontrol ediyoruz.

		// 2 ile girilen minumum de�ere kadar olan de�erler aras�nda ge�i� yap�yoruz.
		for (int i = 2; i <= minDeger; i++) {
		
			bolenMi = true; // bu i degerlerini en ba�ta b�len olarak kabul ediyoruz.
			for (int j : numbers) { // artan b�len de�eri ile ( yani i ile ) dizideki t�m elemanlar�n kalans�z
									// olarak b�l�n�p b�l�nmedi�ini kontrol ediyoruz.
				if (j % i != 0)
					bolenMi = false;// b�l�nemiyorsa false atamas� yap�yoruz.
			}

			if (bolenMi == true) // b�l�n�yorsa ve yeni b�len bulunuyorsa b�len de�erini g�ncelliyoruz.
				obeb = i;
		}

		return obeb;
	}

	// Bir dizi i�indeki minimum de�eri belirleme metodu.
	public static int min(int... numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i])
				min = numbers[i];
		}
		return min;
	}

}
