package Bolum09BenimYazdiklarim.sorular_9_10;
/*
 *9.10 (Cebir: ikinci dereceden denklemler) ax2 + bx + x = 0 ikinci dereceden denklemi için QuadraticEquation isminde bir sýnýf tasarlayýnýz. Bu sýnýf;
 Üç tane katsayý için  a, b, ve c isminde private veri elemaný.
 a, b, ve c parametrelerini alan bir constructor.
 a, b, ve c için üç tane getter metodu.
 Geri dönüþ deðeri diskriminant (b2 - 4ac) olan getDiscriminant() metodu
 Geri dönüþ deðeri denklemin kökleri olan getRoot1() ve getRoot2() metotlarý

 Bu metotlar diskriminant deðeri negatif olmadýðý durumlarda kullanýlýr. Diskriminant deðeri negatif ise bu metotlar 0 deðeri ile geri dönecekler.

  Sýnýfý yazmadan önce UML þemasýný çiziniz. Kullanýcýdan a, b, c deðerlerini alan ve diskriminantý hesaplayýp, denklemin sonucunu gösteren bir program yazýnýz.
  Eðer diskriminant pozitifse iki kökü gösteriniz. Eðer diskriminant 0 ise bir kökü gösteriniz. 
  Aksi takdirde “Denklemin hiçbir gerçek kökü yoktur” mesajýný gösteriniz.
  Örnek akýþ için Programlama Sorularý 3.1’e bakýnýz.
*/
import java.util.Scanner;

public class TestCebir_2_DerecedenDenklem {
	public static void main(String[] args) {
		System.out.println("Diskriminant hesabý yapmak için a,b ,c  deðerleri giriniz.");
		Scanner klavye = new Scanner(System.in);

		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();
		Cebir_2_DerecedenDenklem c1 = new Cebir_2_DerecedenDenklem(a, b, c);
		double diskriminant = c1.getDiskriminant();
		if (diskriminant > 0) {
			System.out.printf("Denklemin 2 tane gerçek kökü vardýr.\n  Kök 1 : %.6f\n  Kök 2 : %.15f",c1.getKok1(),c1.getKok2());
		} else if (diskriminant == 0) {
			System.out.println("Denklemin 1 tane kökü vardýr." + c1.getKok1());
		} else {
			System.out.println("Denklemin kökü yoktur.");
		}
	}
}
/*
	Örneklemler
	 =>	1,0 3 1 (Denklemin iki koku vardir: -0.381966 ve -2.61803)
	 => 1 2,0 1 (Denklemin bir koku vardýr: -1) 
	 => 1 2 3 (Denklemin hicbir gercek koku yoktur.)
 */
