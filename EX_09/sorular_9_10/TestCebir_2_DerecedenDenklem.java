package Bolum09BenimYazdiklarim.sorular_9_10;
/*
 *9.10 (Cebir: ikinci dereceden denklemler) ax2 + bx + x = 0 ikinci dereceden denklemi i�in QuadraticEquation isminde bir s�n�f tasarlay�n�z. Bu s�n�f;
 �� tane katsay� i�in  a, b, ve c isminde private veri eleman�.
 a, b, ve c parametrelerini alan bir constructor.
 a, b, ve c i�in �� tane getter metodu.
 Geri d�n�� de�eri diskriminant (b2 - 4ac) olan getDiscriminant() metodu
 Geri d�n�� de�eri denklemin k�kleri olan getRoot1() ve getRoot2() metotlar�

 Bu metotlar diskriminant de�eri negatif olmad��� durumlarda kullan�l�r. Diskriminant de�eri negatif ise bu metotlar 0 de�eri ile geri d�necekler.

  S�n�f� yazmadan �nce UML �emas�n� �iziniz. Kullan�c�dan a, b, c de�erlerini alan ve diskriminant� hesaplay�p, denklemin sonucunu g�steren bir program yaz�n�z.
  E�er diskriminant pozitifse iki k�k� g�steriniz. E�er diskriminant 0 ise bir k�k� g�steriniz. 
  Aksi takdirde �Denklemin hi�bir ger�ek k�k� yoktur� mesaj�n� g�steriniz.
  �rnek ak�� i�in Programlama Sorular� 3.1�e bak�n�z.
*/
import java.util.Scanner;

public class TestCebir_2_DerecedenDenklem {
	public static void main(String[] args) {
		System.out.println("Diskriminant hesab� yapmak i�in a,b ,c  de�erleri giriniz.");
		Scanner klavye = new Scanner(System.in);

		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();
		Cebir_2_DerecedenDenklem c1 = new Cebir_2_DerecedenDenklem(a, b, c);
		double diskriminant = c1.getDiskriminant();
		if (diskriminant > 0) {
			System.out.printf("Denklemin 2 tane ger�ek k�k� vard�r.\n  K�k 1 : %.6f\n  K�k 2 : %.15f",c1.getKok1(),c1.getKok2());
		} else if (diskriminant == 0) {
			System.out.println("Denklemin 1 tane k�k� vard�r." + c1.getKok1());
		} else {
			System.out.println("Denklemin k�k� yoktur.");
		}
	}
}
/*
	�rneklemler
	 =>	1,0 3 1 (Denklemin iki koku vardir: -0.381966 ve -2.61803)
	 => 1 2,0 1 (Denklemin bir koku vard�r: -1) 
	 => 1 2 3 (Denklemin hicbir gercek koku yoktur.)
 */
