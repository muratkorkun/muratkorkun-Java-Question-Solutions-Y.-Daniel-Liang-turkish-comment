package Bolum08_BenimYazdiklarim;

public class Sorular_8_22_CiftSayida1 {
	/*
	 * 	*8.22 (Çift sayýda 1) 6x6 büyüklüðünde iki boyutlu,  0 ve 1 deðerlerinden oluþan bir matris oluþturup matrisin her satýr ve sütununda çift sayýda 1 olup olmadýðýný kontrol eden bir program yazýnýz.
	 */
	public static void main(String args[]) {
		
		int[][] matris=matrisAl(6, 6);
		matrisYazdir(matris);
		
		boolean satirVeSutunCiftMi=satirVeSutunCift1Durumu(matris, 1);
		System.out.println("Matrisin her satýr ve sütununda çift 1 "+((satirVeSutunCiftMi)?"vardýr.":"yoktur."));
		
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
	
	public static boolean satirVeSutunCift1Durumu(int[][] matris,int arananSayi) {
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
			if(satirVeSutunDurumu[i][0] ==false || satirVeSutunDurumu[i][1] == false) {
				return false;
			}
			
		}
		return true;
	}
	
	
	
}
