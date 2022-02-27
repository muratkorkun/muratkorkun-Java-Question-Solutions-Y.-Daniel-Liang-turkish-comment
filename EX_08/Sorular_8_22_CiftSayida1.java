package Bolum08_BenimYazdiklarim;

public class Sorular_8_22_CiftSayida1 {
	/*
	 * 	*8.22 (Çift sayýda 1) 6x6 büyüklüðünde iki boyutlu,  0 ve 1 deðerlerinden oluþan bir matris oluþturup matrisin her satýr ve sütununda çift sayýda 1 olup olmadýðýný kontrol eden bir program yazýnýz.
	 */
	public static void main(String args[]) {
		
		int[][] matris=matrisAl(6, 6);
		matrisYazdir(matris);
		boolean[][] satirVeSutunDurumu=satirVeSutunCiftKontrol(matris);
		
		for(int i=0; i < satirVeSutunDurumu.length; i++) {
				if(satirVeSutunDurumu[i][0]) {
					System.out.println("Matrisin "+i+"'inci  satýrýnda çift sayýda 1 vardýr.");   // Satiri eðer true ise yazdýrdýk.
				}
				if(satirVeSutunDurumu[i][1]) {
					System.out.println("Matrisin "+i+"'inci  sütununda çift sayýda 1 vardýr.");		// Sütunu eðer true ise yazdýrdýk.
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
