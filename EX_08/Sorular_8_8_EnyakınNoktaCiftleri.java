package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_8_EnyakýnNoktaCiftleri {
	/*
(En yakýn nokta çiftleri) Madde 8.3 FindNearestPoints.java programýný birbiriyle ayný ve en yakýn mesafede olan nokta çiftlerini gösterecek þekilde yeniden yazýnýz. Örnek akýþý inceleyiniz:

                       Nokta sayisini yaziniz: 8

                       8 noktayi giriniz:  0 0  1 1  -1 -1  2 2  -2 -2  -3 -3  -4 -4  5 5

                       Birbirine en yakin iki nokta  (0.0, 0.0) ve (1.0, 1.0)

                       Birbirine en yakin iki nokta  (0.0, 0.0) ve (-1.0, -1.0)

                       Birbirine en yakin iki nokta  (1.0, 1.0) ve (2.0, 2.0)

                       Birbirine en yakin iki nokta  (-1.0, -1.0) ve (-2.0, -2.0)

                       Birbirine en yakin iki nokta  (-2.0, -2.0) ve (-3.0, -3.0)  

                       Birbirine en yakin iki nokta  (-3.0, -3.0) ve (-4.0, -4.0)

                       Birbirlerine uzakliklari  1.4142135623730951
	 */
	
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("Kaç adet nokta giriceksiniz ?");
		int noktaSayisi = klavye.nextInt();
		System.out.println("Noktalarý giriniz.");

		double[][] noktalar = new double[noktaSayisi][2];
		for (int i = 0; i < noktalar.length; i++) {

			noktalar[i][0] = klavye.nextDouble();
			noktalar[i][1] = klavye.nextDouble();
		}
		int p1=0;
		int p2=1;
		 //double enKisaMesafe=Double.MAX_VALUE;          En küçük mesafeye opsiyonel olarak en büyük deðer verilebilir.
		
		double enKisaMesafe=mesafeBul(noktalar[p1][0],noktalar[p1][1],noktalar[p2][0],noktalar[p2][1]);   // Önce nokta çiftleri arasýndan en kýsa mesafesi olan nokta çiftini ve en kýsa mesafeyi bulduk.
		for (int i = 0; i < noktalar.length-1; i++) {
			for (int j = i+1; j < noktalar.length; j++) {
				double mesafe=mesafeBul(noktalar[i][0],noktalar[i][1],noktalar[j][0],noktalar[j][1]);
				if(enKisaMesafe > mesafe) {
					enKisaMesafe=mesafe;
					p1=i;
					p2=j;
				}
			}
		}
		for (int i = 0; i < noktalar.length-1; i++) {      //  Bulunan en kýsa mesafe hangi noktalar arasýnda bulunuyorsa koþulumuza uyan bütün nokta çiftlerini ekrana yazdýrdýk.
			for (int j = i+1; j < noktalar.length; j++) {
				double mesafe=mesafeBul(noktalar[i][0],noktalar[i][1],noktalar[j][0],noktalar[j][1]);
				if(mesafe==enKisaMesafe) {
					p1=i;
					p2=j;
					 System.out.println("Birbirine en yakýn iki nokta " +   "(" + noktalar[p1][0] + ", " + noktalar[p1][1] + ") ve (" +
						     noktalar[p2][0] + ", " + noktalar[p2][1] + ")");
				}
			}
		}
		System.out.println("Birbirlerine olan uzaklýklarý : "+enKisaMesafe);
	}
	
	public static double mesafeBul(double x1, double y1, double x2, double y2) {  // Ýki nokta arasýndaki mesafeyi bulan metod.
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	

}//              0 0  1 1  -1 -1  2 2  -2 -2  -3 -3  -4 -4  5 5
