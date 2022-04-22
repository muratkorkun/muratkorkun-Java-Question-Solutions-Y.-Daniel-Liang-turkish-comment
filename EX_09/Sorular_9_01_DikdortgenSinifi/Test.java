package Bolum09BenimYazdiklarim.Sorular_9_01_DikdortgenSinifi;
/* 9.1 (Dikd�rtgen s�n�f�) B�l�m 9.2�deki Circle s�n�f� gibi bir dikd�rtgeni temsil eden Rectangle s�n�f� yaz�n�z. Bu s�n�f;

Dikd�rtgenin, en ve boy de�erlerini tutan iki tane double t�rden width and height isimli veri eleman�.  width ve height�in ilk de�eri 1 olsun.
Varsay�lan bir dikd�rtgen yaratan, parametresiz constructor.
Belirtilen width ve height parametreleri ile bir dikd�rtgen yaratan constructor.
Geri d�n�� de�eri dikd�rtgenin alan� olan getArea() metodu.
Geri d�n�� de�eri dikd�rtgenin �evresi olan getPerimeter() metodu.
S�n�f� yazmadan �nce UML �emas�n� �iziniz. Boyu 4, eni 40 ve boyu 3.5, eni 35.9 olan iki tane Rectangle nesnesi yaratan bir program yaz�n�z. Her bir dikd�rtgenin en, boy, alan ve �evresini g�sterin.
*/

public class Test {

	public static void main(String[] args) {
		
		Dikdortgen d1 = new Dikdortgen(40,4);
		Dikdortgen d2 = new Dikdortgen(3.5,35.9);
		
		System.out.println("Dikd�rtgen d1'in eni : "+d1.en+" boyu : "+d1.boy+" �evresi :  "+d1.alCevre()+" alan� : "+d1.alAlan());
		System.out.println("Dikd�rtgen d2'nin eni : "+d2.en+" boyu : "+d2.boy+" �evresi : "+d2.alCevre()+" alan� : "+d2.alAlan());
		

	}

}
