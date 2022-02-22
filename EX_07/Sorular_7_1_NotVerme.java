package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_1_NotVerme {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		// �grenci say�s�n� ve notlar�n� alal�m
		System.out.println("L�tfen �grenci say�s�n� giriniz");
		int ogrenciSayisi = klavye.nextInt();

		System.out.println("L�tfen ��rencilerin notlar�n� giriniz");
		int[] notlar = new int[ogrenciSayisi];

		for (int i = 0; i < ogrenciSayisi; i++) {

			notlar[i] = klavye.nextInt();
		}
		
		// en iyi notu bulal�m
		int enIyiNot = 0;
		for (int i = 0; i < notlar.length; i++) {

			if (enIyiNot < notlar[i]) {
				enIyiNot = notlar[i];
			}
		}
		
		for (int j = 0; j < notlar.length; j++) {
			// notlar�n derece kar��l�klar�n� bulal�m ve d�ng� i�inde yazd�ral�m.
			char derece = dereceAl(enIyiNot,notlar[j]);
			System.out.println(j+ ". s�radaki ��rencinin notu : " + notlar[j] + " ve derecesi : " + derece);
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
