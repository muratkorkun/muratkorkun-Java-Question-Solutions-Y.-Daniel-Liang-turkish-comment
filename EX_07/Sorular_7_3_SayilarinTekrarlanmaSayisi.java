package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_3_SayilarinTekrarlanmaSayisi {

	public static void main(String[] args) {
/*
		// scanneri ac�yoruz.
		Scanner klavye = new Scanner(System.in);

		int[] numbers = new int[100];
		
		DizidekiHarfleriSay.karakterDizisiniYazdir(numbers);

		// kullan�c�dan 1-100 aras� say�lar girmesini istiyoruz. '0' girerse d�ng�
		// biter.
		System.out.print("1-100 aras� tam say�lar giriniz : ");

		int currentNumber = 0;

		// say� dizisini dolduruyoruz.
		
		do {
			currentNumber = klavye.nextInt();
			if (currentNumber != 0) {
				numbers[currentNumber - 1]++;
			}
		} while (currentNumber != 0);

		// say� dizisinin elemanlar�n�n kac defa tekrar ettigini baska bir diziye
		// dolduruyoruz.

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				System.out.println(i+1 + " occures "+ numbers[i]+ ((numbers[i]==1) ? " time." : " times."));
			}

		}

		// scanneri kapat�yoruz.
		klavye.close();
		
		*/
		
		Scanner scanner=new Scanner(System.in);
		
		int[] sayiDizisi=new int[10];
		//ilk kullan�c� girdisini al�yoru d�ng�den �nceki
		System.out.println("1 - 100 arasi tam sayilar giriniz:  �rnek : 2  5  6  5  4  3  23  43  2  0");
		int girilenSayi=scanner.nextInt();
		//bu i say�s� dizi i�in gereken artan ��e olarak yaz�ld�.
		int i=0;
		// '0' say�s� girilene kadar t�m elemanlar scanner ile taran�p dizi elemanlar� �zerine yaz�l�yor.
		
		while (girilenSayi != 0) {
		sayiDizisi[i]=girilenSayi;
			i++;
			girilenSayi=scanner.nextInt();
		}
		//Dizi elemanlar�n� taray�p kar��la�t�rma yaparak 1den 100 e kadar olan yenidizideki 0 olan integer elemanlar�n de�erini her kontrolde 1 artt�r�yorum.
		//�ncesinde kar��la�t�rmaki�in diziyi dolduruyorum.
		
		
		int[] sayilariSay =new int[100];
				
		for (int j = 0; j <sayiDizisi.length; j++) {
			if(sayiDizisi[j] != 0) {
				sayilariSay[sayiDizisi[j]-1]++;	
			}
		}
		
		//i�indeki indisleri art�rd�g�m dizinin indis de�eri 0 dan fakl� olan indislerinin de�erlerini tekrar say�s� olarak ekrana yazd�r�yorum.
		for (int j = 0; j < sayilariSay.length; j++) {
			if(sayilariSay[j] !=0) {
			 
				System.out.println(j+1 +" say�s� "+ sayilariSay[j]+((sayilariSay[j] ==1 ) ? " kez tekrarl�yor. (tekil)  " : " kez tekrarl�yor. (�ogul) "));
			}
		}
		
		
		scanner.close();
	}

}

//   2  5  6  5  4  3  23  43  2  0