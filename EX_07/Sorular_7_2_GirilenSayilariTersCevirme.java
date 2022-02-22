package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_2_GirilenSayilariTersCevirme {
	/*
	 * 7.2 (Girilen say�lar� ters �evirme) On tane tam say� okuyan ve bu say�lar� okuma s�ras�n�n tersi s�rada g�steren bir program yaz�n�z.
	 */

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("L�tfen ters �evrilmesi i�in 10 tane say� giriniz");
		int dizi[] = new int[10];
		
		for (int i = 0; i <10; i++) {  // Kullan�c�dan say�lar� tek tek al�p diziyi doldurduk.
		dizi[i]=klavye.nextInt();
		
		}
		diziyiTersCevir(dizi);       
	}

	public static void diziyiTersCevir(int[] dizi) {    // diziyi ters �evirme metodu yazd�k. Yeni bir diziye say�lar� ters indisten tek tek atad�k.
		int[] tersDizi=new int[10];
		System.out.print("Girdi�iniz say�lar�n tersten yaz�l��� : ");
		for (int i = 0,j=9; i <10; i++,j--) {
			tersDizi[i]=dizi[j];
			System.out.print(tersDizi[i]+" ");
		}
	}
}  // �rneklem   0 1 2 3 4 5 6 7 8 9 
