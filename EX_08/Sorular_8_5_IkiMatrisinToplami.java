package Bolum08_BenimYazdiklarim;

import java.util.Iterator;
import java.util.Scanner;

public class Sorular_8_5_IkiMatrisinToplami {
	/*
(Cebir: �ki matrisin toplam�) �ki matrisi toplayan bir metot yaz�n�z. Metot bildirimi a�a��daki �ekildedir;

public static double[][] addMatrix(double[][] a, double[][] b)

�ki matrisin toplanabilmesi i�in elemanlar�n�n ayn� boyuta sahip olmas� ve ayn� ya da birbiriyle uyumlu t�rden olmas� gerekir.  c sonu� matrisi olsun. c ij�nin her bir eleman� aij + bij�dir. �rne�in iki tane 3 * 3 a ve b matrisleri i�in c :
Kullan�c�dan iki tane 3*3 boyutunda matris alan ve bu matrislerin toplam�n� g�steren bir program yaz�n�z. �rnek ak��� inceleyiniz:

                   Matris1�i giriniz:  1  2  3  4  5  6  7  8  9

                   Matris2�yi giriniz: 0  2  4  1  4.5  2.2  1.1  4.3  5.2

                   Matrislerin toplami asagidaki gibidir:

                   1,0  2,0  3,0                 0,0  2,0  4,0                    1,0  4,0  7,0

                   4,0  5,0  6,0       +         1,0  4,5  2,2         =          5,0  9,5  8,2

                   7,0  8,0  9,0                 1,1  4,3  5,2                    8,1  12,3  14,2
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.print("Matris1�i giriniz: ");
	
		double[][] x=matrisAl(klavye, 3, 3);
		
		System.out.print("Matris2�i giriniz: ");
		double[][] y=matrisAl(klavye, 3, 3);

		double[][] matrisToplam=matrisTopla(x,y);
		
		yazdir(matrisToplam,x,y);
		
	}
	
	public static double[][] matrisAl(Scanner klavye,int i, int j){
		double[][] matris=new double[i][j];
		
		for (int k = 0; k < matris.length; k++) {
			
			for (int m = 0; m < matris[k].length; m++) {
				matris[k][m]=klavye.nextDouble();
			}
		}
		return matris;
	}
	
	public static double[][] matrisTopla(double[][] x, double[][] y) {
		
		double[][] matrisToplam=new double[x.length][x[0].length];
		
		for (int i = 0; i < matrisToplam.length; i++) {
			
			for (int j = 0; j < matrisToplam[i].length; j++) {
			
				matrisToplam[i][j]=x[i][j]+y[i][j];
			}
		}
		return matrisToplam;
	}
	public static void yazdir(double[][] matrisToplam,double[][] matris1, double[][] matris2) {
		System.out.print("Matrisin toplam� a�a��daki gibidir : \n");
		
		for (int i = 0; i < matrisToplam.length; i++) {
			
				for (int j = 0; j < matris1.length; j++) {
					System.out.print(matris1[i][j]+" ");
					if(j==2 && i!=1) {
						System.out.print("\t\t");
					}
					if(j==2 && i==1) {
						System.out.print("\t+\t");
					}
				}
			
				for (int j = 0; j < matris2.length; j++) {
					System.out.print(matris2[i][j]+" ");
					if(j==2 && i!=1) {
						System.out.print("\t\t");
					}
					if(j==2 && i==1) {
						System.out.print("\t=\t");
					}
					
				}
				
				for (int j = 0; j < matrisToplam.length; j++) {
					System.out.print(matrisToplam[i][j]+" ");
					if(j==2) {
						System.out.print("\t\t");
					}
				}
			System.out.println("");
		}
	}
}//    Matris1 			 1,0  2,0  3,0         4,0  5,0  6,0     7,0  8,0  9,0    
// 	   Matris2			 0,0  2,0  4,0         1,0  4,5  2,2        1,1  4,3  5,2   
																						
																						/*    1,0  4,0  7,0     
																						 *    5,0  9,5  8,2     
																						 *    8,1  12,3  14.2  
																						 *    7,0  8,0  9,0     
																						 */          
