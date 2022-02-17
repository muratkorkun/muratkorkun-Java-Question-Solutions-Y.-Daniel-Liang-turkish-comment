package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_2_MatrisdekiAnaCaprazinToplami {
	
	/*
(Matristeki ana çaprazlarýn toplamý) double türden deðerler tutan n*n  bir matrisin ana çaprazýndaki deðerlerin toplamýný hesaplayan, aþaðýdaki bildirime sahip bir metot yazýnýz.

public static double sumMajorDiagonal(double[][] m)

4*4 boyutunda bir matrisi okuyan ve ana çaprazýndaki deðerlerin toplamýný gösteren bir test programý yazýnýz. Örnek akýþý inceleyiniz:

                   4x4’luk bir matrisi sira halinde giriniz:

                   1    2    3   4.0

                   5   6.5   7   8

                   9   10  11  12

                  Ana çaprazdaki verilerin toplami 34.5

	 */public static void main(String[] args) {
		 
		 Scanner klavye=new Scanner(System.in);
		 
		 double[][] m=okuDoubleMatrix(klavye, 4, 4);
		
		 System.out.println("Ana çaprazdaki verilerin toplami "+anaCaprazTopla(m));
		 
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
		System.out.println(" 3x4 bir matrisi satýr satýr giriniz");
		
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = 0; j < sutunSayisi; j++) {
				matrix[i][j]=klavye.nextDouble();
			}
		}	
		return matrix;
	}
	
}
// çözüm örneklemleri
//     			 1   2    3   4,0     
//      		 5   6,5  7   8   
//  			 9   10  11  12
// 				 13  14  15  16

// 			     1   2    3   4,0     5   6,5  7   8    9    10  11  12     13  14  15  16  
