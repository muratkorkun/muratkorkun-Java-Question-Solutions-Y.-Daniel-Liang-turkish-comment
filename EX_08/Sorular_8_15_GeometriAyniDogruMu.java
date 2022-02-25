package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_15_GeometriAyniDogruMu {
	/*
(Geometri: ayný doðru mu?) Programlama Sorularý 6.39’da üç noktanýn ayný doðru üzerinde olup olmadýðýný test eden bir metot bulunmaktadýr.
points dizisindeki noktalarýn tümünün ayný doðru üzerinde olup olmadýðýný test eden aþaðýdaki bildirime sahip bir metot yazýnýz.

	public static boolean sameLine(double[][] points)
Kullanýcýdan beþ nokta girmesini isteyen ve bu noktalarýn ayný doðru üzerinde olup olmadýðýný gösteren bir program yazýnýz. Programýn örnek akýþýný inceleyiniz:

                   Bes nokta giriniz: 	3,4  2 	 6,5  9,5 	 2,3  2,3 	 5,5  5  	-5  4
                   Bes nokta ayni dogru ustunde degildir
                   Bes nokta giriniz: 	1  1 	 2  2 	 3  3 	 4  4 	 5  5
                   Bes nokta ayni dogru ustundedir
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Beþ nokta giriniz :  ");
		double[][] matris=matrisAl(klavye);
		System.out.println(ayniDogruMu(matris)?"Bütün noktalar ayný doðru üzerindedir":"Bütün noktalar ayný doðru üzerinde deðildir.");
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
