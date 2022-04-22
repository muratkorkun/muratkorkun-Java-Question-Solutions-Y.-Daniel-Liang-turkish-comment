package Bolum09BenimYazdiklarim.Sorular_9_01_DikdortgenSinifi;
/* 9.1 (Dikdörtgen sýnýfý) Bölüm 9.2’deki Circle sýnýfý gibi bir dikdörtgeni temsil eden Rectangle sýnýfý yazýnýz. Bu sýnýf;

Dikdörtgenin, en ve boy deðerlerini tutan iki tane double türden width and height isimli veri elemaný.  width ve height’in ilk deðeri 1 olsun.
Varsayýlan bir dikdörtgen yaratan, parametresiz constructor.
Belirtilen width ve height parametreleri ile bir dikdörtgen yaratan constructor.
Geri dönüþ deðeri dikdörtgenin alaný olan getArea() metodu.
Geri dönüþ deðeri dikdörtgenin çevresi olan getPerimeter() metodu.
Sýnýfý yazmadan önce UML þemasýný çiziniz. Boyu 4, eni 40 ve boyu 3.5, eni 35.9 olan iki tane Rectangle nesnesi yaratan bir program yazýnýz. Her bir dikdörtgenin en, boy, alan ve çevresini gösterin.
*/

public class Test {

	public static void main(String[] args) {
		
		Dikdortgen d1 = new Dikdortgen(40,4);
		Dikdortgen d2 = new Dikdortgen(3.5,35.9);
		
		System.out.println("Dikdörtgen d1'in eni : "+d1.en+" boyu : "+d1.boy+" çevresi :  "+d1.alCevre()+" alaný : "+d1.alAlan());
		System.out.println("Dikdörtgen d2'nin eni : "+d2.en+" boyu : "+d2.boy+" çevresi : "+d2.alCevre()+" alaný : "+d2.alAlan());
		

	}

}
