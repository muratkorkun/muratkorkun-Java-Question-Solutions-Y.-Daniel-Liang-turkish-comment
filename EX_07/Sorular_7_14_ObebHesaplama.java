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
		int minDeger = min(numbers); // listedeki en k���k degeri belirledik. Obeb en k���k 1 en b�y�k min de�eri
										// olabilee�inden yola ��karak a�a��daki algoritmay� yazd�k.
		boolean hepsiniBoluyorMu = true; // Dizinin her eleman�n� tektek i say�s�na b�l�nebiliyor mu ? Kontrol ediyoruz.

		for (int i = 2; i <= minDeger;i++) { // Obebi bulabilmek i�in b�len say�y�n�n (i) b�l�nen her say�y�(number) tek
											// tek kontrol etmesi gerekiyor. Bu nedenle i de�erini sabit tutarak dizi
											// i�indeki b�t�n say�larda i'nin dizideki say�y� b�l�p b�lmedi�ini
											// k�yasl�yoruz.

			for (int number : numbers) { // Bu d�ng�de i i�in say�lar� tek tek kontrol etti�imizde �art�m�za uygun
											// �ekilde bir i de�eri bulunduysa bu de�eri al�p obeb olarak kullan�yoruz.
											// Ta ki i yi min de�erine kadar kontrol ederek bunu yap�yoruz.
				if (number % i == 0) {
					hepsiniBoluyorMu = true; // i say�y� b�l�yorsa boolean kontrol de�erimize true atamas� yap�yoruz.
												// D�ng� sonunda her say� i'ye b�l�n�yorsa de�erimiz true olarak
												// kalacakt�r.
				} else {
					hepsiniBoluyorMu = false; // Aksi halde bir tane say� bile i'ye tam b�l�nm�yorsa kontrol de�erimize
												// false atamas� yap�yoruz.
					break;
				}

			}
			if (hepsiniBoluyorMu == true) {
				obeb = i; // i de�eri min de�erine kadar kontrol edilece�inden ortak b�lenlerin en
							// b�y���n� (obeb) bulmu� olaca��z.
			}
		}
		return obeb; // obeb 1 ve min dahil aral���ndan algoritmam�za uygun herhangi bir say�
						// olabilecektir.
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

}  // dizi �rneklemleri :  6 12 21 9  15  ,   18 12 36 360 480   ,  3 15 48 96 129
