package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_3_SayilarinTekrarlanmaSayisi {

	public static void main(String[] args) {
/*
		// scanneri acýyoruz.
		Scanner klavye = new Scanner(System.in);

		int[] numbers = new int[100];
		
		DizidekiHarfleriSay.karakterDizisiniYazdir(numbers);

		// kullanýcýdan 1-100 arasý sayýlar girmesini istiyoruz. '0' girerse döngü
		// biter.
		System.out.print("1-100 arasý tam sayýlar giriniz : ");

		int currentNumber = 0;

		// sayý dizisini dolduruyoruz.
		
		do {
			currentNumber = klavye.nextInt();
			if (currentNumber != 0) {
				numbers[currentNumber - 1]++;
			}
		} while (currentNumber != 0);

		// sayý dizisinin elemanlarýnýn kac defa tekrar ettigini baska bir diziye
		// dolduruyoruz.

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				System.out.println(i+1 + " occures "+ numbers[i]+ ((numbers[i]==1) ? " time." : " times."));
			}

		}

		// scanneri kapatýyoruz.
		klavye.close();
		
		*/
		
		Scanner scanner=new Scanner(System.in);
		
		int[] sayiDizisi=new int[10];
		//ilk kullanýcý girdisini alýyoru döngüden önceki
		System.out.println("1 - 100 arasi tam sayilar giriniz:  örnek : 2  5  6  5  4  3  23  43  2  0");
		int girilenSayi=scanner.nextInt();
		//bu i sayýsý dizi için gereken artan öðe olarak yazýldý.
		int i=0;
		// '0' sayýsý girilene kadar tüm elemanlar scanner ile taranýp dizi elemanlarý üzerine yazýlýyor.
		
		while (girilenSayi != 0) {
		sayiDizisi[i]=girilenSayi;
			i++;
			girilenSayi=scanner.nextInt();
		}
		//Dizi elemanlarýný tarayýp karþýlaþtýrma yaparak 1den 100 e kadar olan yenidizideki 0 olan integer elemanlarýn deðerini her kontrolde 1 arttýrýyorum.
		//öncesinde karþýlaþtýrmakiçin diziyi dolduruyorum.
		
		
		int[] sayilariSay =new int[100];
				
		for (int j = 0; j <sayiDizisi.length; j++) {
			if(sayiDizisi[j] != 0) {
				sayilariSay[sayiDizisi[j]-1]++;	
			}
		}
		
		//içindeki indisleri artýrdýgým dizinin indis deðeri 0 dan faklý olan indislerinin deðerlerini tekrar sayýsý olarak ekrana yazdýrýyorum.
		for (int j = 0; j < sayilariSay.length; j++) {
			if(sayilariSay[j] !=0) {
			 
				System.out.println(j+1 +" sayýsý "+ sayilariSay[j]+((sayilariSay[j] ==1 ) ? " kez tekrarlýyor. (tekil)  " : " kez tekrarlýyor. (çogul) "));
			}
		}
		
		
		scanner.close();
	}

}

//   2  5  6  5  4  3  23  43  2  0