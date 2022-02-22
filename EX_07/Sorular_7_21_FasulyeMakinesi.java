package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_21_FasulyeMakinesi {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);

		System.out.println("Ka� top atmak istersiniz"); 
		int topSayisi = klavye.nextInt();
		
		System.out.println("L�tfen fas�lye makinesinin ka� b�lmeli olaca��n� giriniz");
		
		int slotSayisi = klavye.nextInt();

		klavye.close();

		fasulyeMakinesi(topSayisi, slotSayisi);   // topSayisini ve slotSayisini alan metodu a�a��da yazd�k.

	}

	public static void fasulyeMakinesi(int topSayisi, int slotSayisi) {
		int[] slotlar = new int[slotSayisi];

		for (int i = 0; i < topSayisi; i++) {    // toplar� tek tek at�yoruz

			String[] topRotasyon = new String[slotSayisi - 1];  //top rotasyon say�s� slot say�s�ndan daima 1 eksik olaca��ndan topRotasyon dizimizin say�s�n� bu �ekilde belirledik. Bu diziyi her bir i� d�ng� �al��madan �nce tur ba��nda s�f�rlad�k.
			double yonlerToplami = 0;       // yonlerToplami'ni a�a��da hesaplad�k ve her yeni top at�ld���nda bu say�y� da s�f�rlad�k.

			for (int j = 0; j < topRotasyon.length; j++) {  // burada rotasyon dizisinin eleman say�s� kadar her bir top i�in rastgele bir rotasyon dizisi olu�turduk.
				double rastgeleYon = Math.random();  // 0-1 aral���nda rastgele bir say� olu�turduk 

				if (rastgeleYon < 0.5) {
					topRotasyon[j] = "sol ";      // Bu say�y� kar��l�k gelen y�ne �evirdik.  Daha sonra rotasyon dizisi i�ine  atad�k.
					yonlerToplami += -0.5;        // Burada  her bir slotun ortadan ne kadar sola  gitti�ini hesaplamak i�in 0.5 de�erini yonlerToplami'ndan ��kartt�k.
				} else {
					topRotasyon[j] = "sag ";
					yonlerToplami += 0.5;            // Burada  her bir slotun ortadan ne kadar sa�a  gitti�ini hesaplamak i�in 0.5 de�erini yonlerToplami'ndan ekledik..
				}
				System.out.print(topRotasyon[j]);   // olu�an rotasyon dizimizi i�erideki  d�ng� i�inden ��kmadan tek tek yazd�rd�k. Yani rotasyon dizisi i�ine, de�eri atama yapar yapmaz hemen ard�ndan ekrana yazd�rd�k.
			}
			slotlar[(int) (yonlerToplami + (0.5 * topRotasyon.length))]++;  // Burada  slotlar dizimizin i�indeki hangi indisin (yani y�nlerToplami'ndan gelen say�) i�ine top d��t���n� hesaplad�k ve uygun indisin say�s�n� 1 art�rd�k. (integer aritmeti�inden faydaland�k.)
			System.out.println();
		}
		
		System.out.print("Slotlar�n i�indeki toplar�n say�s� : ");
		for (int sayi : slotlar) {   // Burada at�lan toplar�n  slotlar dizisinde hangi indislerde birikti�ini ekrana yazd�rarak g�rd�k.
			System.out.print(sayi+" ");
		}
		
		slotlariYazdir(topSayisi, slotlar);

	}

	public static void slotlariYazdir(int topSayisi, int[] slotlar) {
		for (int i = topSayisi; i > 0; i--) {              // Burada sat�r say�s�n�n en fazla at�lan top say�s� kadar olabilece�inden  ve topSayisi kadar d�� d�ng� olu�turduk.
			for (int j = 0; j < slotlar.length; j++) {         // D�� d�ng�y� topSayisi'ndan 0'a kadar d�nderdik. ��nki  d�� d�ng�n�n ilk d�nen de�eri ile i� d�ng�de slotlar dizisinin j'inci eleman�nda(yani slotunda) bu de�er var m� diye kontrol ettik.
				if (i != slotlar[j]) {							// E�er d�� d�ng�den gelen de�er ile slotlar�n j'inci de�eri birbirine e�it de�il ise bo�luk bast�k.
					System.out.print(" ");
				} else {
					System.out.print("O");                 // Aksi halde d�� d�ng�den gelen de�er ile slotlar�n j'inci de�eri birbirine e�it ise bir tane "O" bast�k.  
					slotlar[j]--;							// Ve slotlar�n j'inci de�erini 1 azaltt�k.��nki her sat�rda bir i ve slot[j] kar��la�t�rmas� yap�ld���ndan yazd���m�z de�eri 1 azaltmam�z gerekti.Burada yazd���m�z komut ile alltan ka��nc� sat�rdaki hangi s�tunda doluluk oldu�unu anlam�� olduk.
				}
			}
			System.out.println();           // Sat�r atmalak i�in bo� print komutu.
		}
	}

}    // �rneklem : 50 topu 10 slotlu fasulyemakinesi'ne atal�m. =>  50 10  bu say�lar� konsol ekran�na kopyalay�p entere basarsan�z program tek seferde �al��acakt�r. 
		//�lgin� bir �ekilde bilgisdayarda sim�le etti�imiz galton makineside ger�ek hayattaki galton makinesine benzer sonu�lar veriyor. Ortadaki ve ortaya yak�n slotlar her zaman toplar�n y���ld��� yerler oluyor.
