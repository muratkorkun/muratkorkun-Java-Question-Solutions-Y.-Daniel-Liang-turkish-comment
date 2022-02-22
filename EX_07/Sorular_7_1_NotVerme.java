package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_1_NotVerme {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		// ögrenci sayýsýný ve notlarýný alalým
		System.out.println("Lütfen ögrenci sayýsýný giriniz");
		int ogrenciSayisi = klavye.nextInt();

		System.out.println("Lütfen öðrencilerin notlarýný giriniz");
		int[] notlar = new int[ogrenciSayisi];

		for (int i = 0; i < ogrenciSayisi; i++) {

			notlar[i] = klavye.nextInt();
		}
		
		// en iyi notu bulalým
		int enIyiNot = 0;
		for (int i = 0; i < notlar.length; i++) {

			if (enIyiNot < notlar[i]) {
				enIyiNot = notlar[i];
			}
		}
		
		for (int j = 0; j < notlar.length; j++) {
			// notlarýn derece karþýlýklarýný bulalým ve döngü içinde yazdýralým.
			char derece = dereceAl(enIyiNot,notlar[j]);
			System.out.println(j+ ". sýradaki öðrencinin notu : " + notlar[j] + " ve derecesi : " + derece);
		}
	}

	public static char dereceAl(int enIyiNot,int puan) {
		char derece = 0;
		if (puan >= enIyiNot - 10)
			derece = 'A';
		else if (puan >= enIyiNot - 20)
			derece = 'B';
		else if (puan >= enIyiNot - 30)
			derece = 'C';
		else if (puan >= enIyiNot - 40)
			derece = 'D';
		else
			derece = 'F';
		return derece;
	}

}
