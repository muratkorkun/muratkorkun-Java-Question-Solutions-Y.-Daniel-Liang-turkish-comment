package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_25_IkinciDerecedenDenklemCozumu {   // �imdi bu soruda �ncelikle neden methoda de�erleri hesaplanmam�� olan k�kler dizisi parametresini istedi�ini anlayamad�m. Yani k�kleri belli olmadan neden k�kler dizisini almam�z gerekiyor ? 
														//Bu sorunun cevab� sorunun �udur : asl�nda bir method ile bir diziyi al�p tek bir integer de�er bile d�nd�rsen bu method i�inde ald���m�z dizilere yapt���m�z de�i�iklikler uygulan�r.
														// Yani methoda parametre olarak al�nan dizinin kendisi(referans�) de�i�mez fakat i�eri�i de�i�ebilir.Bu de�i�en i�eri�i d�nderdi�imiz int de�er ile ba�da�t�rarak diziyi yazd�rabiliriz.
														//Bu soru �ok zorla(ma) �retilmi� bir soru olmu� ama yinede bir programc�l�k ��rencisine, ��retmek istedikleri �ok �nemli kavramlara de�inilmi�.
	public static void main(String[] args) {

		System.out.println("Denklem k�klerin hesab�n�n yap�lmas� i�in a,b ,c de�erleri giriniz.");
		Scanner klavye = new Scanner(System.in);
		double[] sayilar = new double[3];       // Burada �ncelikle a, b, c de�erlerini tutaca��m�z diziyi olu�turduk.
		double[] kokler = new double[2];		// Burada methoda parametre olarak g�nderece�imiz diziyi olu�turduk. �lklendirme sonucunda dizinin t�m elemanlar� '0'ile dolduruldu.

		for (int i = 0; i < sayilar.length; i++) {    // Burada Scanner ile kullan�c�dan hesaplanacak olan say�lar� al�p diziye doldurduk.
			sayilar[i] = klavye.nextDouble();
		}

		klavye.close();							// Scanner i kapatt�k.

		int kokSayisi = cozIkinciDereceden(sayilar, kokler);			//Method int de�er d�nd��� i�in d�nen de�eri int bir de�i�kene atad�k.Methoda k�k say�s�n�n ve k�klerin hesaplanmas� i�in sayilar dizisini g�nderdik.
																		//Yine methoda k�kler parametresini g�nderip method i�inde bulunan k�k say�s� ile ilintili �ekilde k�kler dizisini doldurduk.
																		//Yani parametre olarak referans�n� ald���m�z k�kler dizisinin i�eri�ini de�i�tirdik.Daha sonra devam eden kod sat�r�m�zda bu de�i�en k�kleri k�k say�s�na uygun olacak �ekilde yazd�rd�k. 

		if (kokSayisi == 0)													//K�klerin say�s� 0 ise gereken �ekilde yazd�rd�k.
			System.out.println("Denklemde hi�bir k�k yoktur.");
		else					
			System.out.printf("Denklemin %d tane ger�ek k�k� vard�r.\n",kokSayisi);
			for (int i = 0; i < kokSayisi; i++) {								// k�klerin say�s� kadar d�ng� ile k�k numaras�n� ve k�k de�erlerini ekrana yazd�rd�k.
				System.out.printf("K�k %d: %.6f\n",(i + 1),kokler[i]);			// Burada yeri gelmi�ken printf komututun nas�l �al��t���ndan bahsedelim. 
									//Temel olarak String i�erisinde yazd�rmam�z gereken her bir de�i�ken i�in yer tutucu olarak tabir edilen % ile ba�l�yan yer tutucular� de�i�kenin t�r�ne uygun �ekilde String i�inde kullan�yoruz.
									//Yer tutuculara kar��l�k gelen de�i�kenleri de, String sonuna ve de�i�ken aralar�na bir virg�l olacak �ekilde s�ra ile yaz�yoruz.
									//Yani yer tutucular String i�erisinde herbir de�i�kene kar��l�k tek tek yaz�l�r ve yer tutucuya kar��l�k gelen b�t�n de�i�kenler String sonunda tek tek virg�l ile ayr�larak yaz�l�r.
									//Ayn� zamanda yer tutucular�n sa��nda solunda istedi�iniz �ekilde String yaz�m�na devam edebilirsiniz. 
									//Yaz�lan komutlar sonunda print komutu �al��t���nda b�t�n de�i�kenler yer tutucular�n yerine ekranda kendini g�sterir.
			}
	}

	public static int cozIkinciDereceden(double[] sayilar, double[] kokler) {  
						// Bu method parametre olarak iki farkl� dizi al�r, referans�n� ald��� dizilerden birinin elemanlar�n� tek tek i�lem yapmak �zere primitive de�i�kenlere kopyalar ve i�lemlerde kullan�r. Not: Referans�nda de�i�iklik yapmaz �ylece b�rak�r.
												//Referans�n� ald��� di�er dizinin i�lemler sonucuna g�re i�eri�ini de�i�tirir. Not : Referans�nda de�i�iklik yapar.
												//Yine i�lemler sonucuna g�re bir int de�eri return eder. 
		double a = sayilar[0];
		double b = sayilar[1];
		double c = sayilar[2];

		int koklerinSayisi = 0;

		double diskriminant = Math.pow(b, 2) - 4 * a * c;									// Programlama al��t�rmalar� 3.1'in ��z�m�nden gereken hesaplamalar al�nm��t�r. 

		if (diskriminant > 0) {																//Bu k�s�mda k�k say�s� bulduk ve k�klerin de�erlerini gereken de�i�kenlere atad�k.
			kokler[0] = (-b + Math.pow(diskriminant, 0.5)) / (2 * a);
			kokler[1] = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
			koklerinSayisi = 2;
		} else if (diskriminant == 0) {
			kokler[0] = -b / (2 * a);
			koklerinSayisi = 1;
		}
		return koklerinSayisi;
	}
} // �rneklemler => 1,0 3 1 (Denklemin iki koku vardir: -0.381966 ve -2.61803) =>	// 1 2,0 1 (Denklemin bir koku vard�r: -1) => 1 2 3 (Denklemin hicbir gercek	// koku yoktur.)
