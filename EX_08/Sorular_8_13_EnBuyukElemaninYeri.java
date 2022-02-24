package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_13_EnBuyukElemaninYeri {
	/*
(En büyük elemanýn yeri) Ýki boyutlu bir dizinin en büyük elemanýn indeksini geri döndüren aþaðýdaki bildirime sahip bir metot yazýnýz.

public static int[] locateLargest(double[][] a)

Geri dönüþ deðeri iki elemanlý olan tek boyutlu bir dizidir. Bu iki eleman, iki boyutlu dizinin en büyük elemanýn satýr ve sütun indekslerini belirtir. 
Kullanýcýdan iki boyutlu bir dizi alan ve bu dizinin en büyük elemanýnýn satýr ve sütun indekslerini gösteren bir test programý yazýnýz. Örnek akýþý inceleyiniz:

                   Dizinin satir ve sutun sayisini giriniz: 3 4
                   Diziyi giriniz:

                   23,5  35  2  10
                   4,5  3  45  3,5
                   35  44  5,5  9,6
                   
                   En buyuk elemanin indeksleri (1, 2)
	 */

	public static void main(String args[]) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Lütfen matris satýr ve sutun sayilarýný giriniz");
		
		int satirSayisi=klavye.nextInt();
		int sutunSayisi=klavye.nextInt();
		System.out.print("Lütfen matris deðerlerini giriniz");
		
		double[][] matris=matrisAl(satirSayisi, sutunSayisi, klavye);
			
		int[] enBuyugunKonumu=enBuyugunKonumu(matris);
		
		System.out.print("Girilen matrisde ki en büyük elemanýn indeksleri ("+enBuyugunKonumu[0]+","+enBuyugunKonumu[1]+")");
	}
	
	public static int[] enBuyugunKonumu(double[][] a) {     // Enbuyuk sayýnýn konumunu bulan  ve dizi olarak indeksilerini döndüren metod.
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
	
	public static double[][] matrisAl(int satir, int sutun,Scanner klavye){  // Kullanýcýdan matris alan metod.
		
		double[][] matris=new double[satir][sutun];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}
}
