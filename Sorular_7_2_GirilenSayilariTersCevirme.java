package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_2_GirilenSayilariTersCevirme {

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("Lütfen ters çevrilmesi için 10 tane sayý giriniz");
		int dizi[] = new int[10];
		
		for (int i = 0; i <10; i++) {
		dizi[i]=klavye.nextInt();
		
		}
	
		diziyiTersCevir(dizi);
		
		

	}
// 0 1 2 3 4 5 6 7 8 9 

	public static void diziyiTersCevir(int[] dizi) {
		int[] tersDizi=new int[10];
		System.out.print("Girdiðiniz sayýlarýn tersten yazýlýþý : ");
		for (int i = 0,j=9; i <10; i++,j--) {
			tersDizi[i]=dizi[j];
			System.out.print(tersDizi[i]+" ");
		}
	}
}
