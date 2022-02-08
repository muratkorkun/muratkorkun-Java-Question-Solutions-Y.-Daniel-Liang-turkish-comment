package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_2_GirilenSayilariTersCevirme {
	/*
	 * 7.2 (Girilen sayýlarý ters çevirme) On tane tam sayý okuyan ve bu sayýlarý okuma sýrasýnýn tersi sýrada gösteren bir program yazýnýz.
	 */

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("Lütfen ters çevrilmesi için 10 tane sayý giriniz");
		int dizi[] = new int[10];
		
		for (int i = 0; i <10; i++) {  // Kullanýcýdan sayýlarý tek tek alýp diziyi doldurduk.
		dizi[i]=klavye.nextInt();
		
		}
		diziyiTersCevir(dizi);       
	}

	public static void diziyiTersCevir(int[] dizi) {    // diziyi ters çevirme metodu yazdýk. Yeni bir diziye sayýlarý ters indisten tek tek atadýk.
		int[] tersDizi=new int[10];
		System.out.print("Girdiðiniz sayýlarýn tersten yazýlýþý : ");
		for (int i = 0,j=9; i <10; i++,j--) {
			tersDizi[i]=dizi[j];
			System.out.print(tersDizi[i]+" ");
		}
	}
}  // Örneklem   0 1 2 3 4 5 6 7 8 9 
