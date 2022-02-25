package Bolum08_BenimYazdiklarim;

import DersteYazilanKodlar06.RassalKarakter;

public class Sorular_8_18_SatirlariKaristir {
	/*
*8.18 (Sat�rlar� kar��t�r) �ki boyutlu (int) bir dizide sat�rlar� kar��t�ran a�a��daki bildirime sahip bir metot yaz�n�z.

public static void shuffle(int[][] m)

A�a��daki matrisi kar��t�racak bir test program� yaz�n�z:

int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
	 */

	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		
		karistir(m);
		yazdir(m);
	}
	public static void karistir(int[][] m) {   // m dizisinin i inci s�radaki refere etti�i dizileri (yani sat�rlar�) ald�k ve ge�ici bir diziye atad�k.
		int[] gecici=new int[m.length];			// Daha sonra dizi indeksini ge�meyecek �ekilde rastgele �retti�imiz indeks numaras� ile i numaral� diziyi takas ettik.
		for (int i = 0; i < m.length; i++) {	// Yani g�sterdi�i adresleri tutan referanslar� yer de�i�tirdik. 
			int rasssalSayi=(int)(Math.random()*m.length);
			gecici=m[i];
			m[i]=m[rasssalSayi];
			m[rasssalSayi]=gecici;
			
		}
	}
	public static void yazdir(int[][] matris) {		// Diziyi yazdirma metodu.
		for (int i = 0; i < matris.length; i++) {
			if(i==0) {
				System.out.print("{");
			}
			System.out.print("{");
			for (int j = 0; j < matris[i].length; j++) {
				if(j==1) {
					System.out.print(matris[i][j]);
				}
				else {
					System.out.print(matris[i][j]+", ");
				}
			}
			if(i==matris.length-1) {
				System.out.print("}}");
			}else {
				System.out.print("},");
			}
		}
	}

}
