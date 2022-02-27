package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_23_OyunTersineCevrilenElemaniBul {
	/*
	 * 		*8.23(Oyun: tersine çevrilen elemaný bul) 6x6 büyüklüðünde iki boyutlu 0 ve 1 deðerlerinden oluþan bir matris olsun. Her satýr ve sütunda çift sayýda 1 deðeri olsun. 
	 * Kullanýcý bir elemaný tersine çevirsin (1’i 0, 0’ý 1 yapsýn). Tersine çevrilen elemaný bulan bir program yazýnýz. 
	 * Kullanýcýdan 6x6 büyüklüðünde 0 ve 1’den oluþan bir matris alan ve çift sayýda 1 kuralýnýn bozulduðu ilk satýr (r) ve ilk sütunu (c)  bulan bir program yazýnýz. Tersine çevrilmiþ eleman (r, c)’dir. Örnek akýþý inceleyiniz:

                  6x6 boyutunda bir matrisi satir satir yaziniz:

                  1  1  1  0  1  1

                  1  1  1  1  0  0

                  0  1  0  1  1  1

                  1  1  1  1  1  1

                  0  1  1  1  1  0

                  1  0  0  0  0  1

                  Tersine cevrilmis eleman (0, 1)´dedir.
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Matris satrý ve sutun sayýsýný giriniz.");
		int satir=klavye.nextInt();
		int sutun=klavye.nextInt();
		System.out.println("Matris deðerlerini giriniz.");
		int[][] matris=matrisAl(klavye, satir, sutun);
		
		int[] satirVeSutun=satirVeSutunCift1Durumu(matris,1);
		System.out.print("Tersine cevrilmis eleman ("+satirVeSutun[0]+","+satirVeSutun[1]+")´dedir.");
		


	}
	
	public static int[][] matrisAl(Scanner klavye,int satir,int sutun){
		int[][] matris=new int[satir][sutun];
		for(int i=0; i < satir; i++) {
			for(int j=0; j < sutun ; j++) {
				matris[i][j]=klavye.nextInt();
			}
		}
		return matris;
	}
	
	public static void matrisYazdir(int[][] matris) {
		for(int i=0; i < matris.length ; i++) {
			for(int j=0; j < matris[i].length; j++) {
				System.out.printf("%4d",matris[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static int[] satirVeSutunCift1Durumu(int[][] matris,int arananSayi) {
		int[] satirVeSutun= {-1,-1};
		
		boolean[][] satirVeSutunDurumu=new boolean[matris.length][2];
		for(int i=0; i < matris.length;i++) {
			int satirBirSayisi=0;
			int sutunBirSayisi=0;
			for(int j=0; j < matris[i].length; j++) {
				if(matris[i][j] == arananSayi) {
					satirBirSayisi++;
				}
				if(matris[j][i] == arananSayi) {
					sutunBirSayisi++;
				}
			}
			if(satirBirSayisi % 2 == 0 && satirBirSayisi != 0) {
				satirVeSutunDurumu[i][0]=true;
			}
			if(sutunBirSayisi % 2 == 0 && sutunBirSayisi != 0) {
				satirVeSutunDurumu[i][1]=true;
			}
			if(!satirVeSutunDurumu[i][0]) {
				satirVeSutun[0]=i;
			}if(!satirVeSutunDurumu[i][1]) {
				satirVeSutun[1]=i;
			}
		}
	
		return satirVeSutun;
	}

}
/*		Doðru konumlu sayýlarýn matrisi.
 * 
 * 			      1  0  1  0  1  1

                  1  1  1  1  0  0

                  0  1  0  1  1  1

                  1  1  1  1  1  1

                  0  1  1  1  1  0

                  1  0  0  0  0  1
                  
                  
                  
                  1  0  1  0  1  1

                  1  1  1  1  0  0

                  0  1  0  1  1  1

                  1  1  1  1  1  1

                  0  1  1  1  0  0

                  1  0  0  0  0  1
 */


		
