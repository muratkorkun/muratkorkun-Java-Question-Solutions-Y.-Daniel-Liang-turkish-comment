package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_2_MatrisdekiAnaCaprazinToplami {
	
	/*
(Matristeki ana �aprazlar�n toplam�) double t�rden de�erler tutan n*n  bir matrisin ana �apraz�ndaki de�erlerin toplam�n� hesaplayan, a�a��daki bildirime sahip bir metot yaz�n�z.

public static double sumMajorDiagonal(double[][] m)

4*4 boyutunda bir matrisi okuyan ve ana �apraz�ndaki de�erlerin toplam�n� g�steren bir test program� yaz�n�z. �rnek ak��� inceleyiniz:

                   4x4�luk bir matrisi sira halinde giriniz:

                   1    2    3   4.0

                   5   6.5   7   8

                   9   10  11  12

                  Ana �aprazdaki verilerin toplami 34.5

	 */public static void main(String[] args) {
		 
		 Scanner klavye=new Scanner(System.in);
		 
		 double[][] m=okuDoubleMatrix(klavye, 4, 4);
		
		 System.out.println("Ana �aprazdaki verilerin toplami "+anaCaprazTopla(m));
		 
	}
	public static double anaCaprazTopla(double[][] m) {
		
		double toplam=0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i==j) {
					toplam+=m[i][j];
				}
			}
		}
		return toplam;
	}
	
	public static double[][] okuDoubleMatrix(Scanner klavye,int satirSayisi, int sutunSayisi){
		double[][] matrix=new double[satirSayisi][sutunSayisi];
		System.out.println(" 3x4 bir matrisi sat�r sat�r giriniz");
		
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				matrix[i][j]=klavye.nextDouble();
			}
		}	
		return matrix;
	}
	
}
// ��z�m �rneklemleri
//     			 1   2    3   4,0     
//      		 5   6,5  7   8   
//  			 9   10  11  12
// 				 13  14  15  16

// 			     1   2    3   4,0     5   6,5  7   8    9    10  11  12     13  14  15  16  
