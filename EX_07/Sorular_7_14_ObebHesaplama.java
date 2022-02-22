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
		int minDeger = min(numbers); // listedeki en küçük degeri belirledik. Obeb en küçük 1 en büyük min deðeri
										// olabileeðinden yola çýkarak aðaþýdaki algoritmayý yazdýk.
		boolean hepsiniBoluyorMu = true; // Dizinin her elemanýný tektek i sayýsýna bölünebiliyor mu ? Kontrol ediyoruz.

		for (int i = 2; i <= minDeger;i++) { // Obebi bulabilmek için bölen sayýyýnýn (i) bölünen her sayýyý(number) tek
											// tek kontrol etmesi gerekiyor. Bu nedenle i deðerini sabit tutarak dizi
											// içindeki bütün sayýlarda i'nin dizideki sayýyý bölüp bölmediðini
											// kýyaslýyoruz.

			for (int number : numbers) { // Bu döngüde i için sayýlarý tek tek kontrol ettiðimizde þartýmýza uygun
											// þekilde bir i deðeri bulunduysa bu deðeri alýp obeb olarak kullanýyoruz.
											// Ta ki i yi min deðerine kadar kontrol ederek bunu yapýyoruz.
				if (number % i == 0) {
					hepsiniBoluyorMu = true; // i sayýyý bölüyorsa boolean kontrol deðerimize true atamasý yapýyoruz.
												// Döngü sonunda her sayý i'ye bölünüyorsa deðerimiz true olarak
												// kalacaktýr.
				} else {
					hepsiniBoluyorMu = false; // Aksi halde bir tane sayý bile i'ye tam bölünmüyorsa kontrol deðerimize
												// false atamasý yapýyoruz.
					break;
				}

			}
			if (hepsiniBoluyorMu == true) {
				obeb = i; // i deðeri min deðerine kadar kontrol edileceðinden ortak bölenlerin en
							// büyüðünü (obeb) bulmuþ olacaðýz.
			}
		}
		return obeb; // obeb 1 ve min dahil aralýðýndan algoritmamýza uygun herhangi bir sayý
						// olabilecektir.
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

}  // dizi Örneklemleri :  6 12 21 9  15  ,   18 12 36 360 480   ,  3 15 48 96 129
