package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_2_GirilenSayilariTersCevirme {

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("L�tfen ters �evrilmesi i�in 10 tane say� giriniz");
		int dizi[] = new int[10];
		
		for (int i = 0; i <10; i++) {
		dizi[i]=klavye.nextInt();
		
		}
	
		diziyiTersCevir(dizi);
		
		

	}
// 0 1 2 3 4 5 6 7 8 9 

	public static void diziyiTersCevir(int[] dizi) {
		int[] tersDizi=new int[10];
		System.out.print("Girdi�iniz say�lar�n tersten yaz�l��� : ");
		for (int i = 0,j=9; i <10; i++,j--) {
			tersDizi[i]=dizi[j];
			System.out.print(tersDizi[i]+" ");
		}
	}
}
