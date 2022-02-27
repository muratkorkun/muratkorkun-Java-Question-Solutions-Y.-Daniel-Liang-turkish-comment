package Bolum08_BenimYazdiklarim;

public class Sorular_8_22_CiftSayida1 {
	/*
	 * 	*8.22 (�ift say�da 1) 6x6 b�y�kl���nde iki boyutlu,  0 ve 1 de�erlerinden olu�an bir matris olu�turup matrisin her sat�r ve s�tununda �ift say�da 1 olup olmad���n� kontrol eden bir program yaz�n�z.
	 */
	public static void main(String args[]) {
		
		int[][] matris=matrisAl(6, 6);
		matrisYazdir(matris);
		boolean[][] satirVeSutunDurumu=satirVeSutunCiftKontrol(matris);
		
		for(int i=0; i < satirVeSutunDurumu.length; i++) {
				if(satirVeSutunDurumu[i][0]) {
					System.out.println("Matrisin "+i+"'inci  sat�r�nda �ift say�da 1 vard�r.");   // Satiri e�er true ise yazd�rd�k.
				}
				if(satirVeSutunDurumu[i][1]) {
					System.out.println("Matrisin "+i+"'inci  s�tununda �ift say�da 1 vard�r.");		// S�tunu e�er true ise yazd�rd�k.
				}
		}
		
	}
	
	public static int[][] matrisAl(int satir,int sutun){
		int[][] matris=new int[satir][sutun];
		
		for(int i=0; i < satir; i++) {
			for(int j=0; j < sutun ; j++) {
				matris[i][j]=(int)(Math.random()*2);
			}
		}
		
		return matris;
	}
	
	public static void matrisYazdir(int[][] matris) {
		for(int i=0; i < matris.length ; i++) {
			for(int j=0; j < matris[i].length; j++) {
				System.out.printf("%3d",matris[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static boolean[][] satirVeSutunCiftKontrol(int[][] matris) {
		boolean[][] satirVeSutunDurumu=new boolean[matris.length][2];
		
		for(int i=0; i < matris.length;i++) {
			int satirBirSayisi=0;
			int sutunBirSayisi=0;
			for(int j=0; j < matris[i].length; j++) {
				if(matris[i][j] == 1) {
					satirBirSayisi++;
				}
				if(matris[j][i] == 1) {
					sutunBirSayisi++;
				}
			}
			if(satirBirSayisi % 2 == 0 && satirBirSayisi != 0) {
				satirVeSutunDurumu[i][0]=true;
			}
			if(sutunBirSayisi % 2 == 0 && sutunBirSayisi != 0) {
				satirVeSutunDurumu[i][1]=true;
			}
		}
		return satirVeSutunDurumu;
	}
	
}
