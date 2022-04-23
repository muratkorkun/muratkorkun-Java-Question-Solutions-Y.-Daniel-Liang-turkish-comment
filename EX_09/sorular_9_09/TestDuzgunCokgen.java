package Bolum09BenimYazdiklarim.sorular_9_09;
/*
 **9.9 (Geometri: n-kenarl� d�zg�n �okgen) n kenarl� d�zg�n �okgen, kenar uzunluklar� ve t�m i� a��lar� ayn� olan �okgendir. (e�kenar ve e� a��l� �okgen). 
 RegularPolygon isimli bir s�n�f tasarlay�n�z.
 �okgenin kenar say�s�n� g�steren n isminde int t�rden bir private veri eleman� (varsay�lan de�eri 3)
 Kenar uzunlu�u i�in side isminde double t�rden bir private veri eleman� (varsay�lan de�eri 1).
 �okgenin merkez koordinat�n�n yatay bile�eni i�in x isminde double t�rden bir private veri eleman� (varsay�lan de�eri 0).
 �okgenin merkez koordinat�n�n dikey bile�eni i�in y isminde double t�rden bir private veri eleman� (varsay�lan de�eri 0).
 Parametresiz constructor varsay�lan de�erlerle bir d�zg�n �okgen yarat�r.
 Kenar say�s� ve kenar uzunlu�u parametreleri ile merkezi (0, 0) olan bir d�zg�n �okgen yaratmak i�in constructor.
 Kenar say�s�, kenar uzunlu�u, x ve y koordinatlar� parametreleri ile bir d�zg�n �okgen yaratmak i�in constructor.
 T�m veri elemanlar� i�in, eri�im metotlar� ile de�i�tiren metotlar� yaz�n�z.
 Geri d�n�� de�eri �okgenin �evresi olan bir getPerimeter() metodu.
 Geri d�n�� de�eri �okgenin alan� olan bir getArea() metodu.
  D�zg�n �okgenin alan�n� hesaplamak i�in kullan�lacak form�l: alan = n*s*s/ 4 * tan (pi/n)
  S�n�f� yazmadan �nce UML �emas�n� �iziniz. Parametresiz constructor ile varsay�lan RegularPolygon (6, 4) ve RegularPolygon (10, 4, 5.6, 7.8) 
  constructorlar�n� kullanarak �� tane RegularPolygon nesnesi yaratan bir test program� yaz�n�z. Her �okgenin alan� ve �evresini g�steriniz.
*/

public class TestDuzgunCokgen {
	public static void main(String[] args) {
		DuzgunCokgen d1 = new DuzgunCokgen();
		DuzgunCokgen d2 = new DuzgunCokgen(6, 4);
		DuzgunCokgen d3 = new DuzgunCokgen(10, 4, 5.6, 7.8);
		
		System.out.printf("Duzgun�okgen 1 alan� %.2f �evresi %.2f\n",d1.getAlan(),d1.getCevre());
		System.out.printf("Duzgun�okgen 2 alan� %.2f �evresi %.2f\n",d2.getAlan(),d2.getCevre());
		System.out.printf("Duzgun�okgen 3 alan� %.2f �evresi %.2f\n",d3.getAlan(),d3.getCevre());
	}
}
