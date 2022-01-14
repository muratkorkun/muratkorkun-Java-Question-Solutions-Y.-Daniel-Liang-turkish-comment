package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_14_ObebHesaplama {

	public static void main(String[] args) {

		System.out.println("Lütfen obebi hesaplanmasý için 5 tam sayý giriniz");
		Scanner klavye = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = klavye.nextInt();
		}

		klavye.close();

		System.out.println("girilen sayý dizisinin ortak bölenlerinin en büyüðü : " + obebHesapla(numbers));
	}

	public static int obebHesapla(int... numbers) {
		int obeb = 1; // obebi 1 den baþlattýk.
		int minDeger = min(numbers); // listedeki en küçük degeri belirledik.
		boolean bolenMi; // Dizinin elemanlarýný bölebilen bir deðer var mý ? Kontrol ediyoruz.

		// 2 ile girilen minumum deðere kadar olan deðerler arasýnda geçiþ yapýyoruz.
		for (int i = 2; i <= minDeger; i++) {
		
			bolenMi = true; // bu i degerlerini en baþta bölen olarak kabul ediyoruz.
			for (int j : numbers) { // artan bölen deðeri ile ( yani i ile ) dizideki tüm elemanlarýn kalansýz
									// olarak bölünüp bölünmediðini kontrol ediyoruz.
				if (j % i != 0)
					bolenMi = false;// bölünemiyorsa false atamasý yapýyoruz.
			}

			if (bolenMi == true) // bölünüyorsa ve yeni bölen bulunuyorsa bölen deðerini güncelliyoruz.
				obeb = i;
		}

		return obeb;
	}

	// Bir dizi içindeki minimum deðeri belirleme metodu.
	public static int min(int... numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i])
				min = numbers[i];
		}
		return min;
	}

}
