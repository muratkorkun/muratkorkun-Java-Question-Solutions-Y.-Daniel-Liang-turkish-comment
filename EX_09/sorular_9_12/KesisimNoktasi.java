package Bolum09BenimYazdiklarim.sorular_9_12;

import java.util.Scanner;
import Bolum09BenimYazdiklarim.sorular_9_11.DogrusalDenklem;// Buraya siz kendi dogrusal denklem s�n�f�n�z� import etmelisiniz.

public class KesisimNoktasi {
	
	public static void main(String[] args) {
		System.out.println("x1, y1, x2, y2, x3, y3, x4 ve y4�u giriniz:.");
		Scanner klavye = new Scanner(System.in);
		double x1 = klavye.nextDouble();
		double y1 = klavye.nextDouble();
		double x2 = klavye.nextDouble();
		double y2 = klavye.nextDouble();
		double x3 = klavye.nextDouble();
		double y3 = klavye.nextDouble();
		double x4 = klavye.nextDouble();
		double y4 = klavye.nextDouble();
		klavye.close();
		/*A�a��daki cramer kural�n�n  form�llerine g�re t�m de�erleri yerine koyup hesapl�yal�m.
		 	ax + by = e
	     	cx + dy = f 
	     	
		a      *x + b      *y = e 
		c      *x + d      *y = f 
		
	   	(y1-y2)*x - (x1-x2)*y = (y1-y2)*x1 - (x1-x2)*y1   a yerine en ba�taki ifade geliyor b yerine i�aretiyle beraber ikinci s�radaki ifade geliyor e yerine e�itli�in sa� taraf� tamemen geliyor.
    	(y3-y4)*x - (x3-x4)*y = (y3-y4)*x3 - (x3-x4)*y3   yukar�daki gibi buradada birbirine e�itlemeler yap�l�yor.
	*/
		double a = (y1-y2);
		double b = -(x1-x2);
		double c = (y3-y4);
		double d = -(x3-x4);
		double e = (y1-y2)*x1 - (x1-x2)*y1;
		double f = (y3-y4)*x3 - (x3-x4)*y3;
		
		DogrusalDenklem d1 = new DogrusalDenklem(a, b, c, d, e, f);
		if (!d1.isSolvable()) {
			System.out.println("�ki dogru birbirine paraleldir.");
		}else {
			System.out.printf("Kesisme noktasi [x=%.2f y=%.2f]",d1.getX(),d1.getY());
		}
	}
}
/*
**9.12 (Geometri: Kesi�im noktas�) �ki do�ru par�as�n�n kesi�ti�ini varsayal�m.
�lk do�ru par�as�n�n u� noktalar� (x1, y1) ve (x2, y2) ve ikinci do�ru par�as�n�n u� noktalar� (x3, y3) ve (x4, y4) olsun. 
Kullan�c�dan d�rt nokta alan ve kesi�im noktas�n� g�steren bir program yaz�n�z.
Programlama Sorular� 3.25�te oldu�u gibi kesi�im noktalar� do�rusal denklem sistemi ��z�lerek bulunabilir. 
Bu denklem sisteminin ��z�m� i�in Programlama Sorular� 9.11�de yazd���n�z LinearEquation s�n�f�n� kullan�n�z.
�rnek ak�� i�in Programlama Sorular� 3.25�e bak�n�z.

    	 x1, y1, x2, y2, x3, y3, x4 ve y4�u giriniz:  2  2  5  -1,0  4,0  2,0  -1,0  -2,0
         Kesisme noktasi (2.88889, 1.1111)

         x1, y1, x2, y2, x3, y3, x4 ve y4�u giriniz:  2  2  7  6,0  4,0  2,0  -1,0  -2,0
         �ki dogru birbirine paraleldir.
         
*/
