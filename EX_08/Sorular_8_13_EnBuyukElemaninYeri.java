package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_13_EnBuyukElemaninYeri {
	/*
(En b�y�k eleman�n yeri) �ki boyutlu bir dizinin en b�y�k eleman�n indeksini geri d�nd�ren a�a��daki bildirime sahip bir metot yaz�n�z.

public static int[] locateLargest(double[][] a)

Geri d�n�� de�eri iki elemanl� olan tek boyutlu bir dizidir. Bu iki eleman, iki boyutlu dizinin en b�y�k eleman�n sat�r ve s�tun indekslerini belirtir. 
Kullan�c�dan iki boyutlu bir dizi alan ve bu dizinin en b�y�k eleman�n�n sat�r ve s�tun indekslerini g�steren bir test program� yaz�n�z. �rnek ak��� inceleyiniz:

                   Dizinin satir ve sutun sayisini giriniz: 3 4
                   Diziyi giriniz:

                   23,5  35  2  10
                   4,5  3  45  3,5
                   35  44  5,5  9,6
                   
                   En buyuk elemanin indeksleri (1, 2)
	 */

	public static void main(String args[]) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("L�tfen matris sat�r ve sutun sayilar�n� giriniz");
		
		int satirSayisi=klavye.nextInt();
		int sutunSayisi=klavye.nextInt();
		System.out.print("L�tfen matris de�erlerini giriniz");
		
		double[][] matris=matrisAl(satirSayisi, sutunSayisi, klavye);
			
		int[] enBuyugunKonumu=enBuyugunKonumu(matris);
		
		System.out.print("Girilen matrisde ki en b�y�k eleman�n indeksleri ("+enBuyugunKonumu[0]+","+enBuyugunKonumu[1]+")");
	}
	
	public static int[] enBuyugunKonumu(double[][] a) {     // Enbuyuk say�n�n konumunu bulan  ve dizi olarak indeksilerini d�nd�ren metod.
		int[] enBuyugunKonumu=new int[2];
		double enBuyuk=a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(enBuyuk < a[i][j]) {
					enBuyugunKonumu[0]=i;
					enBuyugunKonumu[1]=j;
					enBuyuk=a[i][j];
			}
		}
	}
		return enBuyugunKonumu;
	}
	
	public static double[][] matrisAl(int satir, int sutun,Scanner klavye){  // Kullan�c�dan matris alan metod.
		
		double[][] matris=new double[satir][sutun];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}
}
