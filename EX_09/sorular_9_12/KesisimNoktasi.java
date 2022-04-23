package Bolum09BenimYazdiklarim.sorular_9_12;

import java.util.Scanner;
import Bolum09BenimYazdiklarim.sorular_9_11.DogrusalDenklem;// Buraya siz kendi dogrusal denklem sýnýfýnýzý import etmelisiniz.

public class KesisimNoktasi {
	
	public static void main(String[] args) {
		System.out.println("x1, y1, x2, y2, x3, y3, x4 ve y4’u giriniz:.");
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
		/*Aþaðýdaki cramer kuralýnýn  formüllerine göre tüm deðerleri yerine koyup hesaplýyalým.
		 	ax + by = e
	     	cx + dy = f 
	     	
		a      *x + b      *y = e 
		c      *x + d      *y = f 
		
	   	(y1-y2)*x - (x1-x2)*y = (y1-y2)*x1 - (x1-x2)*y1   a yerine en baþtaki ifade geliyor b yerine iþaretiyle beraber ikinci sýradaki ifade geliyor e yerine eþitliðin sað tarafý tamemen geliyor.
    	(y3-y4)*x - (x3-x4)*y = (y3-y4)*x3 - (x3-x4)*y3   yukarýdaki gibi buradada birbirine eþitlemeler yapýlýyor.
	*/
		double a = (y1-y2);
		double b = -(x1-x2);
		double c = (y3-y4);
		double d = -(x3-x4);
		double e = (y1-y2)*x1 - (x1-x2)*y1;
		double f = (y3-y4)*x3 - (x3-x4)*y3;
		
		DogrusalDenklem d1 = new DogrusalDenklem(a, b, c, d, e, f);
		if (!d1.isSolvable()) {
			System.out.println("Ýki dogru birbirine paraleldir.");
		}else {
			System.out.printf("Kesisme noktasi [x=%.2f y=%.2f]",d1.getX(),d1.getY());
		}
	}
}
/*
**9.12 (Geometri: Kesiþim noktasý) Ýki doðru parçasýnýn kesiþtiðini varsayalým.
Ýlk doðru parçasýnýn uç noktalarý (x1, y1) ve (x2, y2) ve ikinci doðru parçasýnýn uç noktalarý (x3, y3) ve (x4, y4) olsun. 
Kullanýcýdan dört nokta alan ve kesiþim noktasýný gösteren bir program yazýnýz.
Programlama Sorularý 3.25’te olduðu gibi kesiþim noktalarý doðrusal denklem sistemi çözülerek bulunabilir. 
Bu denklem sisteminin çözümü için Programlama Sorularý 9.11’de yazdýðýnýz LinearEquation sýnýfýný kullanýnýz.
Örnek akýþ için Programlama Sorularý 3.25’e bakýnýz.

    	 x1, y1, x2, y2, x3, y3, x4 ve y4’u giriniz:  2  2  5  -1,0  4,0  2,0  -1,0  -2,0
         Kesisme noktasi (2.88889, 1.1111)

         x1, y1, x2, y2, x3, y3, x4 ve y4’u giriniz:  2  2  7  6,0  4,0  2,0  -1,0  -2,0
         Ýki dogru birbirine paraleldir.
         
*/
