package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_01_SutunToplami {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		double matris[][]=matrisYarat(klavye, 3, 4);  // Matrisin kaç satýr ve sutundan oluþacagýný alan ve girilen double deðerleri alan ve bunlardan dizi döndüren method.
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i + ". sutundaki verilerin toplami " + sutunTopla(matris, i)); // 2 boyutlu dizi alýr ve istenilen sütundaki deðerlerin toplamýný döndürür.
		}
	}

	public static double sutunTopla(double[][] m, int columnIndex) {
		double toplam = 0;
		for (int i = 0; i < m.length; i++) {

			toplam += m[i][columnIndex];
		}
		return toplam;
	}
	
	public static double[][] matrisYarat(Scanner klavye,int satirSayisi, int sutunSayisi){
		double[][] matris=new double[satirSayisi][sutunSayisi];
		System.out.println(" 3x4 bir matrisi satýr satýr giriniz");
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
			
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}
	
} 				    // 				    1,5 2 3 4 
					//					5,5 6 7 8
					// 					9,5 1 3 1
