package Bolum08_BenimYazdiklarim;

public class Sorular_8_10_EnBuyukSatirVeSutun {
	/*
	 * 
	 * *8.10 (En büyük satýr ve sütun) 4*4 boyutunda bir matrisin elemanlarýna rastgele 0 ya da 1 deðerleri atayýp matrisi ekranda gösteren ve 
	 * en fazla 1 elemanýna sahip ilk satýrýn ve ilk sütunun indeksini gösteren bir program yazýnýz. Programýn örnek akýþýný inceleyiniz:
				0011
				0011
				1101
				1010
				
				En buyuk satir indeksi: 2
				En buyuk sutun indeksi: 2
	 */

	public static void main(String[] args) {
		int [][] matris=matrisAl(4);     // 4x4 matris yarattýk.

		for (int[] is : matris) {					// Foreach ile matrisi yazdýrdýk.
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		int[] enDoluSatirVeSutun=enDoluSatirVeSutun(matris);   // Bir üstte yaratýlan matris için  en fazla 1 dolu olan ilk  satýr ve ilk sutununu bulan metodu çaðýrdýk.
		
		for (int j = 0; j < enDoluSatirVeSutun.length; j++) {    // Bulunan deðerleri yazdýrdýk.
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
		int[] satirVeSutun=new int[2];								// en fazla 1 içeren satýr ve sutun indislerini  tutmak için 2 elemanlý bir dizi oluþturduk.
		
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
			
			if(enDoluBirSatiri < satirSayaci) {				//En dolu 1 satýrýnýn ilkini bulan kodu yazdýk. Gerekli atamalarý yaptýk.
				enDoluBirSatiri=satirSayaci;
				satirVeSutun[0]=i;
				
			}if(enDoluBirSutunu < sutunSayaci) {			// En fazla 1 dolu olan ilk sutunu bulan kodu yazdýk.
				enDoluBirSutunu=sutunSayaci;
				satirVeSutun[1]=i;
			}
		}
		
		return satirVeSutun;				// Metod ile en fazla 1 adet int deðer geri dönebileceði için 2 elemanlý int dizi dönderdik.
	}

}
