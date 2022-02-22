package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_8_Enyak�nNoktaCiftleri {
	/*
(En yak�n nokta �iftleri) Madde 8.3 FindNearestPoints.java program�n� birbiriyle ayn� ve en yak�n mesafede olan nokta �iftlerini g�sterecek �ekilde yeniden yaz�n�z. �rnek ak��� inceleyiniz:

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
		System.out.println("Ka� adet nokta giriceksiniz ?");
		int noktaSayisi = klavye.nextInt();
		System.out.println("Noktalar� giriniz.");

		double[][] noktalar = new double[noktaSayisi][2];
		for (int i = 0; i < noktalar.length; i++) {

			noktalar[i][0] = klavye.nextDouble();
			noktalar[i][1] = klavye.nextDouble();
		}
		int p1=0;
		int p2=1;
		 //double enKisaMesafe=Double.MAX_VALUE;          En k���k mesafeye opsiyonel olarak en b�y�k de�er verilebilir.
		
		double enKisaMesafe=mesafeBul(noktalar[p1][0],noktalar[p1][1],noktalar[p2][0],noktalar[p2][1]);   // �nce nokta �iftleri aras�ndan en k�sa mesafesi olan nokta �iftini ve en k�sa mesafeyi bulduk.
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
		for (int i = 0; i < noktalar.length-1; i++) {      //  Bulunan en k�sa mesafe hangi noktalar aras�nda bulunuyorsa ko�ulumuza uyan b�t�n nokta �iftlerini ekrana yazd�rd�k.
			for (int j = i+1; j < noktalar.length; j++) {
				double mesafe=mesafeBul(noktalar[i][0],noktalar[i][1],noktalar[j][0],noktalar[j][1]);
				if(mesafe==enKisaMesafe) {
					p1=i;
					p2=j;
					 System.out.println("Birbirine en yak�n iki nokta " +   "(" + noktalar[p1][0] + ", " + noktalar[p1][1] + ") ve (" +
						     noktalar[p2][0] + ", " + noktalar[p2][1] + ")");
				}
			}
		}
		System.out.println("Birbirlerine olan uzakl�klar� : "+enKisaMesafe);
	}
	
	public static double mesafeBul(double x1, double y1, double x2, double y2) {  // �ki nokta aras�ndaki mesafeyi bulan metod.
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	

}//              0 0  1 1  -1 -1  2 2  -2 -2  -3 -3  -4 -4  5 5
