package Bolum09BenimYazdiklarim.sorular_9_11;

import java.util.Scanner;
/*
   *9.11 (Cebir: 2 * 2 doðrusal denklem) 2*2 doðrusal denklemler için  LinearEquation isminde bir sýnýf tasarlayýnýz.
	Bu sýnýf;
  	a, b, c, d, e, ve f isminde private veri elemanlarý.
  	a, b, c, d, e, ve f parametrelerini alan bir constructor.
  	a, b, c, d, e, ve f veri elemanlarý için getter metotlarý
  	ad - bc deðeri 0 deðilse true geri dönen isSolvable() metodu.
  	Geri dönüþ deðeri denklemin çözümü olan getX() ve getY() metotlarý içersin.
  	
	Sýnýfý yazmadan önce UML þemasýný çiziniz. 
	Kullanýcýdan a, b, c, d, e, f deðerlerini alan ve sonucu gösteren bir program yazýnýz. 
	Eðer, ad - bc 0 ise “Denklemin çözümü yoktur!” mesajýný gösteriniz.
	Örnek akýþ için Programlama Sorularý 3.3’e bakýnýz.
*/
public class TestDogrusalDenklem {
	public static void main(String[] args) {
		System.out.println("a,b,c,d,e,f deðerleri için sýrasý ile 6 sayý giriniz.");
		Scanner klavye = new Scanner(System.in);
		double a = klavye.nextDouble();
		double b = klavye.nextDouble();
		double c = klavye.nextDouble();
		double d = klavye.nextDouble();
		double e = klavye.nextDouble();
		double f = klavye.nextDouble();
		klavye.close();
		DogrusalDenklem d1 = new DogrusalDenklem(a, b, c, d, e, f);
		
		if (!d1.isSolvable()) {
			System.out.println("Denklemin çözümü yoktur.");
		}else {
			System.out.println("Denklemin x " + d1.getX() +  " ve " + d1.getY() +" çözümleri vardýr");
		}
	}
}
/*		
	    a, b, c, d, e ve f’yi giriniz:  9,0  4,0  3,0  -5,0  -6,0  -21,0  		x=-2 y=3
        a, b, c, d, e ve f’yi giriniz:  1,0  2,0  2,0  4,0  4,0  5,0        Denklemin cozumu yoktur.
*/