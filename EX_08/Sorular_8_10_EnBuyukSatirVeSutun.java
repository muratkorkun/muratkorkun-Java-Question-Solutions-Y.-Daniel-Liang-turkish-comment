package Bolum08_BenimYazdiklarim;

public class Sorular_8_10_EnBuyukSatirVeSutun {
	/*
	 * 
	 * *8.10 (En b�y�k sat�r ve s�tun) 4*4 boyutunda bir matrisin elemanlar�na rastgele 0 ya da 1 de�erleri atay�p matrisi ekranda g�steren ve 
	 * en fazla 1 eleman�na sahip ilk sat�r�n ve ilk s�tunun indeksini g�steren bir program yaz�n�z. Program�n �rnek ak���n� inceleyiniz:
				0011
				0011
				1101
				1010
				
				En buyuk satir indeksi: 2
				En buyuk sutun indeksi: 2
	 */

	public static void main(String[] args) {
		int [][] matris=matrisAl(4);     // 4x4 matris yaratt�k.

		for (int[] is : matris) {					// Foreach ile matrisi yazd�rd�k.
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		int[] enDoluSatirVeSutun=enDoluSatirVeSutun(matris);   // Bir �stte yarat�lan matris i�in  en fazla 1 dolu olan ilk  sat�r ve ilk sutununu bulan metodu �a��rd�k.
		
		for (int j = 0; j < enDoluSatirVeSutun.length; j++) {    // Bulunan de�erleri yazd�rd�k.
			System.out.println((j==0 ?"En dolu satir indeksi ":"En dolu sutun indeksi ")+enDoluSatirVeSutun[j]);
		}
	}

	public static int[][]  matrisAl(int kareMatrisDegeri) {
		int[][] matris=new int[kareMatrisDegeri][kareMatrisDegeri];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j]=(int)(Math.random()*2);
			}
		}
		return matris;
	}
	
	public static int[] enDoluSatirVeSutun(int[][] matris) {   
		int[] satirVeSutun=new int[2];								// en fazla 1 i�eren sat�r ve sutun indislerini  tutmak i�in 2 elemanl� bir dizi olu�turduk.
		
		int enDoluBirSatiri=0;
		int enDoluBirSutunu=0;
		
		for (int i = 0; i < matris.length; i++) {						
			int satirSayaci=0;
			int sutunSayaci=0;
			for (int j = 0; j < matris[i].length; j++) {
				if(matris[i][j]==1) {
					satirSayaci++;
				}
				if(matris[j][i]==1) {
					sutunSayaci++;
				}
			}
			
			if(enDoluBirSatiri < satirSayaci) {				//En dolu 1 sat�r�n�n ilkini bulan kodu yazd�k. Gerekli atamalar� yapt�k.
				enDoluBirSatiri=satirSayaci;
				satirVeSutun[0]=i;
				
			}if(enDoluBirSutunu < sutunSayaci) {			// En fazla 1 dolu olan ilk sutunu bulan kodu yazd�k.
				enDoluBirSutunu=sutunSayaci;
				satirVeSutun[1]=i;
			}
		}
		
		return satirVeSutun;				// Metod ile en fazla 1 adet int de�er geri d�nebilece�i i�in 2 elemanl� int dizi d�nderdik.
	}

}
