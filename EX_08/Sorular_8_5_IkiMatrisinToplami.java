package Bolum08_BenimYazdiklarim;

import java.util.Iterator;
import java.util.Scanner;

public class Sorular_8_5_IkiMatrisinToplami {
	/*
(Cebir: Ýki matrisin toplamý) Ýki matrisi toplayan bir metot yazýnýz. Metot bildirimi aþaðýdaki þekildedir;

public static double[][] addMatrix(double[][] a, double[][] b)

Ýki matrisin toplanabilmesi için elemanlarýnýn ayný boyuta sahip olmasý ve ayný ya da birbiriyle uyumlu türden olmasý gerekir.  c sonuç matrisi olsun. c ij’nin her bir elemaný aij + bij’dir. Örneðin iki tane 3 * 3 a ve b matrisleri için c :
Kullanýcýdan iki tane 3*3 boyutunda matris alan ve bu matrislerin toplamýný gösteren bir program yazýnýz. Örnek akýþý inceleyiniz:

                   Matris1’i giriniz:  1  2  3  4  5  6  7  8  9

                   Matris2’yi giriniz: 0  2  4  1  4.5  2.2  1.1  4.3  5.2

                   Matrislerin toplami asagidaki gibidir:

                   1,0  2,0  3,0                 0,0  2,0  4,0                    1,0  4,0  7,0

                   4,0  5,0  6,0       +         1,0  4,5  2,2         =          5,0  9,5  8,2

                   7,0  8,0  9,0                 1,1  4,3  5,2                    8,1  12,3  14,2
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.print("Matris1’i giriniz: ");
	
		double[][] x=matrisAl(klavye, 3, 3);
		
		System.out.print("Matris2’i giriniz: ");
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
		System.out.print("Matrisin toplamý aþaðýdaki gibidir : \n");
		
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
