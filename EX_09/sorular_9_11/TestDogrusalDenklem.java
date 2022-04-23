package Bolum09BenimYazdiklarim.sorular_9_11;

import java.util.Scanner;
/*
   *9.11 (Cebir: 2 * 2 do�rusal denklem) 2*2 do�rusal denklemler i�in  LinearEquation isminde bir s�n�f tasarlay�n�z.
	Bu s�n�f;
  	a, b, c, d, e, ve f isminde private veri elemanlar�.
  	a, b, c, d, e, ve f parametrelerini alan bir constructor.
  	a, b, c, d, e, ve f veri elemanlar� i�in getter metotlar�
  	ad - bc de�eri 0 de�ilse true geri d�nen isSolvable() metodu.
  	Geri d�n�� de�eri denklemin ��z�m� olan getX() ve getY() metotlar� i�ersin.
  	
	S�n�f� yazmadan �nce UML �emas�n� �iziniz. 
	Kullan�c�dan a, b, c, d, e, f de�erlerini alan ve sonucu g�steren bir program yaz�n�z. 
	E�er, ad - bc 0 ise �Denklemin ��z�m� yoktur!� mesaj�n� g�steriniz.
	�rnek ak�� i�in Programlama Sorular� 3.3�e bak�n�z.
*/
public class TestDogrusalDenklem {
	public static void main(String[] args) {
		System.out.println("a,b,c,d,e,f de�erleri i�in s�ras� ile 6 say� giriniz.");
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
			System.out.println("Denklemin ��z�m� yoktur.");
		}else {
			System.out.println("Denklemin x " + d1.getX() +  " ve " + d1.getY() +" ��z�mleri vard�r");
		}
	}
}
/*		
	    a, b, c, d, e ve f�yi giriniz:  9,0  4,0  3,0  -5,0  -6,0  -21,0  		x=-2 y=3
        a, b, c, d, e ve f�yi giriniz:  1,0  2,0  2,0  4,0  4,0  5,0        Denklemin cozumu yoktur.
*/