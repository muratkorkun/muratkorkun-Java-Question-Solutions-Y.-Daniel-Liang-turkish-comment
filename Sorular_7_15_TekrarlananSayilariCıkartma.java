package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_15_TekrarlananSayilariC�kartma {
	
	public static int dizidekiFarkliSayiSayisi(int[] sayiDizisi) {  //Dizideki farkl� say�lar�n say�s�n� bulduk.
		int farkliSayiSayisi = sayiDizisi.length - dizidekiAyniSayiSayisi(sayiDizisi);
		return farkliSayiSayisi;
	}

	public static int[] tekrarlananSayilariCikar (int[] dizi) {          //Bu method ile tekrar etmeyen say�lar� yeni dizimize doldurduk.
		int[] farkliSayilarDizisi=new int[dizidekiFarkliSayiSayisi(dizi)];
		int sayac=0;
		for (int i = 0; i < dizi.length; i++) {
			if(linearSearch(farkliSayilarDizisi, dizi[i]) < 0) { // Burada i�i bo� olan dizinin i�inde, i�i dolu olan dizinin elemanlar� var m� diye kontrol ettik.linearSearch metodu ile e�er -1 yani 0'dan d���k bir de�er bize d�nd�yse bu say� yeni doldurdu�umuz dizinin i�inde yoktur dedik Ve bu de�eri yeni doldurdu�umuz diziye ekledik.
				farkliSayilarDizisi[sayac++]=dizi[i];
			}
		}
		
		
		return farkliSayilarDizisi;
	}

	public static int linearSearch(int[] dizi, int sayi) { // Burada bildi�imiz linearSearch metodunu yazdk.

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == sayi) {
				return i;
			}
		}

		return -1;
	}

	public static int dizidekiAyniSayiSayisi(int[] sayiDizisi) {  // Dizideki ayn� say�lar�n say�s�n� bulduk.
		int ayniSayiSayaci = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = i + 1; j < sayiDizisi.length; j++) {
				if (sayiDizisi[i] == sayiDizisi[j]) {
					ayniSayiSayaci++;
					break;
				}
			}
		}
		return ayniSayiSayaci;
	}
	public static void main(String[] args) {

		System.out.println("L�tfen i�inden tekrar edenlerin ��kart�laca�� 10 adet tam say� giriniz.");
		Scanner klavye = new Scanner(System.in);
		final int DIZI_UZUNLUGU = 10;
		int[] sayiDizisi = new int[DIZI_UZUNLUGU];

		for (int i = 0; i < DIZI_UZUNLUGU; i++) {
			sayiDizisi[i] = klavye.nextInt();
		}

		klavye.close();
		
		int[] yeniDizi=tekrarlananSayilariCikar(sayiDizisi); // Tekrarlanan say�lar�n ��kart�ld��� diziyi yeni bir dizi de�i�kenine atad�k. 
		
		
		for (int i = 0; i < yeniDizi.length; i++) { // Sorunun cecab�n� yazd�rd�k.
			System.out.print(yeniDizi[i]+" ");
		}
	

	}

} // say� �rneklemi 1 2 3 2 1 6 3 4 5 2  linearSearch metodu yerine  esas methoda bir d�ng� daha ilave ederek de ��z�me ula��labilir.
