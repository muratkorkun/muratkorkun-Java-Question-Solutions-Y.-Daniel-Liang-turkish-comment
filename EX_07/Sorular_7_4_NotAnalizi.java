package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_4_NotAnalizi {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		int[] notlar = new int[100];

		int girilenNot = 0;
		int indis = 0;

		System.out.println("Lütfen ögrencilerin notlarýný giriniz.");
		do {
			girilenNot = klavye.nextInt();
			notlar[indis] = girilenNot;
			indis++;
		} while (girilenNot > 0);

		int ortalama = diziOrtalamaBul(notlar);

		System.out.println(ortalama);
		// dizideki tüm elemanlarý tarayarak kac tanesi oratalama üstünde veya eþit veya
		// altýnda bularak yazalým.

		int buyukSayaci = 0;
		int kucukSayaci = 0;
		int esitSayaci = 0;

		for (int i = 0; i < notlar.length; i++) {
			if (notlar[i] > 0) {

				if (notlar[i] < ortalama) {
					kucukSayaci++;
				} else if (notlar[i] > ortalama) {
					buyukSayaci++;
				} else {
					esitSayaci++;
				}
			}
		}

		System.out.println("Girilen notlarýn " + buyukSayaci + " tanesi ortalamanýn üstündedir");
		System.out.println("Girilen notlarýn " + kucukSayaci + " tanesi ortalamanýn altýndadýr");
		System.out.println("Girilen notlarýn " + esitSayaci + " tanesi ortalamaya eþittir.");

		klavye.close();
	}

	public static int diziOrtalamaBul(int[] dizi) {
		double ortalama = 0;

		int degeriSifirOlmayanElemanSayisi = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > 0) {
				ortalama += dizi[i];
				degeriSifirOlmayanElemanSayisi++;
			}
		}

		return (int) (ortalama / degeriSifirOlmayanElemanSayisi);
	}

} // 2 5 6 5 4 3 23 43 2 -1
