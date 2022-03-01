package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_25_MarkovMatrisi {
	/*
*		8.25(Markov matrisi) Her bir eleman� pozitif ve s�tunlar�ndaki de�erlerin toplam� 1 olan , n * n matrise pozitif Markov matrisi denir.
* Bir matrisin, Markov matrisi olup olmad���n� kontrol eden a�a��daki bildirime sahip bir metot yaz�n�z.

public static boolean isMarkovMatrix(double[][] m)
Kullan�c�dan 3*3 boyutunda bir matrisin elemanlar�n� alan ve bunun Markov matrisi olup olmad���n� kontrol eden bir program yaz�n�z. Program�n �rnek ak���n� inceleyiniz:

                    3x3 boyutunda bir matrisi satir satir yaziniz:

                    0,15  0,875  0,375

                    0,55  0,005  0,225

                    0,30  0,12  0,4

                    Bu Markov matrisi


                    3x3 boyutunda bir matrisi satir satir yaziniz:

                    0,95  -0,875  0,375

                    0,65  0,005  0,225

                    0,30  0,22  -0,4

                    Bu Markov matrisi degil
	 */
	
	public static void main(String args[]) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("3x3 boyutunda bir matrisi satir satir yaziniz: ");
		
		double[][] markov=matrisAl(klavye, 3, 3);
		
		System.out.println("Bu markov "+(markovMu(markov, 1)?"matrisidir.":"matrisi de�ildir."));
		
		
	}
	
	public static double[][] matrisAl(Scanner klavye,int satir,int sutun) {
		double[][] markov=new double[satir][sutun];
		int i=0;
		int j;
		while(i < satir) {
			j=0;
			while(j < sutun) {
				markov[i][j]=klavye.nextDouble();
				j++;
			}
			i++;
		}
		return markov;
	}
	
	public static boolean markovMu(double[][] markov,int markovSayisi) {
		int i=0;
		int j;
		double toplam;
		while(i < markov.length) {
			j=0;
			toplam=0;
			while(j < markov[i].length) {
				toplam+=markov[j][i];
				j++;
			}
			if(toplam != markovSayisi) {
				return false;
			}
			i++;
		}
		return true;
	}
}
