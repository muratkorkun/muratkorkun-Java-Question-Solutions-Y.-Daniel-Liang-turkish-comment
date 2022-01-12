package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_5_BirbirindenFarkliSayilariGoster {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in); //Scanner s�n�f�ndan klavye nesnemizi olu�turuyoruz
		

		System.out.println("On sayi giriniz"); // Kullan�c�dan 10 adet say� girmesini istedi�imiz String'i ekrana bast�r�yoruz
		

		int girilenSayi = 0; //Girilen say� de�i�kenimize ilklendirme yap�yoruz.
		

		int sayac = 1; //Sayac�m�z� 1 den ba�latmak i�in 1 e e�itledik
		

		int[] sayiDizisi = new int[10]; //Kullan�c�dan alaca��m�z say�lar� tutmak i�in bir dizi olu�turduk.(i�inde varsay�lan olarak 0 dolu �ekilde dizi olu�tu)
		

		for (int i = 0; i < sayiDizisi.length; i++) { //Olu�turdu�umuz dizi uzunlu�unda for d�ng�s�n� ba�latt�k.
			

			girilenSayi = klavye.nextInt(); //Kullan�c�dan d�ng� boyunca 1 adet kullan�c� giri�i yapmas�n� istedik.Kullan�c� girdisini girilenSayi de�i�kenine atad�k.
			

			if (i == 0) { //D�ng�n�n ilk turunda girilenSayi yi say�Dizisi ndeki ilk indise atad�k.
				
				sayiDizisi[i] = girilenSayi;
			}else {
				

				for (int j = 0; j < i+1 ; j++) { //D�ng�n�n ilk turunda de�ilsek d�ng� i�inde bir d�ng� daha ba�latt�k.T�m i d�ng�lerinde j yi kontrol etmemiz gerekti�ini unutmayal�m.
					

					if (sayiDizisi[j] == girilenSayi) { //GirilenSayi n�n de�erinin sayiDizisi i�inde e�i olup olmad���n� kontrol edip e�i varsa j d�ng�s�n� k�ral�m.
						break;
					} else if(sayiDizisi[j] !=girilenSayi && j==i){ //Burada girilenSayi sayiDizisi nin j'inci eleman�na e�it de�ilse ve j d�ng� say�s� i d�ng� say�s�na e�itse(yani d�� d�ng� ve i� d�ng�n�n sonunda dizi'mize say�m�z� ekledik) girilenSayi yi sayiDizisine atad�k.
						sayiDizisi[j] = girilenSayi;
						sayac++;   // Farkl� say� sayacin� art�rd�k.
					}
				}
			}		

		}
		
		System.out.println("Birbirinden farkl� olan sayi adedi : " + sayac); // yazd�rma  i�lemleri
		System.out.print("Farkli sayilar : ");
		for (int i = 0; i < sayiDizisi.length; i++) { // i�inde 0 olmayan say�Dizisi indislerinin de�erlerini ekrana bast�rd�k.
			if (sayiDizisi[i] != 0) {
				System.out.print(sayiDizisi[i] + " ");
			}
		}

	}
}