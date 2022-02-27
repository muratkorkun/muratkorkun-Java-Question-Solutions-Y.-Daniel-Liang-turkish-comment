package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_23_OyunTersineCevrilenElemaniBul {
	/*
	 * 		*8.23(Oyun: tersine �evrilen eleman� bul) 6x6 b�y�kl���nde iki boyutlu 0 ve 1 de�erlerinden olu�an bir matris olsun. Her sat�r ve s�tunda �ift say�da 1 de�eri olsun. 
	 * Kullan�c� bir eleman� tersine �evirsin (1�i 0, 0�� 1 yaps�n). Tersine �evrilen eleman� bulan bir program yaz�n�z. 
	 * Kullan�c�dan 6x6 b�y�kl���nde 0 ve 1�den olu�an bir matris alan ve �ift say�da 1 kural�n�n bozuldu�u ilk sat�r (r) ve ilk s�tunu (c)  bulan bir program yaz�n�z. Tersine �evrilmi� eleman (r, c)�dir. �rnek ak��� inceleyiniz:

                  6x6 boyutunda bir matrisi satir satir yaziniz:

                  1  1  1  0  1  1

                  1  1  1  1  0  0

                  0  1  0  1  1  1

                  1  1  1  1  1  1

                  0  1  1  1  1  0

                  1  0  0  0  0  1

                  Tersine cevrilmis eleman (0, 1)�dedir.
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Matris satr� ve sutun say�s�n� giriniz.");
		int satir=klavye.nextInt();
		int sutun=klavye.nextInt();
		System.out.println("Matris de�erlerini giriniz.");
		int[][] matris=matrisAl(klavye, satir, sutun);
		
		int[] satirVeSutun=satirVeSutunCift1Durumu(matris,1);
		System.out.print("Tersine cevrilmis eleman ("+satirVeSutun[0]+","+satirVeSutun[1]+")�dedir.");
		


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
/*		Do�ru konumlu say�lar�n matrisi.
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


		
