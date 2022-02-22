package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_6_IkiMatrisinCarpimi {
	/*
	 * 
(Cebir: Ýki matrisin çarpýmý) Ýki matrisi çarpýmýný hesaplayan bir metot yazýnýz. Metot bildirimi aþaðýdaki þekildedir;

public static double[][] multiplyMatrix(double[][] a, double[][] b)

a matrisinin b matrisi ile çarpýlabilmesi için a matrisinin sütun sayýsý, b matrisinin satýr sayýsýný eþit olmalý ve elemanlarý ayný ya da birbiriyle uyumlu türlerden olmalýdýr. c sonuç matrisi olsun. a matrisinin sütun sayýsýnýn n olduðunu varsayalým. cij’nin her elemaný ai1 * b1j + ai2 * b2j + c + ain * bnj.

Örneðin iki adet 3 * 3 a ve b matrisi için c :

cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.

Kullanýcýdan iki tane 3*3 boyutunda matris alan ve bu matrislerin çarpýmýný gösteren bir program yazýnýz. Örnek akýþý inceleyiniz:

                   Matris1’i giriniz:  1  2  3  4  5  6  7  8  9

                   Matris2’yi giriniz: 0  2  4  1  4,5  2,2  1,1  4,3  5,2

                   Matrislerin carpimi asagidaki gibidir:

                       1  2  3                0  2.0  4.0                   5.3   23.9   24 .0

                       4  5  6        *       1  4.5  2.2         =        11.  56.3  58.2

                       7  8  9                1.1  4.3  5.2                17.9  88.7  92.4
                       
	 */
	public static void main(String[] args) {
		
		System.out.print("Matris1’i giriniz:");
		
		double[][] matris1=matrisAl();
		
		System.out.print("Matris2’yi giriniz:");
		double[][] matris2=matrisAl();
		
		double[][] matrisCarpimi=matrisCarp(matris1,matris2);
		
		matrisYazdir(matrisCarpimi,matris1,matris2);
		
	}
	
	public static double[][] matrisAl( ) {   // Kullanýcýdan matris alma metodu.
		
		Scanner klavye=new Scanner(System.in);
		
		double[][] matris=new double[3][3];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
		
	}
	
	public static double[][] matrisCarp(double[][] matris1, double[][] matris2) {  // Matrisleri carpma metodu.
		
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int h = 0; h < c.length; h++) {
					c[i][j] += matris1[i][h] * matris2[h][j];
				}
			}
		}
		return c;
	}
	
	public static void matrisYazdir(double[][] matrisCarpim,double[][] matris1,double[][] matris2) {   // Kullanýcýdan alýnan matrisleri ve bnunlarýn carpýmý olan matrisi yazdýran metod.
System.out.print("Matrislerin carpimi aþaðýdaki gibidir : \n");

		for (int i = 0; i < matrisCarpim.length; i++) {
			
			matrisYazdir(matris1, i);
			System.out.print((i == 1 ? "   *   " : "       "));
			
			matrisYazdir(matris2, i);
			
			System.out.print((i == 1 ? "   =   " : "       "));
			matrisYazdir(matrisCarpim, i);
		
			
			System.out.println();
		}
		
	}

	public static void matrisYazdir(double[][] matrisCarpim, int i) {
		for (int j = 0; j < matrisCarpim.length; j++) {
			System.out.printf("%4.1f  ",matrisCarpim[i][j]);
			}
		}
	
}
	
// 							Matris1’i giriniz:  1  2  3  4  5  6  7  8  9
 // 						Matris2’yi giriniz: 0  2  4  1  4,5  2,2  1,1  4,3  5,2

