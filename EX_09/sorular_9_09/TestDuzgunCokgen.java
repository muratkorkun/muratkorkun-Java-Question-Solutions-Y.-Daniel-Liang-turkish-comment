package Bolum09BenimYazdiklarim.sorular_9_09;
/*
 **9.9 (Geometri: n-kenarlý düzgün çokgen) n kenarlý düzgün çokgen, kenar uzunluklarý ve tüm iç açýlarý ayný olan çokgendir. (eþkenar ve eþ açýlý çokgen). 
 RegularPolygon isimli bir sýnýf tasarlayýnýz.
 Çokgenin kenar sayýsýný gösteren n isminde int türden bir private veri elemaný (varsayýlan deðeri 3)
 Kenar uzunluðu için side isminde double türden bir private veri elemaný (varsayýlan deðeri 1).
 Çokgenin merkez koordinatýnýn yatay bileþeni için x isminde double türden bir private veri elemaný (varsayýlan deðeri 0).
 Çokgenin merkez koordinatýnýn dikey bileþeni için y isminde double türden bir private veri elemaný (varsayýlan deðeri 0).
 Parametresiz constructor varsayýlan deðerlerle bir düzgün çokgen yaratýr.
 Kenar sayýsý ve kenar uzunluðu parametreleri ile merkezi (0, 0) olan bir düzgün çokgen yaratmak için constructor.
 Kenar sayýsý, kenar uzunluðu, x ve y koordinatlarý parametreleri ile bir düzgün çokgen yaratmak için constructor.
 Tüm veri elemanlarý için, eriþim metotlarý ile deðiþtiren metotlarý yazýnýz.
 Geri dönüþ deðeri çokgenin çevresi olan bir getPerimeter() metodu.
 Geri dönüþ deðeri çokgenin alaný olan bir getArea() metodu.
  Düzgün çokgenin alanýný hesaplamak için kullanýlacak formül: alan = n*s*s/ 4 * tan (pi/n)
  Sýnýfý yazmadan önce UML þemasýný çiziniz. Parametresiz constructor ile varsayýlan RegularPolygon (6, 4) ve RegularPolygon (10, 4, 5.6, 7.8) 
  constructorlarýný kullanarak üç tane RegularPolygon nesnesi yaratan bir test programý yazýnýz. Her çokgenin alaný ve çevresini gösteriniz.
*/

public class TestDuzgunCokgen {
	public static void main(String[] args) {
		DuzgunCokgen d1 = new DuzgunCokgen();
		DuzgunCokgen d2 = new DuzgunCokgen(6, 4);
		DuzgunCokgen d3 = new DuzgunCokgen(10, 4, 5.6, 7.8);
		
		System.out.printf("Duzgunçokgen 1 alaný %.2f çevresi %.2f\n",d1.getAlan(),d1.getCevre());
		System.out.printf("Duzgunçokgen 2 alaný %.2f çevresi %.2f\n",d2.getAlan(),d2.getCevre());
		System.out.printf("Duzgunçokgen 3 alaný %.2f çevresi %.2f\n",d3.getAlan(),d3.getCevre());
	}
}
