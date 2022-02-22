package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_7_BirbirineEnYakinNoktalar {
	/*
	 * (Birbirine en yak�n noktalar) Madde 8.3�te iki boyutlu uzayda birbirine en
	 * yak�n iki noktay� bulan bir program bulunmaktad�r. Bu program� �� boyutlu
	 * uzayda birbirine en yak�n iki noktay� bulacak �ekilde d�zenleyiniz. Noktalar�
	 * saklamak i�in iki boyutlu bir dizi kullan�n�z. A�a��da verilen noktalar�
	 * kullanarak program�n�z� test ediniz.
	 * 
	 * double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
	 * 
	 * (x1, y1, z1) ve (x2, y2, z2) gibi iki nokta aras�ndaki mesafeyi hesaplamak
	 * i�in 2(x2 - x1)2 + (y2 - y1)2 + (z2 - z1)2 form�l� kullan�labilir.
	 */

	public static void main(String[] args) {

		double[][] noktalar = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};  // x y z koordinatlar� belli olan noktalar�n dizisini ald�k.
		
		int p1 = 0;
		int p2 = 1;
		
		double enKisaMesafe=mesafeBul(noktalar[p1][0], noktalar[p1][1], noktalar[p1][2],	noktalar[p2][0], noktalar[p2][1], noktalar[p2][2]);  // En k�sa mesafeyi ilklendirme yapt�k.

		for (int i = 0; i < noktalar.length - 1; i++) {				// Mesafesi en k�sa olan 3 boyutlu uzayda iki noktay� bulduk.
			for (int j = i + 1; j < noktalar.length; j++) {
				
					double mesafe = mesafeBul(noktalar[i][0], noktalar[i][1], noktalar[i][2], noktalar[j][0], noktalar[j][1], noktalar[j][2]);
					if (enKisaMesafe > mesafe) {
						enKisaMesafe = mesafe;
						p1 = i;
						p2 = j;
				
				}
			}
		}
		System.out.println("Birbirine enyak�n noktalar " + "(" + noktalar[p1][0] + "," + noktalar[p1][1] +","+ noktalar[p1][2]+") and ("
				+ noktalar[p2][0] + "," + noktalar[p2][1] +","+noktalar[p2][2]+ ") \nEn k�sa mesafenin de�eri : " + enKisaMesafe);

	}

	public static double mesafeBul(double x1, double y1,double z1, double x2, double y2,double z2) {  // 3 boyutlu uzayda en k�sa mesafede olan iki noktan�n bulunmas�  form�l� metod i�inde kullan�ld�.
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

}//   -1 0  3            -1 -1 -1          4 1 1           2 0,5 9              3,5 2 -1           3 1,5 3                 -1,5 4 2           5,5  4 -0,5
