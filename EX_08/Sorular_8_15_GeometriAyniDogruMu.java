package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_15_GeometriAyniDogruMu {
	/*
(Geometri: ayn� do�ru mu?) Programlama Sorular� 6.39�da �� noktan�n ayn� do�ru �zerinde olup olmad���n� test eden bir metot bulunmaktad�r.
points dizisindeki noktalar�n t�m�n�n ayn� do�ru �zerinde olup olmad���n� test eden a�a��daki bildirime sahip bir metot yaz�n�z.

	public static boolean sameLine(double[][] points)
Kullan�c�dan be� nokta girmesini isteyen ve bu noktalar�n ayn� do�ru �zerinde olup olmad���n� g�steren bir program yaz�n�z. Program�n �rnek ak���n� inceleyiniz:

                   Bes nokta giriniz: 	3,4  2 	 6,5  9,5 	 2,3  2,3 	 5,5  5  	-5  4
                   Bes nokta ayni dogru ustunde degildir
                   Bes nokta giriniz: 	1  1 	 2  2 	 3  3 	 4  4 	 5  5
                   Bes nokta ayni dogru ustundedir
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Be� nokta giriniz :  ");
		double[][] matris=matrisAl(klavye);
		System.out.println(ayniDogruMu(matris)?"B�t�n noktalar ayn� do�ru �zerindedir":"B�t�n noktalar ayn� do�ru �zerinde de�ildir.");
	}
	
	public static double[][] matrisAl(Scanner klavye){
		double[][] matris=new double[5][2];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}
	
	public static boolean ayniDogruMu(double[][] noktalar) {
		for (int i = 2; i < noktalar.length; i++) {
			 if(!dogruUzerindeMi(noktalar[0][0], noktalar[0][1],noktalar[1][0], noktalar[1][1],noktalar[i][0],noktalar[i][1])) {
				 return false;
			 }
		}
		return true;
	}
	public static boolean dogruUzerindeMi(double x0, double y0, double x1, double y1, double x2, double y2) {
		double noktaPozisyon=(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
		return noktaPozisyon==0;
	}
}
