package Bolum08_BenimYazdiklarim;

import DersteYazilanKodlar06.RassalKarakter;

public class Sorular_8_18_SatirlariKaristir {
	/*
*8.18 (Satýrlarý karýþtýr) Ýki boyutlu (int) bir dizide satýrlarý karýþtýran aþaðýdaki bildirime sahip bir metot yazýnýz.

public static void shuffle(int[][] m)

Aþaðýdaki matrisi karýþtýracak bir test programý yazýnýz:

int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
	 */

	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		
		karistir(m);
		yazdir(m);
	}
	public static void karistir(int[][] m) {   // m dizisinin i inci sýradaki refere ettiði dizileri (yani satýrlarý) aldýk ve geçici bir diziye atadýk.
		int[] gecici=new int[m.length];			// Daha sonra dizi indeksini geçmeyecek þekilde rastgele ürettiðimiz indeks numarasý ile i numaralý diziyi takas ettik.
		for (int i = 0; i < m.length; i++) {	// Yani gösterdiði adresleri tutan referanslarý yer deðiþtirdik. 
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
